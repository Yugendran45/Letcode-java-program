package Batchjava;

public class FindVowel {
	
	public static void main(String[] args) {
		
		String s = "yugendran";
		String s1="aeiou";
        String s2= s.replaceAll("[AEIOUaeiou]", "");
        int count =0;
        
        char[] c =s.toCharArray();
        
        for(int m :c) {
        	if((m=='a')||(m=='e')||(m=='i')||(m=='o')||(m=='u')){
        		count++;
        	}
        }System.out.println(s2+"-"+count);
	}

}
