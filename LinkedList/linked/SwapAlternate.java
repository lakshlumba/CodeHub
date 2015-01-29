package javapractice.linked;

public class SwapAlternate {

	public static void main(String[] args) {
		LinkedList linklist = new LinkedList();
		linklist.appendToTail(new LinkedList.Node("1"));
		linklist.appendToTail(new LinkedList.Node("2"));
		linklist.appendToTail(new LinkedList.Node("3"));
		linklist.appendToTail(new LinkedList.Node("4"));
		linklist.appendToTail(new LinkedList.Node("5"));
		linklist.appendToTail(new LinkedList.Node("6"));
		//linklist.appendToTail(new LinkedList.Node("7"));
		LinkedList.Node current = linklist.head();
		current = current.next();
		while (current != null && current.next() != null){
			swap(current,current.next());
			current = current.next().next();
		}
		System.out.println(linklist);
	}
	public static void swap(LinkedList.Node n1,LinkedList.Node n2 ){
		String temp = n1.data();
		n1.setdata(n2.data());
		n2.setdata(temp);		
	}
}
