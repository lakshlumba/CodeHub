package algo.doublylinkedlist;

import java.util.HashMap;
import java.util.Scanner;


public class CacheMechanism {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		HashMap<String,DoublyLinkedList.Node> cacheMap =  new HashMap<String,DoublyLinkedList.Node>(); 
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();          
        char ch;
        DoublyLinkedList.Node node;
        do {
            System.out.println("Enter the Element");
            int choice = scan.nextInt();
            String data = String.valueOf(choice);
            node = new DoublyLinkedList.Node(data);
            if (cacheMap.get(data) != null) {
	            	doublyLinkedList.deleteNode(data);
	            	cacheMap.put(data, null);
	            	doublyLinkedList.add(node);
	            	cacheMap.put(data, node);
	            	
            } else {
            	if(doublyLinkedList.getListSize() > 4){	    
            		DoublyLinkedList.Node firstAdd =  doublyLinkedList.head().next();
	            	cacheMap.put(firstAdd.data(), null);	            	
	            	doublyLinkedList.add(node);
	            	cacheMap.put(data, node);
	            	doublyLinkedList.deleteAtBeginnning();
	            }
            	else {
            			doublyLinkedList.add(node);
            			cacheMap.put(data, node);	            	
            	}
            }
            System.out.println(doublyLinkedList);            
            System.out.println("Do you want to continue (Type y or n)");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');  
    }
}
