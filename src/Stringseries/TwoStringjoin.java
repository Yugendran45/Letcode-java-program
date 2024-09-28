package Stringseries;

public class TwoStringjoin {
	
	public static void main(String[] args) {
		String s1 = "champ";
		String s2 = "champion";
		int i = 0;
		int j = 0;

		StringBuilder bs = new StringBuilder();

		while (i < s1.length() || j < s2.length()) {

			if (i < s1.length()) {
				bs.append(s1.charAt(i));

				
				
			}
			

		
		if (j < s2.length()) {
			bs.append(s2.charAt(j));
		}
		
		i++;
		j++;

		
	}

		
		System.out.println(bs);
}
}
