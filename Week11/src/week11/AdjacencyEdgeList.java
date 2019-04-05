package week11;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyEdgeList {

	public static void main(String[] args) {
		// 
		
		List<ArrayList<Edge>> neighbors = new ArrayList<>();
		
		
		
		//get each index & insert The 'new Edge',
		//adding an arrayList at index[0]
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(0).add(new Edge(0,1));
			neighbors.get(0).add(new Edge(0,3));
			neighbors.get(0).add(new Edge(0,5));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(1).add(new Edge(1, 0));
			neighbors.get(1).add(new Edge(1, 2));
			neighbors.get(1).add(new Edge(1, 3));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(2).add(new Edge(2, 1));
			neighbors.get(2).add(new Edge(2, 3));
			neighbors.get(2).add(new Edge(2, 4));
			neighbors.get(2).add(new Edge(2, 10));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(3).add(new Edge(3, 0));
			neighbors.get(3).add(new Edge(3, 1));
			neighbors.get(3).add(new Edge(3, 2));
			neighbors.get(3).add(new Edge(3, 4));
			neighbors.get(3).add(new Edge(3, 5));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(4).add(new Edge(4, 2));
			neighbors.get(4).add(new Edge(4, 3));
			neighbors.get(4).add(new Edge(4, 5));
			neighbors.get(4).add(new Edge(4, 7));
			neighbors.get(4).add(new Edge(4, 8));
			neighbors.get(4).add(new Edge(4, 10));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(5).add(new Edge(5, 0));
			neighbors.get(5).add(new Edge(5, 3));
			neighbors.get(5).add(new Edge(5, 4));
			neighbors.get(5).add(new Edge(5, 6));
			neighbors.get(5).add(new Edge(5, 7));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(6).add(new Edge(6, 5));
			neighbors.get(6).add(new Edge(6, 7));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(7).add(new Edge(7, 4));
			neighbors.get(7).add(new Edge(7, 5));
			neighbors.get(7).add(new Edge(7, 6));
			neighbors.get(7).add(new Edge(7, 8));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(8).add(new Edge(8, 4));
			neighbors.get(8).add(new Edge(8, 7));
			neighbors.get(8).add(new Edge(8, 9));
			neighbors.get(8).add(new Edge(8, 10));
			neighbors.get(8).add(new Edge(8, 11));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(9).add(new Edge(9, 8));
			neighbors.get(9).add(new Edge(9, 11));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(10).add(new Edge(10, 2));
			neighbors.get(10).add(new Edge(10, 4));
			neighbors.get(10).add(new Edge(10, 8));
			neighbors.get(10).add(new Edge(10, 11));
		neighbors.add(new ArrayList<Edge>());
			neighbors.get(11).add(new Edge(11, 10));
			neighbors.get(11).add(new Edge(11, 9));
			neighbors.get(11).add(new Edge(11, 8));
			
		
		
	}

}
