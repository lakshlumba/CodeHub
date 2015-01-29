package practice.sort;

public class QuickSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,19,2,6, 29,39,19,13};
		quicksort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	private static void quicksort(int[] arr, int l, int h){
		if(l < h){
			int p = partition(arr,l,h);
			quicksort(arr,l,p-1);
			quicksort(arr,p+1,h);
		}
	}
	private static int partition(int[] arr, int l , int h){
		int i = l-1;
		int x = arr[h];
		for (int j = l ; j <= h-1  ; j++){
			if (arr[j] < x ){
				i++;
				//swap(arr[j],arr[i]);
				int swap = arr[j];
				arr[j] = arr[i];
				arr[i] = swap;	
			}
		}
		int swap2 = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = swap2;
		return (i+1);
	}
	private static void swap(int a , int b){
		int c = a;
		a = b;
		b = c;
	}
}
