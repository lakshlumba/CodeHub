package practice.dp.boxstack;

public class BoxStacking {
	public static void main(String[] args) {
		Box box1 = new Box(4,6,7);
		Box box2 = new Box(1,2,3);
		Box box3 = new Box(4,5,6);
		Box box4 = new Box(10,12,32);
		Box[] boxList = {box1,box2,box3,box4};
		Box[] boxPossibleList = new Box[3 * boxList.length];
		int j = 0;
		for (int i=0 ; i < boxList.length ; i++ ){
			boxPossibleList[j] = getBoxHeight(boxList[i]);
			boxPossibleList[j+1] = getBoxWidth(boxList[i]);
			boxPossibleList[j+2] = getBoxDepth(boxList[i]);
			j = j+3;
		}
		for (int i=0 ; i < boxPossibleList.length ; i++ ){
			System.out.println(boxPossibleList[i].getHeight() + " * " + boxPossibleList[i].getWidth()
					+ " * " + boxPossibleList[i].getDepth()  );		
		}
		
		boxPossibleList = arrangeBoxBaseArea(boxPossibleList);
		System.out.println("------------------------------------");
		for (int i=0 ; i < boxPossibleList.length ; i++ ){
			System.out.println(boxPossibleList[i].getHeight() + " * " + boxPossibleList[i].getWidth()
					+ " * " + boxPossibleList[i].getDepth()  );		
		}
		maxHeight(boxPossibleList);
	}

	private static void maxHeight(Box[] boxPossibleList) {
		int[] maxStackHeight = new int[boxPossibleList.length];
		for (int i = 0; i < maxStackHeight.length; i++) {
			maxStackHeight[i] = boxPossibleList[i].getHeight();
		}
		for (int j = 1; j < boxPossibleList.length; j++) {
			for (int i = 0; i < j; i++) {
				if (boxPossibleList[i].getWidth() > boxPossibleList[j].getWidth()
						&& boxPossibleList[i].getDepth() > boxPossibleList[j].getDepth()
						&& maxStackHeight[j] < maxStackHeight[j] + boxPossibleList[i].getHeight() ) {
					maxStackHeight[j] = boxPossibleList[j].getHeight() + maxStackHeight[i];
				}
			}
		}
		int maxHeight = 0;
		for (int j = 0; j < maxStackHeight.length; j++) {
			if (maxStackHeight[j] > maxHeight)
				maxHeight = maxStackHeight[j];
		}
		System.out.println(maxHeight);
	}
	private static Box[] arrangeBoxBaseArea(Box[] boxPossibleList){
		for (int i=0;i < boxPossibleList.length ; i++) {			
			for (int j = i+1 ; j < boxPossibleList.length ; j++){
				if ((boxPossibleList[j].getWidth() * boxPossibleList[j].getDepth()) > (boxPossibleList[i].getWidth() * boxPossibleList[i].getDepth())){
					Box max = boxPossibleList[j];
					boxPossibleList[j] = boxPossibleList[i];
					boxPossibleList[i] = max;
				}
			}
		}	
		return boxPossibleList;
	}
	private static Box getBoxHeight(Box box){
			int height = box.getHeight();
			int width,depth;
			if (box.getWidth() >= box.getDepth()){
				width = box.getWidth();
				depth = box.getDepth();
			} else {
				width = box.getDepth();
				depth = box.getWidth();
			}
			return (new Box(height,width,depth));
	}
	private static Box getBoxWidth(Box box){
		int height = box.getWidth();
		int width,depth;
		if (box.getHeight() >= box.getDepth()){
			width = box.getHeight();
			depth = box.getDepth();
		} else {
			width = box.getDepth();
			depth = box.getHeight();
		}
		return (new Box(height,width,depth));
	}
	private static Box getBoxDepth(Box box){
		int height = box.getDepth();
		int width,depth;
		if (box.getWidth() >= box.getHeight()){
			width = box.getWidth();
			depth = box.getHeight();
		} else {
			width = box.getHeight();
			depth = box.getWidth();
		}
		return (new Box(height,width,depth));
	}
	
	
}
