

/*
 * step1:	create class for a node
 * 				should have a 
 * 					ref to the next node
 * 					piece of data
 * step2:	within MyLinkedList class, create private variables for the head, tail, & size
 * step2.1	implement add()
 * step3	implement get()
 */
public class MyLinkedList<T> {
	
	private int size;
	
	private Node<T> head;
	private Node<T> tail;
	
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public Node<T> getHead(){
		return this.head;
	}
	
	public Node<T> getTail(){
		return this.tail;
	}
	
//	public MyLinkedList(int size) {
//		thi
//	}
	
	public Node<T> add(T element) {
		Node<T> newNode = new Node<>(element);
		if(tail != null) {
			Node<T> currentNode = this.head;
			this.tail = tail.next = newNode;
			this.tail = newNode;
			
			System.out.println(newNode);
			return newNode;
		}else {
			this.head = newNode;
			this.tail = newNode;
			return newNode;
		}
		
		
		
//		if(element != null) {
//			
//		}
	}
	
	public T get(int index){
		Node<T> current = new Node<>(); 
				current = this.head;
		if(index ==0) {
			return this.head.data;
		}else {
			for(int i = 0; i< index; i++) {
				current = current.next;
			}
			return current.data; 
		}
		
	}
	

}//end class

class Node<T>{
	
	T data ;
	public Node<T> next;
	public Node() {
		this.data = null;
		this.next = null;
		
	}
	public Node(T t) {
		this.data = t;
	}
}//end node
