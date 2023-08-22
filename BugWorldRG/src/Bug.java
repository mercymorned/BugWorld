import java.util.Random;

public class Bug {
	private String species;
	private String name;
	private char symbol;
	private int x;
	private int y;
	private int energy;
	private int idNum;

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
		randomSpecies();
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

	public Bug(String species, String name, char symbol, int x, int y, int energy, int idNum) {
		super();
		this.species = species;
		this.name = name;
		this.symbol = symbol;
		this.x = x;
		this.y = y;
		this.energy = energy;
		this.idNum = idNum;
	}

	public String toText() {
		return "Bug [ species = " + species + ", name = " + name + ", symbol = " + symbol + ", x = " + x + ", y = " + y
				+ ", energy = " + energy + ", idNum = " + idNum + " ]";
	}

	@Override
	public String toString() {
		return "Bug [ species = " + species + ", name = " + name + ", symbol = " + symbol + " ]";
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
		return newX > 0 && newX < 500 && newY > 0 && newY < 500;
	}

	private int randomDirection() {
		return (int) (Math.random() * 4);
	}

	// code to generate random species in Bug World
	private void randomSpecies() {
		String[] speciesList = { "bee", "fly", "ladybug", "beetle", "moth", "weta", "butterfly", "spider", "worm",
				"ant", "centipede" };
		int speciesIndex = new Random().nextInt(speciesList.length);
		species = speciesList[speciesIndex];
		if (!species.isEmpty()) {
			symbol = species.charAt(0);
		} else {
			symbol = '?';
		}
	}

	private void randomName() {
		String[] nameList = { "Lyd", "Sash", "Jay", "Lindsay", "Evan", "Michelle", "Amaranta", "Kristina", "Jehan",
				"Matt", "Anna", "Gavin", "Nimi", "Beth", "Leon" };
		int nameIndex = new Random().nextInt(nameList.length);
		name = nameList[nameIndex];
	}


	private void randomX() {
		this.x = (int) (Math.random() * 500); //assigns x position between 0 and 500
	}
	
	private void randomY() {
		this.y = (int) (Math.random() * 500); //assigns y position between 0 and 500
	}
	
	private void randomEnergy() {
		this.energy = (int) (Math.random() * 50); //assigns energy level between 0 and 50
	}
	
	private void randomIdNum() {
		int idNum = (int) (Math.random() * 50); //assigns energy level between 0 and 50
	}
}
