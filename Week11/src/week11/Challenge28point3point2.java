package week11;

import java.util.ArrayList;
import java.util.List;

public class Challenge28point3point2 {

	public static void main(String[] args) {
		// 
		
		List<ArrayList<Edge>> ael = new ArrayList<>();
		
		//6 vertices: [0,1,2,3,4,5]
		/*
		 * {[0],[1,2,3,4,5]},
		 * {[1],[0,2,3,4]},
		 * {[2],[0,1,3,4]},
		 * {[3],[0,1,2,4,5]},
		 * {[4],[0,1,2,3]},
		 * {[5],[0,3]}
		 */
		ael.add(new ArrayList<Edge>());
			ael.get(0).add(new Edge(0, 1));
			ael.get(0).add(new Edge(0, 2));
			ael.get(0).add(new Edge(0, 3));
			ael.get(0).add(new Edge(0, 4));
			ael.get(0).add(new Edge(0, 5));
		ael.add(new ArrayList<Edge>());
			ael.get(1).add(new Edge(1, 0));
			ael.get(1).add(new Edge(1, 2));
			ael.get(1).add(new Edge(1, 3));
			ael.get(1).add(new Edge(1, 4));
		ael.add(new ArrayList<Edge>());
			ael.get(2).add(new Edge(2, 0));
			ael.get(2).add(new Edge(2, 1));
			ael.get(2).add(new Edge(2, 3));
			ael.get(2).add(new Edge(2, 4));
		ael.add(new ArrayList<Edge>());
			ael.get(3).add(new Edge(3, 0));
			ael.get(3).add(new Edge(3, 1));
			ael.get(3).add(new Edge(3, 2));
			ael.get(3).add(new Edge(3, 4));
			ael.get(3).add(new Edge(3, 5));
		ael.add(new ArrayList<Edge>());
			ael.get(4).add(new Edge(4, 0));
			ael.get(4).add(new Edge(4, 1));
			ael.get(4).add(new Edge(4, 2));
			ael.get(4).add(new Edge(4, 3));
		ael.add(new ArrayList<Edge>());
			ael.get(5).add(new Edge(5, 0));
			ael.get(5).add(new Edge(5, 3));
			
		int counter = 0;
		for(ArrayList<Edge> edges : ael) {
			System.out.println("Index: "+counter);
			counter++;
			for(Edge edge : edges) {
				System.out.print("\t"+edge.v);
			}
			System.out.println();
		}
		System.out.println("complete");
			
			
			
			
		
			
			
			
			
		

	}

}
