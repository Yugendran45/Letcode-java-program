package Interview_realted;

import java.util.ArrayList;
import java.util.List;

public class Interview_questionsss {

	
	public static void main(String[] args) {

		// output = {10,11,12}
		int n = 10;
		String[] s = { "call", "call", "call" };
		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < s.length; i++) {
			l.add(n);
			n++;
		}

		System.out.println(l);

	}

}
