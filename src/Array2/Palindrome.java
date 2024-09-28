 package Array2;


public class Palindrome {
	
public boolean palll(String s) {
		
		
		String rev="";
	boolean Status = false;
	
	for(int i =s.length()-1; i>=0; i--){
	    rev =rev+ s.charAt(i);
	}
	 if(rev.equalsIgnoreCase(s)) {
		 Status = true;
		 
	 }else
		 Status = false;
	return Status;
	}

 
	public static void main(String[] args) {
		Palindrome p = new Palindrome
				
				
				();
	boolean l =p.palll("madam");
	System.out.println(l);
	

 


}
}