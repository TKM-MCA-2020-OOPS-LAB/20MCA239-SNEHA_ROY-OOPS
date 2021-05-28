/*Create classes Student and Sports. Create another class Result inherited from Student and 
Sports. Display the academic and sports score of a student.*/

package product;
import java.util.Scanner;



 public class Student {
	
	 
	 
	String name;
	int roll_no;
	int english;
	int math;
	int computer;
	int science;
	
	public Student(String nam,int roll,int eng,int maths,int comp,int scien) {
		
		this.name = nam;
		this.roll_no=roll;
		this.english  = eng;
		this.math = maths;
		this.computer = comp;
		this.science = scien;
		
	}
 }
	class Sports extends Student{
		
		String marks;

		public Sports(String nam,int roll, int eng, int maths, int comp, int scien,String mark) {
			super(nam,roll, eng, maths, comp, scien);
			
			this.marks = mark;
			
		}
	}
	class Result extends Sports{

			public Result(String nam, int roll, int eng, int maths, int comp, int scien, String mark) {
				
				super(nam, roll,  eng, maths, comp, scien, mark);
				
			}
			
			void display() {
				
				System.out.println(" ------MARKSHEET-------- \n");
				System.out.println("----student information---- \n ");
				System.out.println("   NAME :  " + name);
				System.out.println("   Roll no :  "+roll_no);
				System.out.println("----marks---- \n ");
				System.out.println("academic-----\n ");
				System.out.println("   ENGLISH :  "+english);
				System.out.println("   MATHEMATICS :  "+math);
				System.out.println("   COMPUTER :  "+computer);
				System.out.println("   SCIENCE : "+science);
				int total = (english+math+computer+science)/4;
				System.out.println("TOTAL AVERAGE SECURED  :   "+total+"\n");
				System.out.println("sports---\n");
				System.out.println(" GRADE :  "+marks);
			}
			
		
		
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		int roll_no;
		int english;
		int math;
		int computer;
		int science;
		String marks;
		
		
			
			System.out.println("enter student details-------");
			System.out.print(" Name : ");
			name= scan.next();
			
			System.out.print(" Roll no :  ");
			roll_no = scan.nextInt();
			
		     System.out.println("enter the student score\n");
		    
		     System.out.print(" ENGLISH :  ");
			english = scan.nextInt();
			
			System.out.print(" MATHEMATICS :  ");
			math = scan.nextInt();
			
			System.out.print(" COMPUTER :  ");
			computer= scan.nextInt();
			
			System.out.print(" SCIENCE : ");
			science= scan.nextInt();
			
			
			System.out.print("Sports GRADE : ");
			marks = scan.next();
			
			System.out.println("\n\n");
			
			
		Result remark =  new Result(name,roll_no,english,math,computer,science,marks);
			
		remark.display();
		}

}
