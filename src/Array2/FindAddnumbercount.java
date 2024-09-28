package Array2;

public class FindAddnumbercount {
	
	public static void main(String[] args) {
		int[] a = { 12, 34, 43, 53, 34, 53, 342, 23, 54 };
		int ans = 0;
		int ans2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				ans = ans + a[i];
			} else
				ans2 = ans2 + a[i];
		}
		System.out.println(ans);
		System.out.println(ans2);
	}

}
