package practice.dp.pallindrome;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abbkba";
		String subStr = longestPalin(str);
		System.out.println(subStr);
	}
	private static String longestPalin(String str){		
		int n = str.length();
		int start = 0;
		boolean[][] bstring = new boolean[n][n]; 
		int maxlength = 1;
		for (int i=0 ; i < n ;i++){
			bstring[i][i] = true; 
		}
		for(int i = 0;i < n-1;i++){
			if (str.charAt(i) == str.charAt(i+1)){
				bstring[i][i+1] = true;
				maxlength = 2;
				start = i;
			}
		}
		for (int k = 3; k <= n ;k++){
			for (int i = 0 ; i < n-k+1 ; i++ ){
				int j = i + k -1;
				if (bstring[i+1][j-1] && (str.charAt(i) == str.charAt(j))){
					bstring[i][j] = true;
					if (k > maxlength){
						start = i;
						maxlength = k;
					}
				}
			}
		}
		System.out.println("start " + start);
		System.out.println("maxlength " + maxlength);
		//System.out.println("Maximum length of a string " + str.substring(start, start + maxlength));
		return str.substring(start, start + maxlength);
	}
}
