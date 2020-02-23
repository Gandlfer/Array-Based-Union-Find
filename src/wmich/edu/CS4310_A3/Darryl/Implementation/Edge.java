package wmich.edu.CS4310_A3.Darryl.Implementation;

import wmich.edu.CS4310_A3.Darryl.Interface.IEdge;

public class Edge implements IEdge {
	
	private int src;
	private int dest;
	private int weight;
	
	public Edge(int s,int d,int w) {
		setSource(s);
		setDestination(d);
		setWeight(w);
	}
	
	@Override
	public void setSource(int source) {
		// TODO Auto-generated method stub
		src=source;
	}

	@Override
	public int getSource() {
		// TODO Auto-generated method stub
		return src;
	}

	@Override
	public void setDestination(int destination) {
		// TODO Auto-generated method stub
		dest=destination;
	}

	@Override
	public int getDestination() {
		// TODO Auto-generated method stub
		return dest;
	}

	@Override
	public void setWeight(int weight) {
		// TODO Auto-generated method stub
		this.weight=weight;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}
	public String toString() {
		return "Source: "+src+" Destination: "+dest+" Weight: "+weight;
	}
}
