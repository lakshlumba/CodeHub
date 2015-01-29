package practice.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,19,2,6, 29,39,19,13};
		for (int i = 0 ; i < arr.length ; i++){
			for (int j = i+1; j < arr.length ; j++ ){
				if (arr[i] > arr[j]){
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
