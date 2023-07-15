public class book extends LibraryItem{
	public String author;
	public int numPages;
	
	public book(String title,String itemID,String author,int numPages){
		super(title,itemID);
		this.author=author;
		this.numPages=numPages;
	}
	
	public void displayItemDetails(){
		System.out.println("\ntittle : "+title);
		System.out.println("item ID : "+itemID);
		System.out.println("author : "+author);
		System.out.println("number of pages : "+numPages);
	}
	
}