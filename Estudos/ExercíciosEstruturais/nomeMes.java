
public class nomeMes {
	public static void main (String[] args) { 
	
	String nomeMes[] =
{"Janeiro","Fevereiro","Mar�oo","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};	
		
		System.out.println("=================");
		System.out.println("M�s - Nome do M�s");
		System.out.println("=================");
		
		for(int i=0; i<12; i++) { 
			System.out.printf(" %0,2d- %s\n", (i+1), nomeMes[i]);
		}
		System.out.println("=================");
	}
}
