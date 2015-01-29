package javapractice.linked;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList linklist = new LinkedList();
		linklist.appendToTail(new LinkedList.Node("1"));
		linklist.appendToTail(new LinkedList.Node("2"));
		linklist.appendToTail(new LinkedList.Node("3"));
		linklist.appendToTail(new LinkedList.Node("4"));
		linklist.appendToTail(new LinkedList.Node("5"));
		linklist.appendToTail(new LinkedList.Node("6"));
		linklist.appendToTail(new LinkedList.Node("7"));
		LinkedList reverseList =  linklist.reverse(linklist);
		System.out.println(linklist);
		System.out.println(reverseList);
	}

}
