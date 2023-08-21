
public class Main {

	public static void main(String[] args) {
		Bug ladybug = new Bug ("ladybug", "Lady Bird", 'A', 50, 50, 100, 123);
		Bug bee = new Bug();
		System.out.println(bee);
		System.out.println(ladybug.toText());
	}

}
