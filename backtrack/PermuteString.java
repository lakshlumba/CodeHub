package practice.backtrack;

public class PermuteString {

	public static void main(String args[]){
		String str = "abc";
		char[] charArray = str.toCharArray();
		permuteString(charArray,0,str.length());
	}
	
	private static void  permuteString(char[] str,int i, int n ){
		 int j;
		 if (i == n){
			 System.out.println(str);
		 } else{
			 for (j=i ; j < n; j++){
				 swap(str,i,j);
				 permuteString(str, i+1, n);
				 swap(str,i,j);
			 }
		 }
		 
		}
	private static void swap(char[] str,int x, int y ){
	 char temp = str[x];
	 str[x] = str[y];
	 str[y] = temp; 
	 
	}
}

