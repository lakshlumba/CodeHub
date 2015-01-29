package algo.doublylinkedlist;


public class DoublyLinkedList {
	private Node head;
	private Node tail;
	public DoublyLinkedList(){
		this.head = new Node("head");
		tail = head;
	}	
	public Node head(){
		return head;
	}
	public Node tail(){
		return tail;
	}
	public void add(Node node){
		tail.next  = node;
		node.prev = tail;
		tail = node;
	}
	
	public void appendAtBeginnning(Node node){
		node.next = head.next;
		node.prev = head;
		head.next = node;
		Node current = head.next();
		while (current != null){
			tail = current;
			current = current.next();
		}		
	}
	public void appendAtEnd(Node node){
		tail.setNext(node); 
		node.prev = tail;
		tail = node;		
	}
	
	public void insertAfter(String data,Node node){
		DoublyLinkedList.Node current = head.next();
		while (current != null){
			if (current.data.equals(data)){
				current.next().prev = node;
				node.next = current.next;
				current.next = node;
				node.prev = current;
				break;
			} else {
				current = current.next();
			}	
		}
		current = head.next();
		while (current != null){
			tail = current;
			current = current.next();
		}	
	}
	
	public void insertBefore(String data,Node node){
		DoublyLinkedList.Node current = head.next();
		while (current != null){
			if (current.data().equals(data)){
				current.prev().next = node;
				node.prev = current.prev;
				node.next = current;
				current.prev = node;
				break;
			} else {
				current = current.next();
			}	
		}
		current = head.next();
		while (current != null){
			tail = current;
			current = current.next();
		}
	}
	
	public void deleteAtBeginnning(){
		DoublyLinkedList.Node current = head.next();
		if (current != null && current.next() != null){
			head.next = current.next();
			current.next().prev = head;
		}
		current = head.next();
		while(current != null){
			tail = current;
			current = current.next();
		}		
	}
	
	public void deleteAtEnd(){
		DoublyLinkedList.Node current = head.next();
		if (current != null) {
			tail = tail.prev();
			tail.next().prev = null;
			tail.next = null;
		} else {
			System.out.println("No element in the list");
		}
	
	}
	
	public void deleteNode(String data){
		DoublyLinkedList.Node current = head.next();
		while (current != null){
			if (current.data().equals(data)){
				current.prev().next = current.next();
				current.next().prev = current.prev();
				break;
			} else {
				current = current.next();
			}	
		}
		current = head.next();
		while (current != null){
			tail = current;
			current = current.next();
		}
	}
	public int getListSize(){
		DoublyLinkedList.Node current = head.next();
		int count = 0;
		while (current != null){
			count  = count + 1;
			current = current.next();
		}
		return count;
		
	}	
	public DoublyLinkedList reverseList(DoublyLinkedList doublyLinkedList){
		DoublyLinkedList reverseList = new DoublyLinkedList();
		DoublyLinkedList.Node current = doublyLinkedList.head();
		while (current.next() != null){
			current = current.next();
			reverseList.appendAtBeginnning(new DoublyLinkedList.Node(current.data()));
		}
		return reverseList;
		
	}
	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		Node current = head.next();
		while (current != null){
			stringBuilder.append(current).append("<==>");
			current = current.next();
		}
		//stringBuilder.delete(stringBuilder.length()-4, stringBuilder.length());
		
		return stringBuilder.toString();
	}
	public static class Node{
		private Node prev;
		private Node next;
		private String data;
		public Node(String data){
			this.data = data;
		}
		public Node next(){
			return next;
		}
		public Node prev(){
			return prev;
		}
		public void setPrev(Node node){
			this.prev = node;
		}
		public String data(){
			return data;
		}
		public void setdata(String data){
			this.data = data;
		}
		public void setNext(Node node){
			this.next = node;
		}
		public String toString(){
			return data;			
		}
	}
}
