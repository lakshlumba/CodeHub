package practice;

import java.util.Scanner;

public class Test {

	private static Scanner scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Y ");
		scanner = new Scanner(System.in);
		while ("Y".equalsIgnoreCase(scanner.next())){
			System.out.println("Enter the number");			
			int i = scanner.nextInt();
			boolean checkdirty = checkDirty(i);
			System.out.println("Dirty Number : " + checkdirty);
			System.out.println("Would you like to continue? Press Y ");
		}
	}
    private static boolean checkDirty(int i){
    	if (i%30 == 0){
    		return true;
    	}
    	return false;
    } 
}
