package practice.dp.knapsack;

public class KnapsackMultInstance {
	public static void main(String[] args) {
		int[] value = {0,50,10,20,40,30};
		int[] wt  = {0,300,60,90,100,240};
		int knapsack = 50;
		knapsackProblem(value,wt,knapsack,wt.length-1);
	}
	/**
	 * 
	 */
	private static void knapsackProblem(int[] value, int[] wt, int W, int N){
        int[][] m = new int[N + 1][W + 1];
        int[][] sol = new int[N + 1][W + 1];
        for(int i = 1 ; i <= N ; i++) {
        	for(int j = 0; j < W;j++) {
        		int m1 = m[i-1][j];
        		int m2 = Integer.MIN_VALUE;
        		if(j-wt[i] >= 0) {
                    m2 = m[i - 1][j - wt[i]] + value[i];
	                /** select max of m1, m2 **/
	                m[i][j] = maximum(m1, m2);
	                sol[i][j] = m2 > m1 ? 1 : 0;
        		}
        	}
        }
        /** make list of what all items to finally select **/
        int[] selected = new int[N + 1];
        for (int n = N, w = W; n > 0; n--)  {
            if (sol[n][w] != 0)  {
                selected[n] = 1;
                w = w - wt[n];
            } else
                selected[n] = 0;
        }
        /** Print finally selected items **/
        System.out.println("\nItems selected : ");
        for (int i = 1; i < N + 1; i++){
            if (selected[i] == 1){
                System.out.print(i +" ");
            }
        }
        System.out.println();
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int maximum(int a, int b){
	 if (a>b){
		 return a;
	 } else {
		 return b;
	 }
	 
	}
}
