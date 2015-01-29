package practice.dp;

public class MaxiSubSquence {
	public static void main(String[] args) {
		int[] array = {200,-6,100,-3,4,-6,1,9};
		int[] window = new int[array.length];
		int maxLength = window[0];
		for (int j = 0; j < array.length; j++){
			if ( j == 0){
				window[j] = calculateMax(array[j], array[j]);
			} else {
				window[j] = calculateMax(window[j-1] + array[j], array[j]);
			}
			System.out.println("Window" + j + " = " + window[j]);	
		}
		maxLength =  findMaxLength(window);
		System.out.println("maximum values of windows is " + maxLength);
	}
	private static int calculateMax(int j, int k){
		if( j > k) {
			return j;
		} else {
			return k;
		}
	}
	private static int findMaxLength(int[] window){
		int max = window[0];
		for (int i = 0; i < window.length; i++){
			if (max < window[i]){
				max =  window[i];
			}
		}
		return max;
	}
}
