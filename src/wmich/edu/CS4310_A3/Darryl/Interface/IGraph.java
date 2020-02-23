package wmich.edu.CS4310_A3.Darryl.Interface;

import java.util.List;

import wmich.edu.CS4310_A3.Darryl.Implementation.DisjointSet;

public interface IGraph {

	//method that adds a new edge to edge list with source, destination and weight
	void addEdge(int source, int destination, int weight);

	//method that sets the edges of a graph
	void setAllEdges(List<IEdge>  allEdges);

	//method that returns the edges of a graph
	List<IEdge> getAllEdges();

	//method that sets the vertices of a graph
	void setVertices(int vertices);

	//method that returns the vertices of a graph
	int getVertices();

	//method that returns the disjoint set of the graph
	DisjointSet getDisjoint();

	//method that sets the parent disjoint set of the graph
	void setDisjoint(DisjointSet disjoint);

	//method that returns the min spanning tree of the graph
	List<IEdge> getMST();

	//method that sets the min spanning tree of the graph
	void setMST(List<IEdge> mst);

	//method that constructs MST from the graph and returns the min cost
	int calculateMST();
              
	//method that finds prints the resulting MST
	void printMST();

	//method that finds prints the resulting MST
	void printGraph();
              
}



