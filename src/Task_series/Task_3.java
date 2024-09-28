package Task_series;

public class Task_3 {
	
	
	public static void main(String[] args) {
		
		
    //		Input : str1 = abchtuoyruehabc,str2 = abc
	//			Output : 0
		
		
		String str1 = "abchtuoyruehabc";
        String str2 = "abc";

        int index = findFirstIndexOfSubstring(str1, str2);
        System.out.println(index);
    }

    public static int findFirstIndexOfSubstring(String str1, String str2) {
        return str1.indexOf(str2);
    

	}

}
