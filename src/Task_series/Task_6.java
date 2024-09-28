package Task_series;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_6 {
	
	
    public static void main(String[] args) {
        
    	int[] a = {8,7,9,15,7,99,15,7};
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i =0 ; i<a.length; i++){
                  for(int j = i+1 ; j<a.length; j++){
                if(a[i]==a[j]){
                    a[i]=-1;
                }
            } }
            for(int i = 0 ; i<a.length; i++){
                if(a[i]!=-1){
                    al.add(a[i]);
                }
            }
            System.out.println(al);
        }
}