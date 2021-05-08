import java.util.Scanner; 

public class sistemaLinear {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe valores para os sistemas:");
		System.out.println("ax + by = c");
		System.out.println("dx + ey = f");
		System.out.println("a: ");
		double a = scanner.nextDouble();
		System.out.println("b: ");
		double b = scanner.nextDouble();
		System.out.println("c: ");
		double c = scanner.nextDouble();
		System.out.println("d: ");
		double d = scanner.nextDouble();
		System.out.println("e: ");
		double e = scanner.nextDouble();
		System.out.println("f: ");
		double f = scanner.nextDouble();
		
		double x = (((c*e)-(b*f)) / ((a*e)-(b*d)));
		double y = (((a*f)-(c*d)) / ((a*e)-(b*d)));
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		scanner.close();
	}
}
