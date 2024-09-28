package Stringseries;

import java.util.Arrays;

public class Anagramstring {
	
	
	
	public Anagramstring (String text1,String text2) {
		
		  String s1=text1; String s2=text2;
		  
		  boolean b=true;
		  
		  
		  if(s1.length()!=s2.length()) 
		  {
			  System.out.println("conditionfail");
			  b= false;
			  }
		  else {  
		  char a[]=s1.toCharArray();
		  char a1[]=s2.toCharArray();
		  
		  Arrays.sort(a);
		  Arrays.sort(a1);
		  
		  b=Arrays.equals(a, a1);
		  
		   if(b) { 
			  System.out.println("its anagram");
			  }else {
		  System.out.println("its not anagram"); }
		  
		  
		 }
	
		 
				  
	}
	
	
	public static void main(String[] args) {
		
		Anagramstring as = new Anagramstring("polly", "olply");
		
	}
		


}
