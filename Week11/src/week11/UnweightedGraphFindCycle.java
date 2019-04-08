package week11;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * @author bryant vail
 *
 */

public class UnweightedGraphFindCycle extends UnweightedGraph{

	/**
	 * find a cycle starting at 'vertex' 'u', 
	 * public LIst<Integer> getACycle(int u)
	 */
	
	public List<Integer> getACycle(int u){
		Stack<Integer> cycleList = new Stack<>();
		cycleList.push(u);
		ArrayList<Integer> cycleVerti = new ArrayList<>();
		
		for(int i = 0; i< this.getNeighbors(u).size(); i++) {
			//get vertex, grab neighbors, get edges in order & check them against existing edges
			//that have been evaluated
			if(cycleList.contains(getNeighbors(u).get(i))){
				List<Integer> verti = new ArrayList<>();
				
						for(int j : cycleList) {
							verti.add(this.vertices.indexOf(getVertex(j)));
						};
						return verti;
			}
			else {
				cycleList.push(i);
			}
		}
		return null;
	}
	
//	public boolean getACycle(int vertex, boolean[] visited, boolean[] recursiveArray){
//		
//		visited[vertex] = 			true;
//		recursiveArray[vertex] = 	true;
//		Stack cycleList = new Stack();
//		
//		
//		//recursive call to the adjacent vertices
//		for(int i = 0; i< this.getNeighbors(vertex).size(); i++) {
//			//if not already listed
//			int adjacentVertex = this.getNeighbors(vertex).indexOf(i);
//			if(!visited[adjacentVertex] && getACycle(adjacentVertex, visited, recursiveArray)) {
//				cycleList.push(adjacentVertex);
//			}
//		}
//	}
}
