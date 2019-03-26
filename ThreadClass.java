//USING ISALIVE()
public class Threadclass extends Thread
{
	public void run()
	{
		System.out.println("r1 ");
		try {
        		Thread.sleep(500);
    		}
    		catch(InterruptedException ie) { }
       		System.out.println("r2 ");
  	}
	public static void main(String[] args)
	{
		Threadclass t1 = new Threadclass();
		Threadclass t2 = new Threadclass();
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
	}
}


//USING JOIN()
public class Threadclass2 extends Thread
{
	public void run()
   	{
       		System.out.println("r1 ");
       		try {
        		Thread.sleep(500);
    		}catch(InterruptedException ie){ }
       		System.out.println("r2 ");
  	}
	public static void main(String[] args)
	{
		Threadclass2 t1=new Threadclass2();
		Threadclass2 t2=new Threadclass2();
		t1.start();

		try{
  			t1.join();	//Waiting for t1 to finish
		}catch(InterruptedException ie){}

		t2.start();
	}
}
