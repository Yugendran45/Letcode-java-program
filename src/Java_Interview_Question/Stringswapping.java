package Java_Interview_Question;

public class Stringswapping {
	
	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "World";
		
		String sam = s;
		s=s1;
		s1=sam;
		
		System.out.println(s);
		System.out.println(s1);
	}

}
