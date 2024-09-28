package Stringseries;

public class CountStringcharacter {
	
	public static void main(String[] args) {
		
	
	
	 String s = "Welcome to the testing world";
	 int count =0;
	 
	 for(int i=0; i<s.length();i++) {
		char c = s.charAt(i);
		if(c != ' ') {
			count++;
		}
	 
	 }
	 System.out.println(count);
	
	 }
}
//String s = "Welcome to the testing world";
//int count =0;
//
// String s2 = s.replace(" ", "");
// System.out.println(s2);
// for(int i=0;i<s2.length();i++) {
//	  count++;
// }
//System.out.println(count);
//
