package javapractice.linked;

public class FindLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linklist = new LinkedList();
		LinkedList.Node head = linklist.head();
		
		linklist.add(new LinkedList.Node("1"));
		linklist.add(new LinkedList.Node("2"));
		linklist.add(new LinkedList.Node("3"));
		linklist.add(new LinkedList.Node("4"));
		linklist.add(new LinkedList.Node("5"));
		LinkedList.Node  current = head;
		int length = 0;
		LinkedList.Node thirdLast = head;
		while (current.next() != null){
			length++;
			current = current.next();
			if (length > 2){
				thirdLast = thirdLast.next(); 
			}
		}
		System.out.println(length);
		System.out.println(thirdLast);
	}

}
