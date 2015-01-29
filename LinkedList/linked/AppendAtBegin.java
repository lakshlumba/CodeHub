package javapractice.linked;

public class AppendAtBegin {

	public static void main(String[] args) {
		LinkedList linklist = new LinkedList();
		LinkedList.Node head = linklist.head();
		linklist.appendAtBeginning(new LinkedList.Node("1"));
		linklist.appendAtBeginning(new LinkedList.Node("2"));
		linklist.appendAtBeginning(new LinkedList.Node("3"));
		linklist.appendAtBeginning(new LinkedList.Node("4"));
		linklist.appendAtBeginning(new LinkedList.Node("5"));
		linklist.appendAtBeginning(new LinkedList.Node("6"));
		linklist.appendAtBeginning(new LinkedList.Node("7"));
		System.out.println(linklist);
	}

}
