import java.util.Scanner;
public class EstruturaSequencial {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.printf("Informe um nome:\n");
	String n = scanner.nextLine();
	System.out.printf("Seja bem vindo " + n + "!");
	scanner.close();
	}
}
