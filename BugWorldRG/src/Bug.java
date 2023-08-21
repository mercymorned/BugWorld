
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
		this.species = "bee";
		this.name = "Bumblebee";
		this.symbol = '@';
		this.x = 40;
		this.y = 40;
		this.energy = 500;
		this.idNum = 100;
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

}
