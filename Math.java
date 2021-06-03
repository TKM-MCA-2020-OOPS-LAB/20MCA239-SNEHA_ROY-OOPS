package graphicspack;
interface shapes{
	void circle(int r);
	 void rectangle (int l,int b );
	 void triangle(int h,int b);
	 void square (int s);
	 void display();
}

 public class Math implements shapes{
	int radius;
	int length;
	int breadth;
	int height;
	int base;
	int side;

	@Override
	public void circle(int r) {
		this.radius = r;
		
		
	}

	@Override
	public void rectangle(int l, int b) {
		this.length =l;
		this.breadth =b;
	}

	@Override
	public void triangle(int h, int b) {
		this.base = b;
		this.height =h;
	
	}

	@Override
	public void square(int s) {
		this.side = s;
		
	}

	@Override
	public void display() {
		System.out.println("Area of given circle is : "+(3.14*radius*radius));
		System.out.println("Area of given rectangle is : "+(2*(length+breadth)));
		System.out.println("Area of given square is : "+(side*side));
		System.out.println("Area of given triangle is : "+(0.5*(base*height)));
		
	}
	
}