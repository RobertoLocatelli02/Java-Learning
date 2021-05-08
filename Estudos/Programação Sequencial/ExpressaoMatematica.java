import java.util.Scanner;

public class ExpressaoMatematica {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Insira três números inteiros e positivos:");
		System.out.println("A: ");
		double A = scanner.nextDouble();
		
		System.out.println("B: ");
		double B = scanner.nextDouble();
		
		System.out.println("C: ");
		double C = scanner.nextDouble();
		
		double R = Math.pow (A+B,2);
		double S = Math.pow(B+C,2);
		double D = ((R + S) / 2);
		
		System.out.println("R = (A+B)²" + "\n R = " + R);
		System.out.println("\nS = (B+C)²" + "\n S = " + S);
		System.out.println("\nD = (R+S)/2");
		System.out.println("\n\nO resultado final é " + D);
		scanner.close();
	}
}
