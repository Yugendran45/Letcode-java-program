package Batchjava;

public class StringDuplicateadded {

	public static void main(String[] args) {

		String s = "yugendran";
		int count = 0;
		int constant = 0;
		String str = "AEIOUaeiou";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (str.contains(String.valueOf(c))) {
				count++;

			} else {
				constant++;
			}
		}
		System.out.println("the vowels count is " + count);
		System.out.println("the Constant count is " + constant);

	}	    
	    
}
