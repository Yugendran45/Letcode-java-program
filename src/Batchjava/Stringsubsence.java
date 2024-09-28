


package Batchjava;

public class Stringsubsence {
	
	
	
	public static void main(String[] args) {
		//Subsqence 
		String s ="abc";
		String s1="adbgfc";
		int i=0;
		int j=0;
		
		boolean contains = s.contains(s1);
		System.out.println(contains);
		
		
		boolean status = false ;
		
		
		while (j < s1.length()) {
			if (s.charAt(i) == s1.charAt(j)) {
				i++;
				if (i == s.length()) {
					status = true;
					break;
				}
			}
			j++;
		}		
		
		/*
		 * while (j < s1.length()) { if (s.charAt(i) == s1.charAt(j)) { i++; if (i ==
		 * s.length()) { status = true; break; // Break out of the loop if s is found as
		 * a subsequence } } j++; }
		 * 
		 * 
		 */			if(status) {
				System.out.println("its subsqence");
			}else
				System.out.println("its not subsence ");
				
	
	}

}
