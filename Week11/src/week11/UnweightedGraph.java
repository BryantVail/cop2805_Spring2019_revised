package week11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UnweightedGraph<V> implements Graph<V> {

	//store vertices
	protected List<V> vertices = new ArrayList<>();
	
	//Adjacency Edge Lists
	protected List<List<Edge>> neighbors = new ArrayList<>();
	
	/**construct an empty graph*/
	protected UnweightedGraph() {
		
	}
	
	/**contruct a graph from Vertices and Edges in Arrays*/
	protected UnweightedGraph(V[] vertices, int[][] edges) {
		for(int i  = 0; i< vertices.length; i++) {
			addVertex(vertices[i]);
		}
		createAdjacencyLists(edges, vertices.length);
	}
	
	/**construct a graph from vertices and Edges stored in a list*/
	protected UnweightedGraph(List<V> vertices, List<Edge> edges) {
		for(int i = 0; i< vertices.size(); i++) {
			addVertex(vertices.get(i));
		}
		createAdjacencyLists(edges, vertices.size());
	}
	
	/**construct a graph for integer vertices 0,1,2 and edge list */
	protected UnweightedGraph(List<Edge> edges, int numberOfVertices) {
		for(int i = 0; i<numberOfVertices; i++) {
			addVertex((V)(new Integer(i)));//vertices is {0,1,...}
			
		}
		createAdjacencyLists(edges, numberOfVertices);
	}
	
	/**create adjacency lists for each vertex with Array[]*/
	private void createAdjacencyLists(int[][] edges, int numberOfVertices) {
		for(int i = 0; i<edges.length; i++) {
			addEdge(edges[i][0], edges[i][1]);
		}
	}
	
	/**create adjacency lists for each vertex with List<Edge>*/
	private void createAdjacencyLists(List<Edge> edges, int numberOfVertices) {
		for(Edge edge: edges) {
			addEdge(edge.u, edge.v);
		}
	}
	
	//OVERRIDE METHODS
	//OVERRIDE METHODS
	@Override/**return the number of vertices in the Graph*/
	public int getSize() {
		return this.vertices.size();
	}
	
	@Override /**return the vertices in the Graph*/
	public List<V> getVertices(){
		return this.vertices;
	}
	
	@Override /**return the object for the specified Vertex*/
	public V getVertex(int index) {
		return this.vertices.get(index);
	}
	
	@Override/**return index of specified vertex*/
	public int getIndex(V v) {
		return this.vertices.indexOf(v);
	}
	
	@Override/**return neighbors of the specified vertex */
	public List<Integer> getNeighbors(int index){
		List<Integer> result = new ArrayList<>();
		
		for(Edge edge: this.neighbors.get(index)) {
			//add the value from the edge that doesn't represent the current index as an Edge connection itself; 'edge.v'
			//where 'edge.u' would be the index
			result.add(edge.v);
		}
		return result;
	}
	
	@Override/**return the degree for the vertex specified*/
	public int getDegree(int v) {
		return neighbors.get(v).size();//return the size of the list at this index
	}
	
	@Override/**print the edges*/
	public void printEdges() {
		for(int u= 0; u< neighbors.size(); u++) {
			System.out.print(getVertex(u) + " (" + u+ ") : ");
			//loop within the vertex
			for(Edge edge: this.neighbors.get(u)) {
				System.out.print("("+getVertex(edge.u)+ ", "+ getVertex(edge.v)+ ") ");
			}
		}
	}
	
	@Override/**clear the graph*/
	public void clear() {
		this.vertices.clear();
		this.neighbors.clear();
	}
	
	@Override/**add a vertex to the graph, with a vertex object*/
	public boolean addVertex(V vertex) {
		if(!this.vertices.contains(vertex)) {
			this.vertices.add(vertex);
			this.neighbors.add(new ArrayList<Edge>());
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override/**add an edge to the graph*/
	public boolean addEdge(Edge edge) {
		if(edge.u <0|| edge.u>getSize() -1){
			throw new IllegalArgumentException("No such index: " + edge.u);
		}
		if(edge.v < 0 || edge.v > getSize() -1) {
			throw new IllegalArgumentException("No such index: " + edge.v);
		}
		if(!neighbors.get(edge.u).contains(edge)) {
			neighbors.get(edge.u).add(edge);
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override/**add an Edge to the graph*/
	public boolean addEdge(int u, int v) {
		return addEdge(new Edge(u,v));
	}
	
	@Override/**DFS tree starting from vertex v*/
	public SearchTree dfs(int v) {
		List<Integer> searchOrder = new ArrayList<>();
		int[] parent = new int[this.vertices.size()];
		for(int i = 0; i< parent.length; i++) {
			parent[i] = -1; //initialize parent[i] to -1? 
		}
		
		//mark visited vertices
		boolean[] isVisited = new boolean[vertices.size()];
		
		//recursively search
		dfs(v, parent, searchOrder, isVisited);
		
		//return a search tree
		return new SearchTree(v, parent, searchOrder);
	}
	
	/**DFS recursive, overloaded*/
	private void dfs(int v, int[] parent, List<Integer> searchOrder, boolean[] isVisited) {
		
		//store the visited vertex
		searchOrder.add(v);
		isVisited[v] = true;//Vertex v visited
		
		for(Edge edge: neighbors.get(v)) {
			if(!isVisited[edge.v]) {
				parent[edge.v] = v;//the parent of vertex 'w' is 'v'
				dfs(edge.v, parent, searchOrder, isVisited);//recursive search
			}
		}
	}//end dfs overload
	
	@Override/**starting BFS from vertex v*/
	public SearchTree bfs(int v) {
		List<Integer> searchOrder = new ArrayList<>();
		int[] parent = new int[this.vertices.size()];
		
		for(int i = 0; i< parent.length; i++) {
			parent[i] = -1; //init parent[i] to -1? 
		}
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		//make the bool array for the 'isVisited' the same size as the list
		boolean[] isVisited = new boolean[this.vertices.size()];
		
		queue.offer(v);//Enqueue v
		isVisited[v] = true;
		
		while(!queue.isEmpty()) {
			int u = queue.poll();//	dequeue to u
			searchOrder.add(u);//	u searched
			for(Edge edge: this.neighbors.get(u)) {
				if(!isVisited[edge.v]) {
					queue.offer(edge.v);
					parent[edge.v]= u ;//the value of the vertex index = 'u';
					isVisited[edge.v]= true; 
					
				}
			}
		}
		return new SearchTree(v, parent, searchOrder);
	}//end BFS
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
