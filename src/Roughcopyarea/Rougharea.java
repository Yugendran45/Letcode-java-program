package Roughcopyarea;

public class Rougharea {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		String s = new String("Automation");
		s=null;
		System.gc();
		Thread.sleep(10000);
		System.out.println("End of the main");
				
		}
	@Override
	protected void finalize() throws Throwable {
	System.out.println("Final method call");	
		
	}

}
