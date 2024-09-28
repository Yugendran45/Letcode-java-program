package Arraytypes;



public class Summaaa {

	public static void main(String[] args) {

	String s = "abc";
	String s1 = "abcd";
	
	for(int i = 0 ; i<s1.length();i++) {
		
		char c = s1.charAt(i);
		
		
		if(s.indexOf((c))  == -1){
			System.out.println(c);
			break;
		}
		
			
	}	
	
	}

}
