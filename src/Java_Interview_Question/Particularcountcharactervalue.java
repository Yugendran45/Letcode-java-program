package Java_Interview_Question;

public class Particularcountcharactervalue {

	
	public static void main(String[] args) {
		
	  String s ="java is not easy language";
	  
	  char c= 'n';
	  
	  int count=0;
	  
	  
	  for(int i = 0 ; i<s.length();i++) {
		  
		  char as = s.charAt(i);
		  
		  if(c==as) {
			  count++;
			  
		  }
		  
	  }
		System.out.println("The count of value "+ count);
		
	}
	
}
