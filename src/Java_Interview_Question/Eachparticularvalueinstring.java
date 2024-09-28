package Java_Interview_Question;

public class Eachparticularvalueinstring {
	
	public static void main(String[] args) {
		String s = "java is not easy";
		String m="";
		
		//output is = avaj si ton ysae
		
		String[] star =s.split(" ");
		
		for(String stop :star) {
			
			System.out.println(stop);
			for(int i=stop.length()-1;i>=0;i--) {
				char c=stop.charAt(i);
				m=m+c;
			}
			 m=m+" ";
		}

	
	System.out.println(m);
	}

}
