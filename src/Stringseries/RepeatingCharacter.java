package Stringseries;

public class RepeatingCharacter {
	
	//remove character
	
	public static void main(String[] args) {
		
		String s="Rajarajan";
       
      
      StringBuilder sb = new StringBuilder();
      
      for(int i=0; i<s.length();i++) {
    	  
    	  char c=s.charAt(i);
    	  int idx=s.indexOf(c,i+1);
    	  
    	  if(idx==-1) {
    		  sb.append(c);
    		  
    	  }
      }
      
     System.out.println(sb);
			
	}	

}
