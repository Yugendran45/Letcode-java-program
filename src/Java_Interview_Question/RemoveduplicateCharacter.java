package Java_Interview_Question;

import java.util.HashSet;
import java.util.Set;

public class RemoveduplicateCharacter {
	
	
	
	
	//Remove duplicate character
	
	public static void main(String[] args) {
		
		String s ="Grammerar   ";
		
		//Set<Character> s1 = new HashSet<>();
		
		StringBuilder sb = new StringBuilder();
		
	for(int i =0 ; i<s.length(); i++) {
		char c = s.charAt(i);
		
		int index = s.indexOf(c,i+1);
		System.out.println(index);
		if(index ==-1) {
			
		sb.append(c);	
		}
	}
	System.out.println(sb);
	
	}

}
