class Hi implements Runnable
{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
		System.out.println("Hi.......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}}

class Hello implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hellllos...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadingUsingInterface {

	public static void main(String[] args) throws InterruptedException {

		Runnable obj1=new Hi();
		Runnable obj2=new Hello();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		Thread.sleep(2000);
		
		t2.start();
		
	}

	}


