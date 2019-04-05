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
}
