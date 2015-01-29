package algo.doublylinkedlist;

public class ReverseLinkedList {
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
		DoublyLinkedList reverseList = doublyLinkedList.reverseList(doublyLinkedList);
		System.out.println(reverseList);
	}
}
