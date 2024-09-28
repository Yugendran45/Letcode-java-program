package Stringseries;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateString {
	
	public static void main(String[] args) {
		
		
		/*
		 * String string1 = "abcd"; String string2 = "abcde";
		 * 
		 * 
		 * // Create lists to hold the strings List<String> list1 = new ArrayList<>();
		 * list1.add(string1);
		 * 
		 * List<String> list2 = new ArrayList<>(); list2.add(string2);
		 * 
		 * // Retain only the common elements between list1 and list2
		 * list2.retainAll(list1);
		 * 
		 * // Output the common elements System.out.println("Common elements: " +
		 * list2);
		 */
        
	String s1="abc";
	String s2="abcd";
	for(int i=0;i<s1.length(); i++) {
	if(s2.contains(String.valueOf(s1.charAt(i)))) {
	
	s2=s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
	
	
	}
	
	}
		
	System.out.println(s2);
		
			}
}
			

			


