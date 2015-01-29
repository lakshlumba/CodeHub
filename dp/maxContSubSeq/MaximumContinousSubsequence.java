package practice.dp.maxContSubSeq;


public class MaximumContinousSubsequence {
	public static void main(String[] args) {
		int[] seq = {10,1,9,2,8,3,7,4,6,5,6,7,8,9,10,11,12};
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
