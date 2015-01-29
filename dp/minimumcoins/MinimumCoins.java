package practice.dp.minimumcoins;

public class MinimumCoins {
	public static void main(String[] args) {
		int[] coins = {1,2,5,8};
		int value = 1000;	
		int minimumValue = 1000;
		int coinCount= 0;
		while (value > 0){
			for (int i = 0; i < coins.length; i++ ){
				   if ((value - coins[i]) < minimumValue && (value - coins[i]) >= 0){
					   minimumValue = value - coins[i];
				   } 
			}
			value = minimumValue;
			coinCount++;
		}
		System.out.println("Coin count " + coinCount);
	}

}
