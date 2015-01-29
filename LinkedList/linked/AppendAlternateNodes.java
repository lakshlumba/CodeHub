package javapractice.linked;


public class AppendAlternateNodes {

	public static void main(String[] args) {
		LinkedList linklist = new LinkedList();
		LinkedList.Node head = linklist.head();
		linklist.appendToTail(new LinkedList.Node("1"));
		linklist.appendToTail(new LinkedList.Node("2"));
		linklist.appendToTail(new LinkedList.Node("3"));
		linklist.appendToTail(new LinkedList.Node("4"));
		linklist.appendToTail(new LinkedList.Node("5"));
		linklist.appendToTail(new LinkedList.Node("6"));
		linklist.appendToTail(new LinkedList.Node("7"));
		LinkedList linkedList1 = new LinkedList();
		LinkedList linkedList2 = new LinkedList();
		LinkedList.Node current = head.next();		
		while (current != null && current.next() != null){
			linkedList1.appendToTail(new LinkedList.Node(current.data()));
			if (current.next() != null){
				linkedList2.appendToTail(new LinkedList.Node(current.next().data()));
				current = current.next().next();
			}
		}if (current != null){
			linkedList1.appendToTail(new LinkedList.Node(current.data()));
		}
		LinkedList reversalL2 = linklist.reverse(linkedList2);
		linkedList1.appendLinkedList(reversalL2);
		System.out.println(linkedList1);
		System.out.println(linkedList2);
	}

}
