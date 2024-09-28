package fhgdfgdg;

import java.util.LinkedHashMap;
import java.util.Map;

public class Accurancy_of_array {
	
	
	public static void main(String[] args) {
		int[] a = {1,1,5,5,4,5,7,8,6,5};

	//	output  = 

		
		Map <Integer,Integer> map = new LinkedHashMap();

		for(int i =0 ; i< a.length ; i++){

		int number = a[i];

		if(map.containsKey(number)){
		int count = map.get(number);
		map.put(number,count+1);
		}else{
		map.put(a[i],1);

		}


		}
		System.out.println(map);


	}

}
