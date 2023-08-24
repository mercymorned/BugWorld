import java.util.Random;

public class Obstacle {
	private String obstSymbol;
	private int x;
	private int y;
	private int size;
	private int idNum;
	static int counter = 1;

	public Obstacle() {
		randomSymbol();
		randomX();
		randomY();
		randomSize();
		randomIdNum();
	}
	
	private void randomSymbol() {
		String[] symbolList = {"🗻", "🪨", "🗿", "🏠"};
		int symbolIndex = new Random().nextInt(symbolList.length);
		obstSymbol = symbolList[symbolIndex];
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
	public String getObstSymbol() {
		return obstSymbol;
	}

	public void setObstymbol(String obstSymbol) {
		this.obstSymbol = obstSymbol;
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
		return "Obstacle [ symbol = " + obstSymbol + ", x = " + x + ", y = " + y + ", size = " + size + ", ID " + idNum +" ]";
	}

}
