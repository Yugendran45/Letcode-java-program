package Task_series;

public class Task_89 {
	
	
	public static void main(String args[]) {
		
		String s = "Welcome to all guys";
		
		String[] split = s.split(" ");
		
		
		for(String str : split) {
			int count =0;
			for(int i =0 ; i<str.length(); i++) {
				char c = str.charAt(i);
				 if(c == 'a' || c == 'e' || c =='i' || c == 'o'|| c=='u' ) {
					 count++;
				 }
			}
			System.out.println(str+ ":" +count);
		}
		
		
	}

}
