
public class Program extends Mauer{
	Program(int h, int b, String bm, String n) {
		super(h, b,  bm, n);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Mauer m1 = new Mauer(5,10, "Stein", "Burgmauer");
		Mauer m2 = new Mauer(7,12, "Holz", "Holzmauer");
		
		System.out.println("Die Höhe der Mauer ist " + m1.getH());
		System.out.println(" Die Breite der Mauer ist "+ m1.getW());
		System.out.println(" Das Material besteht aus "+ m1.getBM());
		System.out.println("Der Name der Mauer ist "+m1.getN());
		
		System.out.println("Die Höhe der zweiten Mauer ist "+ m2.getH());
		System.out.println(" Die Breite der zweiten Mauer ist "+ m2.getW());
		System.out.println(" Das zweite Material besteht aus "+ m2.getBM());
		System.out.println("der Name der zweiten Mauer 2 ist "+ m2.getN());
		
	}
	
}
 