
public class cidadesAeB {
	public static void main(String[] args) {
	
	double cidadeA = 80000, cidadeB = 200000, anos = 0;
		
	while (cidadeA <= cidadeB) {
		cidadeA += (cidadeA * 0.03);
		cidadeB += (cidadeB * 0.015);
		anos ++;
		System.out.printf("ano %2.0f: cidade A = %2.0f habitantes && cidade B = %2.0f habitantes\n", anos, cidadeA, cidadeB);
	}
	System.out.printf("a cidade A ultrapassará a cidade B em %2.2f anos", anos);
	}
}
