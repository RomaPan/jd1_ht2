package by.htp.les08.SimpleClassesHomeTask04;

import java.util.Arrays;

public class GroupTrain {
	private Train [] trains;
	
	
	public GroupTrain (){
		this.trains = new Train [5];
	}
		
		public void addToGroup(Train newTrain){
			
			for (int i = 0; i<trains.length; i++) {
				if (trains[i] == null) {
					trains[i] = newTrain;
					break;
				}
			} 	
	}

		@Override
		public String toString() {
			return trains[0] + "\n" + trains[1] + "\n" + trains[2] + "\n" + trains[3] + "\n" + trains[4] + "\n" ;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(trains);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			GroupTrain other = (GroupTrain) obj;
			if (!Arrays.equals(trains, other.trains))
				return false;
			return true;
		}

		public Train[] getTrains() {
			return trains;
		}

		public void setTrains(Train[] trains) {
			this.trains = trains;
		}
		
		
		
}
