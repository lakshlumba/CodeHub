package practice.ugly;

import java.util.Scanner;

public class UglyTest {
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
    	int j = divideByFive(i);
    	int k = divideByThree(j);
    	int dirtyNumber = divideByTwo(k);	
    	if (dirtyNumber == 1 ){
    		return true;
    	}
    	return false;
    } 
    private static int divideByTwo(int i){
    	while (i >= 2){
    		if (i%2 == 0) {
    			i = i/2 ;
    		} else {
    			 break;
    		}
    	}
    	return i;
    }
	private static int divideByThree(int i){
		while (i >= 3){
    		if (i%3 == 0) {
    			i = i/3 ;
    		} else {
    			break;
    		}
    	}
	    return i;
	}
	private static int divideByFive(int i){
		while (i >= 5){
    		if (i%5 == 0) {
    			i = i/5 ;
    		} else {
    			break;
    		}
    	}
		return i;
	}
}
