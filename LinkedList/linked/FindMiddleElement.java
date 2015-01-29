package javapractice.linked;

public class FindMiddleElement {

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
		LinkedList.Node  middle = head;
		int length = 0;
		while (current.next() != null){
			length++;
			current = current.next();
			if(length%2 == 0){
				middle = middle.next();
			}			
		}
		if (length%2 == 1){
			middle = middle.next();
		}
		System.out.println("Length " + length);
		System.out.println("Middle element is "+ middle);
	}

}
