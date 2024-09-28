package Batchjava;

public class OtherWay {
	
	public static void main(String[] args) {
		
		String s ="yugendran";
		String str="AEIOuaeiou";
		
		//output =yagendrun
		
		int count = 0;
		int backcount=s.length()-1;
		
		while(count<backcount) {
		
		for(int i=0;i<s.length();i++) {
			char d =s.charAt(i);
			if(str.contains(String.valueOf(d))) {
				count++;
				continue;
			}
			
		for(int j=0;j<s.length()-1;j--) {
			char g =s.charAt(d);
			if(str.contains(String.valueOf(g)))
			backcount--;
			
		}
		 char sam =d;
		 char g=d;
		 d=sam;
		 
		 count++;
		 backcount--;
			
		}
		
		
		
		
		
		
			
	}

}
}