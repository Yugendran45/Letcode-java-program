package Array2;

public class Stringreverse {
	
	public static void main(String[] args) {
		 
		String s ="java is not easy languauge";
		String[] sam =s.split("");
		 
		String rev ="";
		for(int i=s.length()-1; i>= 0;i--) {
			char c =s.charAt(i);
			
			rev=rev+c;
		} 
		
		System.out.println(rev);
		}
		
	

}
