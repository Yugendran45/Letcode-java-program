package Stringseries;

public class String_1 {
	
	
	
	public static void main(String[] args) {
		
		String s ="Joly oh jimkana";
		String[] m = s.split("");
		
       int lengthfine = m.length;
       System.out.println(lengthfine);
       
	   int indexofnumber = s.indexOf("j");
	   System.out.println(indexofnumber);
	  int indexoflast = s.lastIndexOf('a');
	  System.out.println(indexoflast);
      String uppercase=	s.toUpperCase();
	 System.out.println(uppercase);
	 String lowercase = uppercase.toLowerCase();
	 System.out.println(lowercase);
	 String replace =s.replace("Joly", "koly");
	 System.out.println(replace);
	 String substring =s.substring(2);
	 System.out.println(substring);
	 
	String startsubstring= s.substring(3, 6);
	System.out.println(startsubstring);
	
	
   for(int i=0 ; i<=s.length(); i++) {
	   char b =s.charAt(i);
	   
		   System.out.println(b);
	   }

	   
	   
	   
	   
   
}
}