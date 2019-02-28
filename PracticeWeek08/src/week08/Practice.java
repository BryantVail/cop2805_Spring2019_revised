package week08;

public class Practice {

	public static void main(String[] args) {

		Node node1 = new Node(	10, null);
		Node node2 = new Node(	10, node1);
		Node node3 = new Node(	10, node2);
		Node node4 = new Node(	10, node3);
		Node node5 = new Node(	10, node4);
		Node node6 = new Node(	10, node5);
		Node node7 = new Node(	10, node6);
		Node root = new Node(	10, node7);

		System.out.println("The number sum is " + root.getSum(root));
	}
}



//class Node {
//	public int number;
//	public Node nextNode;
//
//	public Node(int number, Node nextNode) {
//		this.number = number;
//		this.nextNode = nextNode;
//	}
//
//	public int getSumIterative() {
//		int sum = 0;
//		Node currentNode = this;
//		while (currentNode != null) {
//			sum += currentNode.number;
//			currentNode = currentNode.nextNode;
//		}
//		return sum;
//	}
//	
//	public int getSum(Node nextNode) {
//		Node current = nextNode;
//		
//		if(current.nextNode == null) {
//			return this.number;
//		}
//		else {
//			return this.number += current.getSum(current.nextNode);
//		}
//	}
//}


