package week11;

import java.util.List;

public interface Graph<V> {

	//return the number of vertices
	public int getSize();
	
	//return all vertices
	public List<V> getVertices();
	
	//return object for the index
	public V getVertex(int index);
	
	//return the index for the specified vertex object
	public int getIndex(V v);
	
	//return the neighbors of vertex with the specified index
	public List<Integer> getNeighbors(int index);
	
	/**
	 * return the degree for the specified vertex
	 */
	public int getDegree(int v);
	
	/**
	 * print the edges
	 */
	public void printEdges();
	
	/**
	 * clear
	 */
	public void clear();
	
	/**
	 * add a vertex to the graph
	 */
	public boolean addVertex(V vertex);
	
	/**add an edge to the graph */
	public boolean addEdge(int u, int v);
	
	/**add an edge with an edge Object */
	public boolean addEdge(Edge edge);
	
	/**remove a vertex using a vertex object*/
	public boolean remove(V v);
	
	/**remove an edge(u,v) from the graph */
	public boolean remove(int u, int v);
	
	/**depth first search tree*/
	public UnweightedGraph<V>.SearchTree dfs(int v);
	
	/**breadth first search tree*/
	public UnweightedGraph<V>.SearchTree bfs(int v);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
