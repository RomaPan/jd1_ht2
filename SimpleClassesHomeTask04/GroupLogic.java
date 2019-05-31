package by.htp.les08.SimpleClassesHomeTask04;

public class GroupLogic {
	
	public void sortByDestination(GroupTrain grTrain) {
		Train temp;
		Train [] sortingList = grTrain.getTrains();
		
		for (int i = 0; i < sortingList.length-1; i++) {
			for (int j = i+1; j < sortingList.length; j++) {
				if (sortingList[i].getDesination().compareTo(sortingList[j].getDesination())>0) {
					temp = sortingList[i];
					sortingList[i] = sortingList[j];
					sortingList[j] = temp;
				}
				if ((sortingList[i].getDesination().compareTo(sortingList[j].getDesination()) == 0)) {
					if (sortingList[i].getDepartureTime().compareTo(sortingList[j].getDepartureTime())>0) {
						temp = sortingList[i];
						sortingList[i] = sortingList[j];
						sortingList[j] = temp;
					}
				}
				
			}
		}
		
	}
	
	public void sortByTrainNumber(GroupTrain grTrain) {
		Train temp;
		Train [] sortingList = grTrain.getTrains();
		
		for (int i = 0; i < sortingList.length-1; i++) {
			for (int j = i+1; j < sortingList.length; j++) {
				if (sortingList[i].getTrainNumber().compareTo(sortingList[j].getTrainNumber())>0) {
					temp = sortingList[i];
					sortingList[i] = sortingList[j];
					sortingList[j] = temp;
				}
				
			}
		}
		
	}
	
	public void selectTrainByNumber(GroupTrain grTrain, String number) {
		
		Train [] selectTrain = grTrain.getTrains();
		
		
		for (int i = 0; i < selectTrain.length; i++) {
			if (selectTrain[i].getTrainNumber().compareTo(number)==0) {
				System.out.println(selectTrain[i].toString());
			}
			}
	}
	
	
}
