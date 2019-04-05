package week11;

import java.util.ArrayList;

public class Listing28point1EdgedotJava {
	
	public static void main(String[] args) {
		
		ArrayList<Edge> list = new ArrayList<>();
		list.add(new Edge(0,1));
		list.add(new Edge(0,3));
		list.add(new Edge(0,5));
		
		
		
	}
	
}

class Edge{
	int u;
	int v;
	
	public Edge(int u, int v) {
		this.u = u;
		this.v = v;
		
	}
	
	//cast the object to an Edge type, then access the 'u' or the 'v'
	public boolean equals(Object o) {
		return u == ((Edge)o).u && v == ((Edge)o).v;
	}
}
