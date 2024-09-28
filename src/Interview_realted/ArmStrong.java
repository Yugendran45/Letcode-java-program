package Interview_realted;

public class ArmStrong {
	
	
	
	public static void main(String[] args) {
		
		int num = 153;
		int rev =0;
		int rem =0;
		while(num > 0) {
			
			int eem= num%10;
			//System.out.println(eem);
			 rev =rev+(eem*eem*eem);
			 num=num/10;
		}
		
		if(num != rev) {
			System.out.println(num +" , "+rev);
		}else {
			System.out.println("its not armstrong");
		
	}

}
}