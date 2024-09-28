package Stringseries;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveString {
	
	//remove the duplicates in arrays
	
	
	public static void main(String[] args) {
		
		String str = "Ramaavathram";
		String dummy= "";
		
		for(int i =0 ; i<str.length(); i++) {
			
			char c= str.charAt(i);
			
	     if(dummy.indexOf(c) == -1) {
	    	 dummy=dummy+c;	
	    	 
	     }
	    		 
		}
		System.out.println(dummy);
		
}

}