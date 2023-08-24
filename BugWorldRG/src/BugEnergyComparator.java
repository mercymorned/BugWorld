import java.util.Comparator;

public class BugEnergyComparator implements Comparator<Bug> {

	public BugEnergyComparator() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(Bug b1, Bug b2) {
		// TODO Auto-generated method stub
		return -(b2.getEnergy() - b1.getEnergy());
	}

}
