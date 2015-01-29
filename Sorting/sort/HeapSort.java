package practice.sort;

public class HeapSort {
	private static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] arr = {4,10,3,5,1};
		heapsort(arr);
		for (int i = 0 ; i < arr.length ; i++ ){
			System.out.println(arr[i]);
		}
	}
	private static void heapsort(int[] arr){
		heapify(arr);
		for (int i = N; i  > 0 ; i--){
			swap(arr,0,i);
			N = N-1;
			maxheap(arr,0);
		}
	}
	private static void heapify(int arr[]){
		 N =(arr.length-1);
		 for (int j = N/2 ; j>=0 ; j-- ){
			 maxheap(arr,j);
		 }
	}
	private static void maxheap(int[] arr, int center){
		int left = 2*center;
		int right = 2*center +1;
		int largest = center;
		if (left <= N && arr[left] > arr[center]){
			largest = left;
		}
		if (right <= N && arr[right] > arr[largest]){
			largest = right;
		}
		if (largest != center){
			swap(arr,center,largest);
			maxheap(arr,largest);
		}
	} 
	private static void swap (int[] arr, int i , int j){
		int swap = arr[i];
		arr[i] = arr[j];
		arr[j] = swap;
	}
}
