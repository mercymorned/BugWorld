import java.util.Comparator;

public class BugSpeciesComparator implements Comparator <Bug> {

	public BugSpeciesComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Bug b1, Bug b2) {
		// TODO Auto-generated method stub
		if (b1 == null && b2 == null) {return 0;}
		if (b1 == null) {return -1;}
		if (b2 == null) {return 1;}
		return b1.getSpecies().compareTo((b2.getSpecies()));
	}

}
