package Batchjava;

import java.util.Scanner;

public class FindleapYear {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter a year to check if it's a leap year: ");
        int year = s.nextInt();
        System.out.println("Entered year: " + year);
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        s.close(); // Closing the scanner
    }
}
