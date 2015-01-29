package pratice.dp.buildingbridge;

public class BuildingBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] northernbank = {3,2,5,4,6,1};
		int[] southernbank = {1,2,3,4,5,6};
		int[] southnorth = new int[southernbank.length];
		for(int i = 0; i < southernbank.length ; i++){
		for (int j = 0; j < northernbank.length ; j++){
				if(southernbank[i] == northernbank[j] ){
					southnorth[i] = j + 1;
				}
			}
		}
		for(int i = 0; i < southernbank.length ; i++){
			System.out.println(southnorth[i]);
		}
		System.out.println("--------------------------------------");
		maxmumBridge(southnorth);
	}


	private static void maxmumBridge(int[] seq){
		int[] subseqlength = new int[seq.length];
		int maxsubseq = 0;
		for (int j = 0; j < seq.length; j++) {
			subseqlength[j] = 1;			
			maxsubseq = 0;
			for (int i = j-1 ; i >= 0 ; i-- ){				
				if (seq[i] < seq[j] && subseqlength[i] > maxsubseq) {
						maxsubseq = subseqlength[i];
				}
			}
			subseqlength[j] = maxsubseq + 1; 
		}
		maxsubseq = 0;
		for (int j = 0; j < seq.length; j++) {
			if (subseqlength[j] >  maxsubseq)
				maxsubseq = subseqlength[j];
		}
		System.out.println(maxsubseq);
	}
}