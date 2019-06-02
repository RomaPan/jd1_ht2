package by.htp.les08.SimpleClassesHomeTask09;




public class Book {

	private int id;
	private String title;
	private String authors;
	private String publisher;
	private int yearPublished;
	private int pageCount;
	private int price;
	private String bindingType;
	
	
	public Book (int id, String title, String authors, String publisher, 
			int yearPublished, int pageCount, int price, String bindingType) {
		
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.pageCount = pageCount;
		this.price = price;
		this.bindingType = bindingType;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthors() {
		return authors;
	}


	public void setAuthors(String authors) {
		this.authors = authors;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getYearPublished() {
		return yearPublished;
	}


	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}


	public int getPageCount() {
		return pageCount;
	}


	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBindingType() {
		return bindingType;
	}


	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + id;
		result = prime * result + pageCount;
		result = prime * result + price;
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublished;
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
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (id != other.id)
			return false;
		if (pageCount != other.pageCount)
			return false;
		if (price != other.price)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return " [" + id + ", " + title + ", " + authors + ", " + publisher
				+ ", " + yearPublished + ", " + pageCount + ", " + price
				+ ", " + bindingType + "]";
	}
	
	
	
}
