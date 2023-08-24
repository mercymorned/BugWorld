import java.util.Comparator;

public class PlantSizeComparator implements Comparator <Plant> {

	public PlantSizeComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Plant p1, Plant p2) {
		// TODO Auto-generated method stub
		return -(p2.getSize()  - p1.getSize());
	}

}
