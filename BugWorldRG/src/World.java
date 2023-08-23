import java.util.ArrayList;
import java.util.List;

public class World {
	private static int h = 15;
	private static int w = 45;
	private int x;
	private int y;
	private String bugSymbol;
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
		drawEmptyWorld("|", "-", 15, 45);
		drawBugCitizens(bugSymbol, x, y);
	}
	
	public static void drawEmptyWorld(String char1, String char2, int h, int w) {
		printHorizontal(char2, w);
		for (int j = 0; j < h - 2; j++) {
			printVertical(char1, w);
		}
		printHorizontal(char2, w);
	}
	
	public static void printVertical(String char1, int w) {
		System.out.print(char1);
		for (int j = 0; j < w - 2; j++) {
			System.out.print(' ');
		}
		System.out.println(char1);
	}
	
	public static void printHorizontal(String char2, int w) {
		for (int j = 0; j < w - 1; j++) {
			System.out.print(char2);
		}
		System.out.println(char2);
	}
	
	public static void drawBugCitizens(String bugSymbol, int x, int y) {
	}
	
	public static void main(String[] args) {
		// create a new bug with specified or randomized parameters then call default bug
		new World();
	}

}
