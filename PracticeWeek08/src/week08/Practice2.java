package week08;

public class Practice2 {

	public static void main(String[] args) {

		Node tree = new Node(50);
		insertNode(tree, 10);
		insertNode(tree, 1);
		insertNode(tree, 35);
		insertNode(tree, 25);
		insertNode(tree, 80);
		insertNode(tree, 51);

		System.out.println("Root value is " + tree.number);
		System.out.println("does the number 5 exist? "+ tree.find(25));
	}

	public static void insertNode(Node root, int newNodeValue) {

		if (root == null)
			root = new Node(newNodeValue);
		else {
			// Locate the parent node
			Node parent = null;
			Node current = root;
			while (current != null)
				if (newNodeValue < current.number) {
					parent = current;
					current = current.left;
				} else if (newNodeValue > current.number) {
					parent = current;
					current = current.right;
				} else
					return; // Duplicate node not inserted

			// Create the new node and attach it to the parent node
			if (newNodeValue < parent.number)
				parent.left = new Node(newNodeValue);
			else
				parent.right = new Node(newNodeValue);
		}
	}
	
	
	
	
}

class Node {
	public int number;
	public Node left = null;
	public Node right = null;

	public Node(int number) {
		this.number = number;
	}
	
	public int PrintTree() {
		
		if(left != null) {
			PrintTree();
			return left.number;
		}
		if(right != null) {
			PrintTree();
//			System.out.println(right.number);
			return left.number;
		}
		
	}//end printTree
	
	public boolean find(int value) {
		
		if(this.number == value) {
			return true;
		}
		if(find(this.left.number)) {
			return true;
		}
		if(find(this.left.number)) {
			return true;
		}
		return false;
		
	}
	
	
}
