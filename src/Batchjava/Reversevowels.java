package Batchjava;

import java.util.Arrays;

public class Reversevowels {
	
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }


	public static void main(String[] args) {
    String s ="yugendran";
    int i=0;
    int j=s.length()-1;
    
    while(i<j) {
    	
    char[] c =s.toCharArray();	
    
    
    if(!isVowel(c[i])) {
    	i++;
    	continue;
    	
    }if(!isVowel(c[j])) {
    	j--;
    	continue;
    }
    	
    char temp = c[i];
      c[i]=c[j];
      c[j]= temp;
      i++;
      j--;
      String str = new String(c);
      System.out.println(str);
      
      
    }
	 
       
	}

}
