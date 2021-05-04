package product;

import java.util.Scanner;
import java.lang.String;

public class CPU {
	int price;
	
	public class Processor{
		
		float num_of_core;
		String manufacture;
		
		void info(float a, String name) {
			
			num_of_core = a;
			manufacture = name;
			
			System.out.println("The processor is with "+ num_of_core + " numbers of core \n name of processor core is "+manufacture);
		}
	}
		static class RAM {
			
			float memory;
			String company;
			
			void pinfo(float b , String com) {
				
				memory =b;
				company = com;
				
				System.out.println("Memory of RAM is : "+ memory +"GB \n the manufacturing company is : "+company);
				
			}
			
		}

	public static void main(String[] args) {
		
		CPU obj = new CPU();
		
		CPU.Processor obj1 = obj.new Processor();
		
		CPU.RAM obj2 = new CPU.RAM();
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the price of the CPU : ");
		
		 obj.price = in.nextInt();
		 
		 System.out.println("enter the number of core : ");
		 
		 float a = in.nextFloat();
		 
		 System.out.println("enter the core : ");
		 
		 String name = in.next();
		 
		 
		 
		 System.out.println("enter the number of memory : ");
		 
		 float b = in.nextInt();
		 
		 System.out.println("enter the name of manufacture : ");
		 
		 String man = in.next();
		 
		 System.out.println("******INFORMATION**********");
		 
		 System.out.println("The price of the CPU is : "+ obj.price);
		 
		 obj1.info(a,name);
		 
		 obj2.pinfo(b, man);
		
		 

	}
	}

