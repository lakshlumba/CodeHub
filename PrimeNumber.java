package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int N = 2;
		while ( i <= 15 ){			
			if (isPrime(N)){
				 N++;i++;
			} else {
				N++;
			}
		}
	}
	 private static boolean isPrime(int N){	 	
		 	if (N == 2){
		 		System.out.println("Number " + N +" is prime number");
		 		return true;	 		
		 	} else if (N % 2 == 0){
		 		return false;
		 	} else {
		 		int i = 3;
				while (i <= N/2 ){
					if (N % i == 0){
						return false;
					}
					i = i+2;
					if (i % 3 == 0){
						i = i + 2;
					}
				 }
				System.out.println("Number " + N +" is prime number");
				return true;
		 	}
		}
}
