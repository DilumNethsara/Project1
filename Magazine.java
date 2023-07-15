public class Magazine extends LibraryItem{
	public String issueDate;
	public String publisher;
	
	public Magazine(String title,String itemID,String issueDate,String publisher){
		super(title,itemID);
		this.issueDate=issueDate;
		this.publisher=publisher;
	}
	
	public void displayItemDetails(){
		System.out.println("\ntittle : "+title);
		System.out.println("item ID : "+itemID);
		System.out.println("issue date : "+issueDate);
		System.out.println("publisher : "+publisher);
	}
	
}