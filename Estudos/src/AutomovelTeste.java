
public class AutomovelTeste {
	public static void main(String[] args) {
		
		Automovel carro1 = new Automovel("Roberto Locatelli", "Porsche", "ABC1234", 2018);
		
		// método imprimirInformacoes()
		carro1.imprimirInformacoes();
		System.out.println("---Transferência de proprietário:----");
		carro1.setNomeProprietario("Seu Joaquim");
		carro1.imprimirInformacoes();
		
		System.out.println();
		Automovel carro2 = new Automovel ("José", "Fusca", "ABC5678", 2021);
		carro2.imprimirInformacoes();
		System.out.println("---Troca de placa:---");
		carro2.setPlaca("ABC0102");
		carro2.imprimirInformacoes();
	}
}
