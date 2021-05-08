import java.util.Scanner;

public class CumprimentoEmTurnos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Qual turno você estuda? Matutino/ Vespertino/ Noite (M / V/ N) \n");
        char turnoChar = scanner.next().charAt(0); 
        turnoChar =  Character.toLowerCase(turnoChar);
		
		if (turnoChar== 'm') {
			System.out.println("Bom dia");			
		} else if (turnoChar == 'v') {
			System.out.println("Boa tarde");
		} else if (turnoChar == 'n') {
			System.out.println("Boa noite");
		} else  {
			System.out.println("Valor inválido");
		}
		scanner.close();
	} 
}
