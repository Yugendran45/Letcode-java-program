package Java_Interview_Question;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Repeating_charactercount {
	
	
	public static void main(String[] args) {
		String s = "aaaaabbbbcccc";
		//output = a5b4c4
		Map<Character,Integer> m = new HashMap<>();
		
		for(int i =0 ;i<s.length(); i++) {
			char c = s.charAt(i);
			if(m.containsKey(c)) {
				Integer integer = m.get(c);
				m.put(c, integer+1);
			}else
				m.put(c, 1);
		}
		StringBuilder sb = new StringBuilder();

		m.forEach((key,value) -> 
		sb.append(key)
		.append(value));
		System.out.println(sb);


				
	}

}
