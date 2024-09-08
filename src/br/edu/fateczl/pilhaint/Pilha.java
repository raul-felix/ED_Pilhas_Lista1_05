package br.edu.fateczl.pilhaint;

public class Pilha {
	
	Node topo;
	
	public Pilha() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(int valor) {
		Node node = new Node();
		node.dado = valor;
		node.proximo = topo;
		topo = node;
	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		return topo.dado;
	}
	
	public int size() {
		int tamanho = 0;
		Node aux = topo;
		while (aux != null) {
			tamanho++;
			aux = aux.proximo;
		}
		return tamanho;
	}
	
	public int max() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		Node aux = topo;
		int max  = aux.dado;
		while(aux.proximo != null) {
			aux = aux.proximo;
			int valor = aux.dado;
			if (valor > max) {
				max = valor;
			}
		}
		return max;
	}
}
