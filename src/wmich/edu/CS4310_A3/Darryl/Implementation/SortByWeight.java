package wmich.edu.CS4310_A3.Darryl.Implementation;

import java.util.Comparator;

import wmich.edu.CS4310_A3.Darryl.Interface.IEdge;

public class SortByWeight implements Comparator<IEdge> {

	@Override
	public int compare(IEdge o1, IEdge o2) {
		// TODO Auto-generated method stub
		return o1.getWeight()-o2.getWeight();
	}

}
