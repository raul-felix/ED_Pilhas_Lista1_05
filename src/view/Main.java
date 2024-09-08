package view;

import br.edu.fateczl.pilhaint.Pilha;

public class Main {
	
	public static void main(String[] args) {
		
		Pilha p = new Pilha();
		int[] vetor = { 19, 44, -1, 8, -10, 75, -15, 0 };
		
		for (int valor : vetor) {
			p.push(valor);
		}
		
		try {
			int max = p.max();
			System.out.println("Maior valor da pilha: " + max);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}