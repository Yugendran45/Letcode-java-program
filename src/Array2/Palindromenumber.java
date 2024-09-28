package Array2;

public class Palindromenumber {
	
	public  void mari(int m) {
	// TODO Auto-generated method stub

	int num = m;
	int rev = 0; 
	int rem = 0;
	
	while(num>0) {
		
		rev =num%10;
		rem=(rem*10)+rev;
		num = num/10;
		
	}
	
	System.out.println(rem);
	
}
	public static void main(String[] args) {
		
		Palindromenumber p = new Palindromenumber();
		p.mari(564);
		
		
	}

}
