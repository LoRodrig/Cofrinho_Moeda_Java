package uninter;

import java.util.Scanner;

public class Menuinicial {
	private Cofrinho cofrinho;

	public Menuinicial() {
		cofrinho = new Cofrinho();

	}

	public void exibirMenu() {

		System.out.println("Bem vindo ao Cofrinho de Moedas!");
		System.out.println("Escolha uma opção:");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Total de moedas convertido para Real");
		System.out.println("5- Encerrar");
		double opcao;
		double tipoMoeda;
		double quantidade;
		Moeda moeda = null;
		Scanner teclado = new Scanner(System.in);
		opcao = teclado.nextDouble();

		if (opcao == 1) { // inicia a condição para a opção 1
			System.out.println("Escolha o tipo de Moeda:");
			System.out.println("1-Dolar");
			System.out.println("2-Euro");
			System.out.println("3-Real");
			tipoMoeda = teclado.nextDouble();

			System.out.println("Digite a quantidade:");
			quantidade = teclado.nextDouble();
			if (tipoMoeda == 1) {// inicia o if para o tipo de moeda escolhida
				moeda = new Dolar(quantidade);// adiciona a quantidade no valor do tipo de moeda

			} else if (tipoMoeda == 2) {
				moeda = new Euro(quantidade);

			} else if (tipoMoeda == 3) {
				moeda = new Real(quantidade);

			} else {
				System.out.println("Moeda invalida");
				exibirMenu();

			}
			moeda.info();
			cofrinho.adicionar(moeda);
			System.out.println("Moeda adicionada com sucesso!");
			exibirMenu();
		}

		else if (opcao == 2) {// inicia a condição para a opção 2
			System.out.println("Escolha o tipo de Moeda para remover:");
			System.out.println("1-Dolar");
			System.out.println("2-Euro");
			System.out.println("3-Real");
			tipoMoeda = teclado.nextDouble();

			System.out.println("Digite a quantidade:");
			quantidade = teclado.nextDouble();
			if (tipoMoeda == 1) {// inicia o if para o tipo de moeda escolhida
				moeda = new Dolar(quantidade);// adiciona a quantidade no valor do tipo de moeda

			} else if (tipoMoeda == 2) {
				moeda = new Euro(quantidade);

			} else if (tipoMoeda == 3) {
				moeda = new Real(quantidade);

			} else {
				System.out.println("Moeda invalida");
			}

			if (cofrinho.remover(moeda)) {
				System.out.println("Moeda removida com sucesso!");
			} else {
				System.out.println("Não existem moedas nesse valors");
			}

			exibirMenu();

		} else if (opcao == 3) {// inicia a condição para a opção 3

			System.out.println("Moedas no Cofrinho:");
			cofrinho.listagemMoedas();// lista todas as moedas adicionas no cofrinho
			System.out.println("--------------------");
			exibirMenu();
		} else if (opcao == 4) {// inicia a condição para a opção 4
			double totalConvertidoReal = cofrinho.totalConvertido();
			System.out.printf("Valor total convertido para real:" + totalConvertidoReal);

			System.out.println("");
			exibirMenu();
		} else {
			System.out.println("Cofrinho finalizado");
			System.out.println("--------------------");
			exibirMenu();
		}
		teclado.close();
	}
}