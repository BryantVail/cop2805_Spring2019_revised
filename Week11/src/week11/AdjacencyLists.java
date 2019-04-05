package week11;

import java.util.List;

public class AdjacencyLists {

	public static void main(String[] args) {
		// 
		
		//an Array[] of type 'List', such that, each index, holds a list of items
		//	each index represents a Vertex, each list entry represents a Vertex that has a connecting Edge
		List<Integer>[] neighbors = new List[12];
		//[0]
		neighbors[0].add(1);
		neighbors[0].add(3);
		neighbors[0].add(5);
		//[1]
		neighbors[1].add(0);
		neighbors[1].add(2);
		neighbors[1].add(3);
		//[2]
		neighbors[2].add(1);
		neighbors[2].add(3);
		neighbors[2].add(4);
		neighbors[2].add(10);
		//[3]
		neighbors[3].add(0);
		neighbors[3].add(1);
		neighbors[3].add(2);
		neighbors[3].add(4);
		neighbors[3].add(5);
		//[4]
		neighbors[4].add(2);
		neighbors[4].add(3);
		neighbors[4].add(5);
		neighbors[4].add(7);
		neighbors[4].add(8);
		neighbors[4].add(10);
		//[5]
		neighbors[5].add(0);
		neighbors[5].add(3);
		neighbors[5].add(4);
		neighbors[5].add(6);
		neighbors[5].add(7);
		//[6]
		neighbors[6].add(7);
		neighbors[6].add(5);
		//[7]
		neighbors[7].add(4);
		neighbors[7].add(5);
		neighbors[7].add(6);
		neighbors[7].add(8);
		//[8]
		neighbors[8].add(4);
		neighbors[8].add(7);
		neighbors[8].add(9);
		neighbors[8].add(10);
		neighbors[8].add(11);
		//[9]
		neighbors[9].add(8);
		neighbors[9].add(11);
		//[10]
		neighbors[10].add(2);
		neighbors[10].add(4);
		neighbors[10].add(8);
		neighbors[10].add(11);
		//[11]
		neighbors[11].add(10);
		neighbors[11].add(9);
		neighbors[11].add(8);
		

		for(List<Integer> i : neighbors) {
			System.out.println("index: "+ i);
			for(Integer j : i) {
				System.out.println("Integer: "+j+", representing an Edge");
			}
		}
	}

}
