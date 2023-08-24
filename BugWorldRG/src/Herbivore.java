import java.util.Random;

public class Herbivore extends Bug {
	private String species;
	private char symbol;

	@Override
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	// code to generate random species in Bug World
	private void randomSpecies() {
		String[] speciesList = { "bee", "Grasshopper", "Butterfly", "Moth" };
		int speciesIndex = new Random().nextInt(speciesList.length);
		species = speciesList[speciesIndex];
		if (!species.isEmpty()) {
			symbol = species.charAt(0);
		} else {
			symbol = '?';
		}
	}

	@Override
	public String toText() {
		return "Bug [ species = " + species + ", name = " + this.name + ", symbol = " + symbol + ", x = " + x + ", y = "
				+ y + ", energy = " + energy + ", idNum = " + idNum + " ]";
	}

	@Override
	public String toString() {
		return "Bug [ species = " + species + ", name = " + name + ", symbol = " + symbol + " ]";
	}

	public Herbivore() {
		randomSpecies();
	}

	public Herbivore(String name, int x, int y, int energy, int idNum, String species, char symbol) {
		super(name, x, y, energy, idNum);
		this.species = species;
		this.symbol = symbol;
	}

}
