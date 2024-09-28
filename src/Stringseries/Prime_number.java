package Stringseries;

public class Prime_number {

	
	public static void main(String[] args) {
		
		int m = 12;
		
		boolean status = true;
		
		for(int i = 2 ; i<m ; i++) {
			
			if(m % i == 0) {
				status = false;
				}
			
		}if(status) {
			System.out.println("its prime number");
		}else {
			System.out.println("its not prime number");
		}
		
		
	
	}
}
