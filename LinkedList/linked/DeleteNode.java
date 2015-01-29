package javapractice.linked;

public class DeleteNode {

	public static void main(String[] args) {
		LinkedList linklist = new LinkedList();
		linklist.appendToTail(new LinkedList.Node("1"));
		linklist.appendToTail(new LinkedList.Node("2"));
		linklist.appendToTail(new LinkedList.Node("3"));
		linklist.appendToTail(new LinkedList.Node("4"));
		linklist.appendToTail(new LinkedList.Node("5"));
		linklist.appendToTail(new LinkedList.Node("6"));
		linklist.appendToTail(new LinkedList.Node("7"));
		linklist.removeFirstNode();
		linklist.removeLastNode();
		linklist.removeLastNode();
		linklist.removeLastNode();
		System.out.println(linklist);
	}

}
