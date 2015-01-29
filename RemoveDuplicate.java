package practice;

import java.util.ArrayList;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] str = {9,2,4,4,5,7,7,8,9};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < str.length; i++) {
			if(!list.contains(str[i])){
				list.add(str[i]);
			}
		}
		System.out.println(list);
	}
}
