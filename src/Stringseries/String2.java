package Stringseries;

public class String2 {
	
	
	public static void main(String[] args) {
		
		String s1 = "abcd";
        String s2 = "abc";
        for (int i = 0; i < s2.length(); i++) {
            if (s1.contains(String.valueOf(s2.charAt(i)))) {
                s1 = s1.replaceFirst(String.valueOf(s2.charAt(i)), "");
            }
        }
        System.out.println(s1);
    }

}