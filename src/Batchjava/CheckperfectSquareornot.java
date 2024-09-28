package Batchjava;

public class CheckperfectSquareornot {
	
	public static void main(String[] args) {
		
		int m = 64;
		double sqrt=Math.sqrt(m);
		System.out.println(sqrt);
		
		if(((sqrt - Math.floor(sqrt)) == 0)) {
			System.out.println("its perfect square root");
			
		}else {
			System.out.println("its not perfect root");
		}
		
	}

}
