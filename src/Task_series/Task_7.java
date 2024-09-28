package Task_series;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
	
		public static void main(String[] args) {
			
			
			Scanner s = new Scanner(System.in);
			String nextLine = s.nextLine();
			System.out.println(nextLine);
			String nextLine2 = s.nextLine();
			System.out.println(nextLine2);
			
			String s1 = nextLine;
			String s2 = nextLine2;
			
			char[] charArray = s1.toCharArray();
			Arrays.sort(charArray);
			char[] charArray2 = s2.toCharArray();
	        Arrays.sort(charArray2);
	        boolean equals = Arrays.equals(charArray, charArray2);
	        
	        if(equals) {
	        	System.out.println("its anagram");
	        }else {
	        	System.out.println("its not anagram");
	        }
		}
	
	}
