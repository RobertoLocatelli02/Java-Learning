 	import java.io.IOException;
import java.util.Scanner;

public class Dados {

  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    String nome;
    char sexo;

    System.out.printf("Informe um nome:\n");
    nome = scanner.nextLine();

    System.out.printf("\nInforme o sexo (M/F): ");

    sexo = (char)System.in.read();

    System.out.printf("\nResultado:\n");
    if ((sexo == 'M') || (sexo == 'm'))
    	System.out.printf("Seja bem vindo Sr. %s.\n", nome);
    else if ((sexo == 'F') || (sexo == 'f')) 
    	System.out.printf("Seja bem vinda Sra. %s.\n", nome);
    else System.out.printf("Sexo inválido");
    scanner.close();
  }
}
