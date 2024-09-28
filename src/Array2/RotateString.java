package Array2;

public class RotateString {
	
	public static void main(String[] args) {
		
		String s1="abcde";
	    String s2 ="cdeab";
	    boolean status = false;
	    String s3= s1+s2;
	     int c =s3.indexOf(s2);
	     if(c>4) { 
	      status=true;	 
	     }
	     System.out.println(status);
	     
		
	}

}
