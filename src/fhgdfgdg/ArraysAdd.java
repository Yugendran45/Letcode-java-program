package fhgdfgdg;

import java.util.Arrays;

public class ArraysAdd {
	
	public static void main(String[] args) {
		
		String s = "Helo guys";
		for(int i=0 ; i<s.length(); i++) {
			int count =0 ;
			String str ="";
			char c = s.charAt(i);
			for(int j = i+1; j<s.length(); j++) {
				char d = s.charAt(j);
				if(c == d) {
					count++;
					str = str+c;
					
				}
				System.out.println(str+"="+count);
			}
		
			
		}
		
			
	

}
}