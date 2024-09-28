package fhgdfgdg;

public class Privoct {
	
	
	public static void main(String[] args) {
		int a = 8;
		int currentsum = 0;
		int evensum = 0;
		
		
		for(int i=0; i<=a;i++) {
         currentsum = currentsum +i;	
         //currentsum++;
		}
		System.out.println(currentsum);
		
		
		for(int j = a; j >=0; j--) {
			evensum=evensum+j;
			
			if(evensum==currentsum) {
				System.out.println("The number on "+evensum);
				
			}	currentsum=currentsum-j;			
				
			}
			
		
	}

}
