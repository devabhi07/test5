package thredsexample;

//By extending thread class use 

class A extends Thread{
	synchronized public void run()
	{
		System.out.println("A");
	}
	
}
class B extends Thread{
	synchronized public void run()
	{
		System.out.println("B");
	}
	
}
class C extends Thread{
	synchronized public void run()
	{
		System.out.println("c");
	}
	
}


public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A threadA=new A();
		B threadB=new B();
		C threadC=new C();
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		System.out.println("thread A"+threadA.getPriority());
		System.out.println("thread B"+threadB.getPriority());
		System.out.println("thread C"+threadC.getPriority());
	
		threadA.setPriority(8);
		threadB.setPriority(1);
		threadC.setPriority(4);

	}

}
