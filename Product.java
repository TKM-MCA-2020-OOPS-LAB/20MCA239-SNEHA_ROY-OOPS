package product;

public class Product {

	int pcode,price;
	String pname;
	public static void main(String[] args) {
		
		        System.out.println("the lowest price among diode ,capacitor and a ic is : ");
		        Product obj1= new Product();
		        Product obj2= new Product();
		        Product obj3= new Product();

		        obj1.pcode=001;
		        obj2.pname="diode";
		        obj3.price=34;

		        obj1.pcode=023;
		        obj2.pname="capacitor";
		        obj3.price=53;

		        obj1.pcode=067;
		        obj2.pname="ic";
		        obj3.price=989;


		        if (obj1.price>obj2.price && obj3.price>obj2.price){
		             System.out.println(" capacitor"+obj2.pcode);
		            
		        }
		        else if (obj1.price>obj3.price && obj2.price>obj3.price){
		            System.out.println("ic ");
		           
		       }
		       else{
		        System.out.println(" diode \n product code:"+obj1.pcode);
		       }
		    }
		

}
