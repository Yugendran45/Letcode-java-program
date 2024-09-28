package fhgdfgdg;

import java.util.Scanner;

public class CaseSenstive {
	
	public void  censitive() {
		
		Scanner s = new Scanner(System.in);
		String sam =s.nextLine();
		System.out.println("Enter");
        System.out.println(sam);
		
		String Uppercase ="";
		String lowercase ="";
		String digit ="";
		
		for(int i=0; i<sam.length(); i++) {
			char c =sam.charAt(i);
			
			if(Character.isUpperCase(c)) {
				Uppercase = Uppercase+c;
			}else if(Character.isLowerCase(c)) {
				lowercase = lowercase+c;
			}else if(Character.isDigit(c)) {
				digit =digit +c;
		}
		
		
	}   
		
		System.out.println(Uppercase);
		System.out.println(lowercase);
		System.out.println(digit);
	}
	
	public static void main(String[] args) {
		CaseSenstive cs =new CaseSenstive();
		cs.censitive();
		System.out.println("Enter the number");
		
		
		
	}
	
}
