package practice.sort;

public class MergeSort {
	public static void main(String args[]){
	int[] arr = {19,23,19,19,7,6,3,29,29,29,38,38,38};
	int m = arr.length;
	mergesort(arr,0,m-1);
	for (int i = 0; i < arr.length ; i++){
		System.out.println(" " + arr[i]);
	}
	}
	private static void mergesort(int[] arr,int l, int r){
		if (l < r){
			int m = l+(r-l)/2;
			mergesort(arr,l,m);
			mergesort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	private static void merge(int[] arr, int l, int m, int r){
		int p1 = m-l+1;
		int p2 = r-m;
		int[] n1 = new int[p1];
		int[] n2 = new int[p2];
		for (int i =0 ; i < n1.length ;i++){
			n1[i] = arr[l+i];
		} 
		for(int i = 0; i < n2.length  ;i++ ){
			n2[i] = arr[i+m+1];
		}
		int i= 0;
		int j= 0;
		int k = l;
		while (i < n1.length && j < n2.length){
			if (n1[i] < n2[j]){
				arr[k] = n1[i]; i++;
			} else {
				arr[k] = n2[j]; j++;
			}
			k++;
		}
		while (i < n1.length){
			arr[k] = n1[i];k++;
			i++;
		}
		while (j < n2.length){
			arr[k] = n2[j];k++;
			j++;
		}
	}
}
