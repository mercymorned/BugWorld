import java.util.ArrayList;
import java.util.List;

public class World {
	private int h = 500;
	private int w = 500;
	private List <Bug> bugCitizens = new ArrayList<>();
	
	public World () {
		drawWorld();
	}
	
	public void drawWorld () {
		//create bugs within the environment
		Bug bw1 = new Bug();
		bugCitizens.add(bw1);
		Bug bw2 = new Bug();
		bugCitizens.add(bw2);
		Bug bw3 = new Bug();
		bugCitizens.add(bw3);
		Bug bw4 = new Bug();
		bugCitizens.add(bw4);
		Bug bw5 = new Bug();
		bugCitizens.add(bw5);
		Bug bw6 = new Bug();
		bugCitizens.add(bw6);
		Bug bw7 = new Bug();
		bugCitizens.add(bw7);
		Bug bw8 = new Bug();
		bugCitizens.add(bw8);
		Bug bw9 = new Bug();
		bugCitizens.add(bw9);
		//print list of bugs
		for (Bug bs : bugCitizens)
		System.out.println(bs.toText());
		//draw Bug World in w and h bounds
		
	}
	
	public static void main(String[] args) {
		// create a new bug with specified or randomized parameters then call default bug
		new World();
	}

}
