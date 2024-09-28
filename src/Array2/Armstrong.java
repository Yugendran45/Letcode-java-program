package Array2;

public class Armstrong {
	
	public static void main(String[] args) {
	 int m = 1234;
	 int n = 0;
	 
	//int numberOfDigits = String.valueOf(m).length();
	 
	 
	while(m != 0) {
	int m1 = m%10;
	n = n+(m1*m1*m1);
    m= m/10;
    System.out.println(n);
	}
	
	
	System.out.println(n);
	}

}
