package FigurasInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class collections {
	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList <Integer>();
		
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(7);
		minhaLista.add(2);
		minhaLista.add(1);
		
		for (Integer loop : minhaLista) {
			System.out.println(loop);
		}
		System.out.println("\nRemovendo um elemento da lista: ");
		minhaLista.remove(1);
		
		for (Integer loop : minhaLista) {
			System.out.println(loop);
		}
		
		System.out.println();
		for (int i = 0; i < minhaLista.size(); i++) {
			System.out.println("Elemento [" + i + "]: " + minhaLista.get(i));
		}
		
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\no primeiro elemento é: " + primeiroElemento);
		
		Collections.sort(minhaLista);
		System.out.println("\nOrdenando minhaLista:\n " + minhaLista);
		
		
		
		Set<Integer> meuSet = new HashSet<Integer>();
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(1);
		//meuSet.addAll(minhaLista);
		
		
		Iterator<Integer> meuIt = meuSet.iterator();
		while (meuIt.hasNext()) {
			System.out.println(meuIt.next());
		}
		System.out.println("----------------------------------");
		ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
        System.out.println("Fora de ordem: " + al);
        System.out.println("\n");
        Collections.sort(al);
        System.out.println("Em ordem: " + al);
        
        
        int op;
        Scanner scanner = new Scanner (System.in);
        
        ArrayList<String> estoque = new ArrayList<String>();
        do {
        	System.out.println("\n\n\t\t Digite uma opção: ");
        	System.out.println("-------------------------------------------------------------------------");
        	System.out.println("(0) encerrar programa \n(1) deseja adicionar produtos ao estoque \n(2) deseja remover produtos ao estoque \n(3) deseja  atualizar produtos ao estoque \n(4) mostrar todos os produtos do estoque");
        	System.out.println("-------------------------------------------------------------------------");
        	op = scanner.nextInt();
        	scanner.nextLine();
        	
        	System.out.println();
        	switch (op) {
        	case 1:
        		System.out.println("Digite o produto a ser adicionado: ");
        		String produto = scanner.nextLine().toLowerCase();
        		estoque.add(produto);
        		break;
        		
        	case 2:
        		System.out.println("Digite o produto a ser removido: ");
        		String produto1 = scanner.nextLine().toLowerCase();
        		if (estoque.contains(produto1)) {
        			estoque.remove(produto1);
        		} else {
        			System.out.println(produto1 + " não existe no estoque");
        		}
        		break;
        		
        	case 3:
        		System.out.println("Informe o produto a ser atualizado: ");
        		String produto2 = scanner.nextLine().toLowerCase();
        		System.out.println("Digite o nome do produto que entrará no lugar de " + produto2 + ": ");
        		String novoProduto2 = scanner.nextLine().toLowerCase();
        		
        		if (estoque.contains(produto2)) {
        			estoque.remove(produto2);
        			estoque.add(novoProduto2);
        		} else {
        			System.out.println(produto2 + " não existe no estoque");
        		}
        		break;
        		
        	case 4:
        		System.out.println("Produtos em estoque: ");
        		for (int i = 0; i < estoque.size(); i++) {
        			System.out.println(estoque.get(i));
        		}
        		break;
        	}
        } while (op != 0);
        System.out.println("Finalizou o programa!");
        scanner.close();
	}
}
