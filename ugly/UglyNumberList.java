package practice.ugly;
public class UglyNumberList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		int dirty = 1;
		while (number <= 150){		
			boolean checkdirty = checkDirty(dirty);
			if (checkdirty){
				number++;
				System.out.println(dirty);
			    dirty++;		
			} else {
				dirty++;
			}
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
