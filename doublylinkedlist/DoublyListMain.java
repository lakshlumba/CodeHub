package algo.doublylinkedlist;

public class DoublyListMain {
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		DoublyLinkedList.Node head = doublyLinkedList.head();
		doublyLinkedList.add(new DoublyLinkedList.Node("1"));
		doublyLinkedList.add(new DoublyLinkedList.Node("2"));
		doublyLinkedList.add(new DoublyLinkedList.Node("3"));
		doublyLinkedList.add(new DoublyLinkedList.Node("4"));
		doublyLinkedList.add(new DoublyLinkedList.Node("5"));
		doublyLinkedList.add(new DoublyLinkedList.Node("6"));
		doublyLinkedList.add(new DoublyLinkedList.Node("7"));
		System.out.println(doublyLinkedList);
		doublyLinkedList.appendAtBeginnning(new DoublyLinkedList.Node("-1"));
		doublyLinkedList.appendAtBeginnning(new DoublyLinkedList.Node("-2"));
		System.out.println(doublyLinkedList);
		doublyLinkedList.appendAtEnd(new DoublyLinkedList.Node("8"));
		doublyLinkedList.appendAtEnd(new DoublyLinkedList.Node("9"));
		System.out.println(doublyLinkedList);
		doublyLinkedList.deleteAtBeginnning();
		doublyLinkedList.deleteAtBeginnning();
		System.out.println(doublyLinkedList);
		doublyLinkedList.deleteAtEnd();
		doublyLinkedList.deleteAtEnd();
		System.out.println(doublyLinkedList);
		doublyLinkedList.insertAfter("3", new DoublyLinkedList.Node("3.5"));
		doublyLinkedList.insertAfter("5", new DoublyLinkedList.Node("5.5"));
		System.out.println(doublyLinkedList);
		doublyLinkedList.insertBefore("3", new DoublyLinkedList.Node("2.5"));
		doublyLinkedList.insertBefore("5", new DoublyLinkedList.Node("4.5"));
		System.out.println(doublyLinkedList);
		doublyLinkedList.deleteNode("3");
		doublyLinkedList.deleteNode("3.5");
		System.out.println(doublyLinkedList);		
		doublyLinkedList.appendAtBeginnning(new DoublyLinkedList.Node("11"));
		doublyLinkedList.appendAtBeginnning(new DoublyLinkedList.Node("12"));
		System.out.println(doublyLinkedList);
		System.out.println(doublyLinkedList.getListSize());
	}
}
