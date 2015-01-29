package practice.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,19,2,6, 29,39,19,13};
		for (int i = arr.length-1 ; i > 0 ; i--){
			for (int j = 0 ; j < i ; j++ ){
				if (arr[j] > arr[j+1]) {
						int swap = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = swap;
					}
			}
		} 
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
