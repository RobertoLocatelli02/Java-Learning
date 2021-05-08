import java.util.Scanner;

public class PesoIdealPorGenero {
 public static void main(String[] args) {
	
	 Scanner scanner = new Scanner (System.in);
	 
	    char sexo;

	    System.out.printf("Informe sua altura:\n");
	    double altura = scanner.nextDouble();

	    System.out.printf("\nInforme o sexo (M/F): ");
	    sexo = scanner.next().charAt(0);

	    System.out.printf("\nResultado:\n");
	    if ((sexo == 'M') || (sexo == 'm')) {
	    	double PesoIdeal = ((72.7 * altura) - 58);
	    	System.out.println("O seu peso ideal é de " + PesoIdeal + " kg");}
	    
	    else if (sexo == 'F' || (sexo == 'f')) { 
	    	double PesoIdeal = ((62.1 * altura) - 44.7);
	    	System.out.println("O seu peso ideal é de " + PesoIdeal + " kg");}
	    
	    else { System.out.println("Sexo Inválido");
	 
	    }
	    scanner.close();
 	}
}
