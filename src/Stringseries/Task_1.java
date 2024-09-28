package Stringseries;

public class Task_1 {
	
	public static void main(String[] args) {
		
		String s ="1.1.1.1.1";
		//output 1[.]1[.]1[.]1[.]1
		
		String s2 = s.replace(".", "[.]");
		//System.out.println(s2);
		
		//Other way
		String sam2 = "1.1.1.1.1";
		for(int i=0;i<sam2.length(); i++) {
			char c =sam2.charAt(i);
			
			if(c =='.') {
				
				sam2=sam2+"[.]";
				
				
			}else {
				sam2=sam2+c;
			}
		}
		 System.out.println(sam2);
		
	}
}
