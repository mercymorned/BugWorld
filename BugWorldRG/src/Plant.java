import java.util.Random;

public class Plant {
	private String plantSymbol;
	private int x;
	private int y;
	private int size;
	private int idNum;
	static int counter = 1;

	public Plant() {
		randomSymbol();
		randomX();
		randomY();
		randomSize();
		randomIdNum();
	}
	
	private void randomSymbol() {
		String[] symbolList = {"🌱", "🌾", "🌸", "🍄"};
		int symbolIndex = new Random().nextInt(symbolList.length);
		plantSymbol = symbolList[symbolIndex];
	}
	private void randomX() {
		this.x = (int) (Math.random() * 40); // assigns x position between 0 and 15
	}
	private void randomSize() {
		this.size = (int) (Math.random() * 9); // assigns size between 0 and 9
	}
	private void randomY() {
		this.y = (int) (Math.random() * 15); // assigns y position between 0 and 40
	}
	private void randomIdNum() {
		this.idNum = counter++;
	}
	public String getPlantSymbol() {
		return plantSymbol;
	}

	public void setPlantSymbol(String plantSymbol) {
		this.plantSymbol = plantSymbol;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	@Override
	public String toString() {
		return "Plant [ symbol = " + plantSymbol + ", x = " + x + ", y = " + y + ", size = " + size + ", ID " + idNum +" ]";
	}

}
