package fhgdfgdg;

public class Factrioalpart2 {

	public int tom(int num) {

		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}

	public static void main(String[] args) {
		Factrioalpart2 f = new Factrioalpart2();
		int tom = f.tom(6);

		System.out.println(tom);

	}

}
