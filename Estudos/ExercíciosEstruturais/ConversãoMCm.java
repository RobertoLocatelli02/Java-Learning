import java.util.Scanner;

public class Convers�oMCm {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe uma medida em metros:\n");
		float a = scanner.nextFloat();
		
		float conversao = a*100;
		
		System.out.println(a + " metros = " + conversao + " cent�metros.");
		scanner.close();
	}
}
