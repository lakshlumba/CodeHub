package javapractice.linked;

public class CyclicLinkedList {

	public static void main(String[] args) {
		LinkedList linklist = new LinkedList();		
//		linklist.appendToTail(new LinkedList.Node("1"));
//		linklist.appendToTail(new LinkedList.Node("2"));
//		linklist.appendToTail(new LinkedList.Node("3"));
//		linklist.appendToTail(new LinkedList.Node("4"));
//		linklist.appendToTail(new LinkedList.Node("5"));

		linklist.appendToTail(new LinkedList.Node("1"));
		LinkedList.Node cycle = new LinkedList.Node("2");
		linklist.appendToTail(cycle);
		linklist.appendToTail(new LinkedList.Node("3"));
		linklist.appendToTail(new LinkedList.Node("4"));
		linklist.appendToTail(new LinkedList.Node("5"));
		linklist.appendToTail(cycle);
		
		if (linklist.isCyclic()){
			System.out.println("linkedlist is cyclic");
		} else {
			System.out.println("linkedlist is not cyclic");
		}
		System.out.println(linklist);

	}

}
