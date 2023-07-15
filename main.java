public class main{
	public static void main(String args[]){
		
		LibraryItem book1=new book("The Catcher in the Rye","B001","J.D. Salinger", 240);
		LibraryItem book2=new book("To Kill a Mockingbird","B002", "Harper Lee", 281);
		LibraryItem book3=new book("1984","B003","George Orwell",328);
		LibraryItem book4=new book("Pride and Prejudice","B004","Jane Austen",432);
		LibraryItem book5=new book("The Hobbit","B005","J.R.R. Tolkien",320);
		
		LibraryItem mag1=new Magazine("National Geographic","M001","August 2023","National Geographic Society");
		LibraryItem mag2=new Magazine("Time","M002","September 2023","Time USA,LLC");
		LibraryItem mag3=new Magazine("Forbes","M003","June 2023","Forbes Media");
		LibraryItem mag4=new Magazine("Vogue","M004","July 2023","Condé Nast");
		LibraryItem mag5=new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		LibraryMember libm1=new LibraryMember("L001","John Doe");
		LibraryMember libm2=new LibraryMember("L002","Jane Smith");
		LibraryMember libm3=new LibraryMember("L003","David Johnson");
		LibraryMember libm4=new LibraryMember("L004","Sarah Williams");
		LibraryMember libm5=new LibraryMember("L005","Michael Brown");
	
		book1.checkedOut();
		book1.checkedIn();
		
		System.out.println("\nBOOKS:");
		book1.displayItemDetails();
		book2.displayItemDetails();
		book3.displayItemDetails();
		book4.displayItemDetails();
		book5.displayItemDetails();
		
		System.out.println("\nMAGAZINES:");
		mag1.displayItemDetails();
		mag2.displayItemDetails();
		mag3.displayItemDetails();
		mag4.displayItemDetails();
		mag5.displayItemDetails();
		
		System.out.println("\nLIBRARY MEMBERS:");
		libm1.displayMemberDetails();
		libm2.displayMemberDetails();
		libm3.displayMemberDetails();
		libm4.displayMemberDetails();
		libm5.displayMemberDetails();
	}
}