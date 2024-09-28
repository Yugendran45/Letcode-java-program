package Stringseries;

public class NearPalindrome {
	
	public static void main(String[] args) {
		
//		
		int num=143;
		int rem=0;
		int rev=0;
//		
//		
////		while(num>0) {
////			rem=num%10;
////			rev=(rev*10)+rem;
////			num=num/10;
////		}
////		
////		if(rem==num) {
////			System.out.println("the number is palindrme");
////		}else {
////			System.out.println("its not palindrome");
////		
////		}
////		
		int incre=0;
		int dec=0;
		
		
		 
	for(int i=num+1;i<num ;i++){
		 
		 incre=i;
		 System.out.println(incre);
		 
		 while(incre>0) {
				rem=incre%10;
				rev=(rev*10)+rem;
				incre=incre/10;
			}
			
			if(rev==incre) {
				System.out.println("the number is palindrme");
			}else {
				System.out.println("its not palindrome");
				break;
			
			}
			
				
	}
	
	
	}

}
