package practise.brainteaser;

import java.util.Scanner;

public class TreeGrowth {

	public static void main(String[] args) {
		System.out.println("Enter the number of cycles");
		Scanner scan = new Scanner(System.in);
		int numberOfCycles = scan.nextInt();
		System.out.println(heightOfTree(numberOfCycles));
	}
	/**
	 * find the height of a tree
	 * @param cycle
	 * @return
	 */
	private static int heightOfTree(int cycle){
		int height = 1;
		while (cycle > 0){
			height = completeSunlight(height);
			height = partialSunlight(height);
			height = completeSunlight(height);
			cycle--;
		}
		return height;
	}
	/**
	 * complete growth of a tree
	 * @param n
	 * @return
	 */
	private static int completeSunlight(int n){
		return n*3;
	}
	/**
	 * partial growth of a tree
	 * @param n
	 * @return
	 */
	private static int partialSunlight(int n){
		return (n + 3);
	}
}
