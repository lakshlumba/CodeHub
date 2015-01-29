package practice;


public class QuickSort {
	
	public static void main(String[] args) {
		int[] boxPossibleList = {2,4,6,1,5,37,23,12,45};
		boxPossibleList = arrangeBoxBaseArea(boxPossibleList);
		for (int i=0; i < boxPossibleList.length; i++){
			System.out.println("boxPossibleList " + i + " " + boxPossibleList[i]);
		}
		
	}
	private static int[] arrangeBoxBaseArea(int[] boxPossibleList){
		for (int i=0;i < boxPossibleList.length ; i++) {			
			for (int j = i+1 ; j < boxPossibleList.length ; j++){
				if (boxPossibleList[j] > boxPossibleList[i]){
					int max = boxPossibleList[j];
					boxPossibleList[j] = boxPossibleList[i];
					boxPossibleList[i] = max;
				}
			}
		}	
		return boxPossibleList;
	}
}
