package practice.sort;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int find = 6;		
		int str = binarysearch(arr,0,arr.length-1,find);
		System.out.println("value in array is at " + str);
	}
	private static int binarysearch(int[] arr,int i,int r,int find){		
		while(r >= i){	
			int mid = 1+r/2;
			if (arr[mid] == find) return mid;
			if (arr[mid] < find) 
				binarysearch(arr,i,mid-1,find);			
			else  
				binarysearch(arr,mid+1,r,find);    
		}
		return -1;
	}
}
