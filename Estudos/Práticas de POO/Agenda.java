import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    private static int total_pessoas;
    private static String nome[];
    private static int idade;
    private static String nomes;
    private static double altura;
    
    static List<String> set_nome = new ArrayList<String>();
    static List<Integer> set_idade = new ArrayList<Integer>();
    static List<Double> set_altura = new ArrayList<Double>();

    void quantidade_de_pessoa(int quantidade) {
        total_pessoas = quantidade;
        setNome(new String[quantidade]);
    }

    static void set_armazenaPessoa(int i) {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o nome da " + (i + 1) + "ª  pessoa");
        nomes = scanner.next().toLowerCase();
        System.out.println("Digite a idade da " + (i + 1) + "ª pessoa");
        idade = scanner.nextInt();
        System.out.println("Digite a altura da " + (i + 1) + "ª pessoa");
        altura = scanner.nextDouble();

        set_nome.add(i, nomes);
        set_idade.add(i, idade);
        set_altura.add(i, altura);
        scanner.close();
    }

    static void get_imprimeAgenda(int i) {
        System.out.println((i + 1) + "º nome: " + set_nome.get(i));
        System.out.println("idade: " + set_idade.get(i));
        System.out.println("altura: " + set_altura.get(i));
        System.out.println("---------------------------------");
    }


    static void removePessoa(int remover_index) {
        set_nome.set(remover_index, null);
        set_idade.set(remover_index, null);
        set_altura.set(remover_index, null);
    }

    static int buscaPessoa(String nome_busca) {
     
        int posicao = 0;
        for (int i = 0; i < total_pessoas; i++) {
            if (set_nome.get(i).equals(nome_busca)) {
                posicao = i;
            }
        }
        return posicao;
    }
    
    public static String[] getNome() {
		return nome;
	}

	public static void setNome(String nome[]) {
		Agenda.nome = nome;
	}
	
	public static void main(String[] args) {
		
	    Agenda agendaObjeto = new Agenda();
	    int quantidade_pessoas, index;
	    String nome;

	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Quantas pessoas desejas cadastrar? ");
	    quantidade_pessoas = scanner.nextInt();
	    agendaObjeto.quantidade_de_pessoa(quantidade_pessoas);

	    for (int i = 0; i < quantidade_pessoas; i++) {
	        Agenda.set_armazenaPessoa(i);
	    }

	    for (int i = 0; i < quantidade_pessoas; i++) {
	        Agenda.get_imprimeAgenda(i);
	    }

	    System.out.println("Digite o nome da pessoa a ser procurada");
	    nome = scanner.next().toLowerCase();
	    int position = Agenda.buscaPessoa(nome);
	    if (position >= 0) {
	        System.out.println("O " + nome + " se encontra na posisao: " + (position + 1));
	    } else {
	        System.out.println("o nome inserido não está cadastrado");
	    }

	    System.out.println("Digite o index da pessoa na lista: ");
	    index = scanner.nextInt();
	    for (int i = 0; i < quantidade_pessoas; i++) {
	        if (i == (index - 1)) {
	            Agenda.get_imprimeAgenda(i);
	        }
	    }

	    System.out.println("Digite o index da pessoa a ser removida: ");
	    index = scanner.nextInt();
	    for (int i = 0; i < quantidade_pessoas; i++) {
	        if (i == (index - 1)) {
	            Agenda.removePessoa(i);
	        }
	    }

	    for (int i = 0; i < quantidade_pessoas; i++) {
	        Agenda.get_imprimeAgenda(i);
	    	}
	    scanner.close();
	    }
}
    
