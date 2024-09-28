package Java_Interview_Question;

public class Interview_Task {
	
	
	public static void main(String[] args) {
		String s = "hai sir,test the ball";
		String str = "";
		String sam ="";
		
		//output = ris iah,test the ball
		//Explanination : Once find special character before Charcters only print reverse 
		
		for(int i = 0; i<s.length();i++) {
			char c = s.charAt(i);
			
			
			if(!Character.isLetterOrDigit(c) ) {
				for(int j =str.length()-1; i>0;i-- )
					 sam = sam+str.charAt(j);
			
			}else {
				str =str+c;
				
			}
			
		}
		
		System.out.println(sam+str);
	
	}

}
