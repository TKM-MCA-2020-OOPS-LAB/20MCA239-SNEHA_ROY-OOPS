/*Write a program has class Publisher, Book, Literature and Fiction. Read the information 
and print the details of books from either the category, using inheritance.*/


package product;
import java.util.Scanner;

public class Publisher {
	
	String name;
	
	   Publisher(String pname){
		 
		 this.name = pname;
		
	}
	 
	 static class Book extends Publisher {
		 
		 String bookname;

		public Book(String pname,String bname) {
			super(pname);
			
			this.bookname = bname;
		}
	 }
		
		static class Literature extends Book{
			int lnumber;
			String fauthor;

			public Literature(String pname, String bname,int bnumber,String bauthor) {
				super(pname, bname);
				
				this.lnumber = bnumber;
				this.fauthor = bauthor;
				
			}
			void information() {
				
				System.out.println("-----Literature-----");
				System.out.println("NAME  : " +bookname);
				System.out.println("AUTHOR : "+fauthor);
				System.out.println("PUBLISHER : "+name);
				System.out.println("No/PAGES : "+lnumber);
				
				
			}
		
			
		}
		
		static class Fiction extends Book{
			
			int fnumber;
			String fauthor;

			public Fiction(String pname, String bname, int bnumber,String bauthor) {
				super(pname, bname);

			  this.fnumber=bnumber;
			  this.fauthor =bauthor;
			
			}
			
			void display() {
				
				System.out.println("-----Fiction-----");
				System.out.println("NAME  : " +bookname);
				System.out.println("AUTHOR : "+fauthor);
				System.out.println("PUBLISHER : "+name);
				System.out.println("No/PAGES : "+fnumber);
				
		}
		
		
		 
	 }

	public static void main(String[] args) {
		int num;
		int num1;
		int num2;
		int number;
		String bookname;
		String author;
		String name;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("enter the number of books to be inserted  : ");
		
		num = scan.nextInt();
		
		Fiction[] fiction = new Fiction[num];
		Literature[] liter = new Literature[num];
		

				
				System.out.print("enter the number of books to be inserted in literature section : ");
				num1= scan.nextInt();
				for(int i = 0;  i < num1 ;i ++ ) {
					
					System.out.println("--------------------");
				
					System.out.print("NAME  : " );
				
					bookname = scan.next();
				
				
					System.out.print("AUTHOR : ");
				
					author = scan.next();
				
				
					System.out.print("PUBLISHER : ");
				
					name = scan.next();
				
				
					System.out.print("No/PAGES : ");
				
					number = scan.nextInt();
				
				
					liter[i] = new Literature(name,bookname,number,author);
				

				
			}
				
				
				System.out.print("enter the number of books to be inserted in fiction section : ");
				
				num2= scan.nextInt();
				
				for(int i = 0;  i < num2 ;i ++ ) {
					
					System.out.println("--------------------");
					
				
				System.out.print("NAME  : " );
				bookname = scan.next();
				
				System.out.print("AUTHOR : ");
				author = scan.next();
				
				System.out.print("PUBLISHER : ");
				name = scan.next();
				
				System.out.print("No/PAGES : ");
				number = scan.nextInt();
				
				fiction[i] = new Fiction(name,bookname,number,author);
				
			}
			
		

		
		System.out.println("******************************************");
		System.out.println("SELECT YOUR CATOGORY "+"\n"+"select 1 for literature"+"\n"+"select 2 for fiction   : ");
		int key = scan.nextInt();
		
		if(key == 1) {
			for(int i = 0; i< num1; i++) {
			liter[i].information();
			}
		}
			else if (key == 2) {
				for (int i = 0; i < num2; i++) {
					fiction[i].display();
					
				}
			}
			else {
				System.out.println("oops not available");
			
		}
	}

}
