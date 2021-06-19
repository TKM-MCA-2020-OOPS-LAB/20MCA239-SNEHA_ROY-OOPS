
/*Producer/Consumer using ITC */

package product;

class Industry{
	int num=0;
	boolean valueSet = false;
	public synchronized void put (int num) {
		
		while(valueSet) {
			try {
				wait();
			}
			catch(Exception e) {
			}}
			
			System.out.println("PUT producer : "+num);
			this.num = num;
			valueSet = true;
			notify();
		}
	
	
	public synchronized void get() {
		while(!valueSet) {
			try {
				wait();
			}
			catch(Exception e) {
			}}
			System.out.println(" get consumed "+num);
			valueSet = false;
			notify();
			
		
		
	}}
	

class Producer implements Runnable{

	Industry ind;
	public Producer (Industry ind) {
		this.ind = ind;
		Thread t = new Thread (this,"Producer");
		t.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			ind.put(i++);
			try {
				Thread.sleep(100);}
			catch(Exception e) {
			}
		}
	}
	
}
class Consumer implements Runnable{
	Industry ind;
	public Consumer(Industry ind) {
		this.ind= ind;
		Thread t = new Thread (this,"Consumer");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			ind.get();
			try {
				Thread.sleep(100);
			}
			catch (Exception e) {
		}
	}
	
	}}
	


public class CO4_q7 {
	
	

public static void main (String[] args) {
	Industry ind = new Industry();
	new Producer(ind);
	new Consumer(ind);
	
	
	
}
}
	