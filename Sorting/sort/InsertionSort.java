package practice.sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,11,13,5,6,21,27,19,15,28,39,47,17};
		insertionsort(arr);
		for (int i = 0 ; i < arr.length ; i++ ){
			System.out.println(arr[i]);
		}
	}
	private static void insertionsort(int[] arr){
		int length = arr.length;
		for (int i = 1; i < length ; i++){
			for (int j = i-1 ; j >=0; j--){
				if (arr[j+1] < arr[j]){
					swap(arr,j,j+1);
				}
			}
		}
	}
	private static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
