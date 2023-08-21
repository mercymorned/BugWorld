import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private List<Bug> bugs = new ArrayList<>();

	public static void main(String[] args) {
		//create a new bug with specified parameters then call default bug
		Bug ladybug = new Bug ("ladybug", "Lady Bird", 'A', 50, 50, 100, 123);
		Bug bee = new Bug();
		System.out.println(bee.toString()); //demonstrates toString
		System.out.println(ladybug.toText()); //demonstrates toText
		
		//set up Scanner
		Scanner myBug = new Scanner(System.in);
		System.out.println("Enter bug species");
		String species = myBug.nextLine();
		System.out.println("Enter bug name");
		String name = myBug.nextLine();
		System.out.println("Enter bug symbol");
		char symbol = myBug.next().charAt(0);
		System.out.println("Enter bug horizontal position");
		int x = myBug.nextInt();
		System.out.println("Enter bug vertical position");
		int y = myBug.nextInt();
		System.out.println("Enter bug energy level");
		int energy = myBug.nextInt();
		System.out.println("Enter bug ID Number");
		int idNum = myBug.nextInt();
		System.out.println("Bug [species=" + species + ", name=" + name + ", symbol=" + symbol + ", x=" + x + ", y=" + y
				+ ", energy=" + energy + ", idNum=" + idNum + "]");
	}

}
