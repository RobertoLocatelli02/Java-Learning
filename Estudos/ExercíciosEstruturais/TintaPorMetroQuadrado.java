import java.util.Scanner;

public class TintaPorMetroQuadrado {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Quantos metros quadrados serão pintados?");
		float MetrosQuadrados = scanner.nextFloat();
		
		double LitrosDeTinta = MetrosQuadrados / 3;
		double LataDeTinta = 18;
		double QuantidadeDeLatas = Math.ceil(LitrosDeTinta / LataDeTinta);
		double PrecoAPagar = QuantidadeDeLatas * 80;
		
		System.out.println("Precisará de " + QuantidadeDeLatas + " latas de tinta, o que vai dar R$ " + PrecoAPagar);
		scanner.close();
	}
}
