package week10;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GraphPractice {

	public static void main(String[] args) {
		// classification tree
		Node animalia = new Node("Animal");

		Node amphibian = new Node("Amphibian");
		Node reptile = new Node("Reptile");

		Node snake = new Node("Snake");
		Node gator = new Node("Gator");
		reptile.children.add(snake);
		reptile.children.add(gator);

		Node frog = new Node("Frog");
		Node lizard = new Node("Lizard");
		amphibian.children.add(frog);
		amphibian.children.add(lizard);

		animalia.children.add(reptile);
		animalia.children.add(amphibian);
		
		while()
		animalia.
		
		
		

	}

}


class Node {
	String data;
	List<Node> children = new ArrayList<Node>();
	
	public int traversalCount() {
		if(this.children.isEmpty() == false) {
			for()
		}
	}
	public int traversalCount(Node childParameter) {
		int counter;
		List<Node> nodes = new ArrayList<Node>(childParameter);
		if(nodes.children.isEmpty() == false) {
			
			for(Node child : nodes){
				counter++;
				traversalCount(child);
			}
		}
	}
	
	public int stackCounter(Node root) {
		int result = 0;
		
		Stack<Node> stack= new Stack<>();
		stack.push(root);
		
		//while Stack is NOT empty, evaluate the Stack
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			result++;
			for(Node child : stack) {
				stack.push(child);
			}
		}
		return result;
	}//end stack counter
	
	public Node(String data) {
		this.data = data;
	}
	
}