package fhgdfgdg;

import java.util.LinkedHashMap;
import java.util.Map;

public class Accurancyofletterwithspce {
	
	public static void main(String[] args) {
		
		String s = "java is not simple jjj language";
		//String[] split =s.split(" ");
		String s1 = s.replace(" ", "");
		

		
		Map<Character,Integer> mp = new LinkedHashMap<>();
		
		for(int i=1; i<s1.length(); i++) {
			char c = s.charAt(i);
			 			 
			 if(mp.containsKey(c)) {
				 Integer count =mp.get(c);
				 mp.put(c, count+1);
			 }
			 else {
				 mp.put(c, 1);
			 }
		}
		System.out.println(mp);
	}

}
