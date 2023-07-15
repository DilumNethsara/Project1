public abstract class LibraryItem{
	public String title;
	public String itemID;
	public boolean checkedout;
	
	LibraryItem(String title,String itemID){
		this.title=title;
		this.itemID=itemID;
		this.checkedout=true;
	}
	
	public void checkedOut(){
		if(checkedout)
			System.out.println(title+" checked out");
		else
			System.out.println(title+" is already checked out");
		
	}
	public void checkedIn(){
		if(!checkedout)
			System.out.println(title+" checked in");
		else
			System.out.println(title+" is already checked in");
	}
	public void displayItemDetails(){
		System.out.println("\ntitle: "+title);
		System.out.println("item id: "+itemID);
	}
	
} 