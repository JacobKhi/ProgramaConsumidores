package util;

import model.Consumidor;

public class No {
	private Consumidor dado;
	private No proximo;
	
	public No(Consumidor dado) {
		this.dado =  dado;
		this.proximo = null;
	}

	public Consumidor obterDado() {
		return dado;
	}

	public void definirDado(Consumidor dado) {
		this.dado = dado;
	}

	public No obterProximo() {
		return proximo;
	}

	public void definirProximo(No proximo) {
		this.proximo = proximo;
	}
	
}

