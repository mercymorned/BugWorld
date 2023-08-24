import java.util.ArrayList;
import java.util.List;

public class World {
	private static int h = 15;
	private static int w = 40;
	private List<Bug> bugCitizens = new ArrayList<>();
	private List<Plant> plants = new ArrayList<>();
	private List<Obstacle> obstacles = new ArrayList<>();

	public World() {
		// add bugs to draw
		Herbivore bw1 = new Herbivore();
		bugCitizens.add(bw1);
		Herbivore bw2 = new Herbivore();
		bugCitizens.add(bw2);
		Herbivore bw3 = new Herbivore();
		bugCitizens.add(bw3);
		Omnivore bw4 = new Omnivore();
		bugCitizens.add(bw4);
		Omnivore  bw5 = new Omnivore ();
		bugCitizens.add(bw5);
		Omnivore  bw6 = new Omnivore();
		bugCitizens.add(bw6);
		Carnivore bw7 = new Carnivore();
		bugCitizens.add(bw7);
		Carnivore bw8 = new Carnivore();
		bugCitizens.add(bw8);
		Carnivore bw9 = new Carnivore();
		bugCitizens.add(bw9);
		for (Bug bs : bugCitizens)
			System.out.println(bs.toText());
		// add plants to draw
		Plant pw1 = new Plant();
		plants.add(pw1);
		Plant pw2 = new Plant();
		plants.add(pw2);
		Plant pw3 = new Plant();
		plants.add(pw3);
		Plant pw4 = new Plant();
		plants.add(pw4);
		Plant pw5 = new Plant();
		plants.add(pw5);
		Plant pw6 = new Plant();
		plants.add(pw6);
		for (Plant p : plants)
			System.out.println(p.toString());
		//add obstacles to draw
		Obstacle ob1 = new Obstacle();
		obstacles.add(ob1);
		Obstacle ob2 = new Obstacle();
		obstacles.add(ob2);
		Obstacle ob3 = new Obstacle();
		obstacles.add(ob3);
		Obstacle ob4 = new Obstacle();
		obstacles.add(ob4);
		for (Obstacle o : obstacles)
			System.out.println(o.toString());
		// populate the world with bugs and plants
		drawWorld();
		updateWorld();
		drawWorld();
	}

	public void drawWorld() {
		System.out.print('+');
		for (int i = 0; i < w; i++)
			System.out.print('-');
		System.out.println('+');
		for (int y = 0; y < h; y++) {
			System.out.print('|');
			for (int x = 0; x < w; x++) {
				int i;
				for (i = 0; i < plants.size(); i++) {
					Plant p = plants.get(i);
					if (p.getX() == x && p.getY() == y) {
						System.out.print(p.getPlantSymbol());
						break;
					}
				}
					for (i = 0; i < obstacles.size(); i++) {
					Obstacle o = obstacles.get(i);
					if (o.getX() == x && o.getY() == y) {
						System.out.print(o.getObstSymbol());
						break;
					}
					
				}
				
				for (i = 0; i < bugCitizens.size(); i++) {
					Bug b = bugCitizens.get(i);
					if (b.getX() == x && b.getY() == y) {
						System.out.print(b.getSymbol());
						break;
					}
				}

				if (i == bugCitizens.size())
					System.out.print(' ');
			}
			System.out.println('|');
		}
		System.out.print('+');
		for (int i = 0; i < w; i++)
			System.out.print('-');
		System.out.println('+');
	}

	public void updateWorld() {
		for (Bug b : bugCitizens)
			b.moveBug();
	}

	/*
	 * my code from Wednesday morning public void drawWorld () { //create bugs
	 * within the environment Bug bw1 = new Bug(); bugCitizens.add(bw1); Bug bw2 =
	 * new Bug(); bugCitizens.add(bw2); Bug bw3 = new Bug(); bugCitizens.add(bw3);
	 * Bug bw4 = new Bug(); bugCitizens.add(bw4); Bug bw5 = new Bug();
	 * bugCitizens.add(bw5); Bug bw6 = new Bug(); bugCitizens.add(bw6); Bug bw7 =
	 * new Bug(); bugCitizens.add(bw7); Bug bw8 = new Bug(); bugCitizens.add(bw8);
	 * Bug bw9 = new Bug(); bugCitizens.add(bw9); //print list of bugs for (Bug bs :
	 * bugCitizens) System.out.println(bs.toText()); //draw Bug World in w and h
	 * bounds drawEmptyWorld("|", "-", 15, 45); drawBugCitizens(bugSymbol, x, y); }
	 * 
	 * public static void drawEmptyWorld(String char1, String char2, int h, int w) {
	 * printHorizontal(char2, w); for (int j = 0; j < h - 2; j++) {
	 * printVertical(char1, w); } printHorizontal(char2, w); }
	 * 
	 * public static void printVertical(String char1, int w) {
	 * System.out.print(char1); for (int j = 0; j < w - 2; j++) { System.out.print('
	 * '); } System.out.println(char1); }
	 * 
	 * public static void printHorizontal(String char2, int w) { for (int j = 0; j <
	 * w - 1; j++) { System.out.print(char2); } System.out.println(char2); }
	 * 
	 * public static void drawBugCitizens(String bugSymbol, int x, int y) { }
	 */

	public static void main(String[] args) {
		// create a new World to populate
		new World();
	}

}
