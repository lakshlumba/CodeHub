package practice.dp.balanced;

public class BalancedPartition {
	public static void main(String[] args) {
		int arr[] = {3, 1, 1, 2, 2, 1};
		int n = arr.length;
		if(findPartition(arr, n)){
		System.out.println("Sum can be Zero");	
		}
		else {
			System.out.println("Sum cannot be zero");
		}
	}

	private static boolean findPartition(int arr[],int n){
		int sum = 0;
		for (int i=0; i<n;i++ ){
			sum = sum + arr[i];
		}if (sum%2 != 0){
			return false;
		}
		boolean[][] was = new boolean[sum/2+1][n+1];
//		for (int i=1; i <= sum/2 ;i++){
//			was[i][0] = false;
//		}
		for (int j=0; j <= n; j++){
			was[0][j] = true;
		}
		for (int i = 1; i <= sum/2 ; i++){
			for(int j =1; j <= n; j++){
				was[i][j] = was[i][j-1];
				if(i >= arr[j])
				{
					was[i][j] = was[i][j-1] || was[i-arr[j-1]][j-1];
				}
			}
		}
	
		return was[sum/2][n];
	}
}
