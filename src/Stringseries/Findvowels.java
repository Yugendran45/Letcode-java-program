package Stringseries;

public class Findvowels {
	
	public static void main(String[] args) {
		
		String s ="Allthebestguys";
		int count = 0;
		String vowel = "AEIOUaeiou";
		StringBuilder sbs =new StringBuilder();

		for (int i = 0; i < s.length();i++) {
			char c1 = s.charAt(i); 
			for (int j = 0; j < vowel.length(); j++) {
				char c2 = vowel.charAt(j);
				

			if (s.contains(String.valueOf(vowel.charAt(j)))){
				count++;

			 
			if (count == 0) {
	            sbs.append(s);
			}
			}
			}		}
		System.out.println(sbs);
}
	}

