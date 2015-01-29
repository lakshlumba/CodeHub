package practice;

import java.util.logging.Logger;

public class FindCommonInThreeArrays {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int[] b = {3,4,5,6,7,8};
		int[] c = {6,8,9,10,11,12};
		int i=0;int j=0;int k=0;
		while(i < a.length && j < b.length && k < c.length){
			if (a[i] == b[j] && b[j] == c[k]){
				System.out.println(a[i]);
				i++;j++;k++;
			} else if(a[i] < b[j]){
				i++;
			} else if(b[j] < c[k]){
				j++;
			} else {
				k++;
			}
		}
	
 	}
}
