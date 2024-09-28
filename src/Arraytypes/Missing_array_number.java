package Arraytypes;

import java.util.ArrayList;

public class Missing_array_number {
	
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6, 8, 9, 10 };
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {

			boolean status = false;

			for (int j = 0; j < a.length; j++) {

				if (i == a[j]) {
					status = true;
					break;

				}

			}
			if (!status) {
				al.add(i);
			}

		}

		System.out.println(al);

	}
}