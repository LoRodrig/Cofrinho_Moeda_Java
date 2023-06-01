package uninter;

import java.util.ArrayList;

public class Cofrinho {
	// criação de lista de moedas que iremos utilizar para ser o cofrinho
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();

	public void adicionar(Moeda moeda) {// metodo adicionar moeda no cofrinho
		this.listaMoedas.add(moeda);
	}

	public boolean remover(Moeda moeda) {// metodo remover moeda no cofrinho

		return this.listaMoedas.remove(moeda);

	}

	public void listagemMoedas() {// metodo listar as moedas no cofrinho
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() {// metodo mostrar o valor total convertido para real
		double valorTotal = 0;
		for (Moeda moeda : this.listaMoedas) {
			valorTotal = valorTotal + moeda.converter();
		}

		return valorTotal;
	}
}
