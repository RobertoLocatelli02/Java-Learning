import java.util.Scanner;

public class alfabeto {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe uma letra:\n"); 
		char alfabeto = scanner.next().charAt(0); 
        alfabeto = Character.toLowerCase(alfabeto);
        
		if (alfabeto == 'a' || alfabeto == 'e' || alfabeto ==  'i' || alfabeto == 'o' || alfabeto == 'u'){
			System.out.println("Sua letra é uma vogal!");
        } else {
            System.out.println("Sua letra é uma consoante!");
        }
		scanner.close();
	}
}