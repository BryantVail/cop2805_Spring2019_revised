import java.util.ArrayList;

//Create an arrayList
//	make a Java Array, and maintain the current capacity & size in values
//	Generic
//step5, implement remove
//		shift

public class PracticeWeek07 {
	
	public static void main(String[] args) {
		MyLinkedList<Integer> ints = new MyLinkedList<>();
		ints.add(113);
		ints.add(45);
		ints.add(1001);
		
//		ints.remove(0);
		System.out.println("The Values in the LinkedList 'ints' are: "+ ints);
		boolean truth = true;
		Node<Integer> current = ints.getHead();
		while(truth) {
			
			if(current == ints.getTail()) {
				System.out.println(arg0);
			}
		}
		System.out.println(ints.get(2));
		
	}
	
	

}
