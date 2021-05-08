
public class Automovel {
	
	// declaração dos atributos classe
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	// método construtor
	public Automovel (String nomeProprietario, String modelo, String placa, int ano) {
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	
	// criação dos demais métodos da classe Automovel
	public void imprimirInformacoes() {
		System.out.println(nomeProprietario + " possui um(a) " + modelo + " com a placa " + placa + " e de ano " + ano);
	}
	
	// gerar get & set
	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
