import java.util.Random;

public class Bug {
	private String species;
	protected String name;
	private char symbol;
	protected int x;
	protected int y;
	protected int energy;
	protected int idNum;
	static int counter = 1;

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public Bug() {
		// randomSpecies();
		randomName();
		randomX();
		randomY();
		randomEnergy();
		randomIdNum();

// Code below is out-dated, from initial one type of default bug
//		this.species = "bee";
//		this.name = "Bumblebee";
//		this.symbol = '@';
//		this.x = 40;
//		this.y = 40;
//		this.energy = 500;
//		this.idNum = 100;
	}

	public Bug(String name, int x, int y, int energy, int idNum) {
		super();
		// this.species = species;
		this.name = name;
		// this.symbol = symbol;
		this.x = x;
		this.y = y;
		this.energy = energy;
		this.idNum = idNum;
	}

	public String toText() {
		return "Bug [ name = " + name + ", x = " + x + ", y = " + y + ", energy = " + energy + ", idNum = " + idNum
				+ " ]";
	}

	@Override
	public String toString() {
		return "Bug [ name = " + name + " ]";
	}

	// Task 4: create move feature
	public void moveBug() {
		int direction = randomDirection();
		int newX = x;
		int newY = y;
		if (direction == 0) {
			newY--;
		} else if (direction == 1) {
			newX++;
		} else if (direction == 2) {
			newY++;
		} else if (direction == 3) {
			newX--;
		}
		if (withinBounds(newX, newY)) {
			x = newX;
			y = newY;
		}
	}

	private boolean withinBounds(int newX, int newY) {
		return newX > 0 && newX < 40 && newY > 0 && newY < 15;
	}

	private int randomDirection() {
		return (int) (Math.random() * 4);
	}

	// code to generate random species in Bug World
//	private void randomSpecies() {
//		String[] speciesList = {"bee", "fly", "ladybug", "beetle", "moth", "weta", "butterfly", "spider", "worm",
//				"ant", "centipede"};
//		int speciesIndex = new Random().nextInt(speciesList.length);
//		species = speciesList[speciesIndex];
//		if (!species.isEmpty()) {
//			symbol = species.charAt(0);
//		} else {
//			symbol = '?';
//		}
//	}

	private void randomName() {
		String[] nameList = { "Lyd", "Sash", "Jay", "Lindsay", "Evan", "Michelle", "Amaranta", "Kristina", "Jehan",
				"Matt", "Anna", "Gavin", "Nimi", "Beth", "Leon", "Bianca", "Thumin", "Veppam", "Jhandra", "Xanthus",
				"Caeso", "Nadya", "Kjell", "Aurelius", "Eliazar", "Chrys", "Aalea" };
		int nameIndex = new Random().nextInt(nameList.length);
		name = nameList[nameIndex];
	}

	private void randomX() {
		this.x = (int) (Math.random() * 40); // assigns x position between 0 and 15
	}

	private void randomY() {
		this.y = (int) (Math.random() * 15); // assigns y position between 0 and 40
	}

	private void randomEnergy() {
		this.energy = (int) (Math.random() * 100); // assigns energy level between 0 and 100
	}

	private void randomIdNum() {
		this.idNum = counter++;
	}
}
