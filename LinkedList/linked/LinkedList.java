package javapractice.linked;

public class LinkedList {
	private Node head;
	private Node tail;
	public LinkedList(){
		this.head = new Node("head");
		tail = head;
	}
	public Node head(){
		return head;
	}
	
	public void add(Node node){
		tail.next  = node;
		tail = node;
	}
	public void appendAtBeginning(Node node){
		Node current = head;
		node.next = head.next();
		head.next = node;
		while (current != null){
			current = current.next();
		}
		tail = current;
	}
	public void appendToTail(Node node){
		Node current = head;
		while (current.next() != null){
			current = current.next();
		}
		current.setNext(node);
		tail = current.next();
	} 
	public boolean isCyclic(){
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next() != null){
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow){
				return true;
			}
		}
		return false;
	}
	public void appendLinkedList(LinkedList l2){
		LinkedList.Node current = l2.head();
		if (current.next() != null){
			current = current.next();
			tail.next = current;
		}
		while(current != null){
			current = current.next();
		}
		tail = current;
	}
	public void removeFirstNode(){
		LinkedList.Node current = head;
		current = current.next();
		if (current != null && current.next() != null){
			head.next = current.next();
		}current = head;
		while(current != null){
			current = current.next();
		}		
		tail = current;
		
	}
	public void removeLastNode(){
		LinkedList.Node current = head;
		LinkedList.Node previousCurrent = head;
		while (current.next() != null ){
			previousCurrent = current;
			current = current.next();			
		}
		tail = previousCurrent;
		previousCurrent.setNext(null);			
		
	}
	public void deleteElement() {
		
	}
	public LinkedList reverse(LinkedList linklist){
		LinkedList reverseList = new LinkedList();
		LinkedList.Node current = linklist.head();
		while (current.next() != null){
			current = current.next();
			reverseList.appendAtBeginning(new LinkedList.Node(current.data()));
		}
		return reverseList;
	}
	
	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		Node current = head.next();
		while (current != null){
			stringBuilder.append(current).append("-->");
			current = current.next();
		}
		stringBuilder.delete(stringBuilder.length()-3, stringBuilder.length());
		
		return stringBuilder.toString();
	}

		
	public static class Node{
		private Node next;
		private String data;
		public Node(String data){
			this.data = data;
		}
		public Node next(){
			return next;
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
