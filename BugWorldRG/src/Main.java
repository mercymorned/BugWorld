import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private List<Bug> bugs = new ArrayList<>();
	
	public Main() {
		Bug ladybug = new Bug("ladybug", "Lady Bird", 'A', 50, 50, 100, 123);
		bugs.add(ladybug);
		Bug defaultBug = new Bug(); //default bug defined in Bug class
		bugs.add(defaultBug);
		Bug spider = userInput(); //asks user to make a spider
		bugs.add(spider);
		for (Bug bs : bugs)
		System.out.println(bs.toText()); // demonstrates toText
		
		//testing move function
		ladybug.moveBug();
		System.out.println(ladybug.toText());
		
	}

	public static void main(String[] args) {
		// create a new bug with specified parameters then call default bug
		new Main();
	}

	public Bug userInput() {
		// set up Scanner
		Scanner myBug = new Scanner(System.in);
		System.out.println("Enter bug species:");
		String species = myBug.nextLine();
		System.out.println("Enter bug name:");
		String name = myBug.nextLine();
		System.out.println("Enter bug symbol:");
		char symbol = myBug.next().charAt(0);
		System.out.println("Enter bug horizontal position:");
		int x = myBug.nextInt();
		System.out.println("Enter bug vertical position:");
		int y = myBug.nextInt();
		System.out.println("Enter bug energy level:");
		int energy = myBug.nextInt();
		System.out.println("Enter bug ID Number:");
		int idNum = myBug.nextInt();
		return new Bug(species, name, symbol, x, y, energy, idNum);
	}

}
