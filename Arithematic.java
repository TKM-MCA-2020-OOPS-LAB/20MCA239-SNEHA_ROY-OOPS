/*Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic 
operations. Test the package by implementing all operations on two given numbers */


package arithematicpack;

interface operation{
	
	void add (float num1 ,float  num2);
	void subtract (float num1 , float num2);
	void multiply(float num1, float num2);
	void divide (float num1 , float num2);
	
	
	
}
public class Arithematic implements operation{

	@Override
	public void add(float num1, float num2) {
		System.out.println("Sum = " +(num1+num2));
		
	}

	@Override
	public void subtract(float num1, float num2) {
		System.out.println("Difference = " + (num1 -num2));
		
	}

	@Override
	public void multiply(float num1, float num2) {
		System.out.println("Product = "+(num1*num2));
		
	}

	@Override
	public void divide(float num1, float num2) {
		System.out.println("Division = "+(num1/num2));
		
	}
	
}