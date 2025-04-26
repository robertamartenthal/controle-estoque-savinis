package sistema.controle.estoque;

import java.util.Scanner;

public class ControleEstoqueMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Estoque estoque = new Estoque();

		int tipoEntrada = 0;
		char rodaSistema = 's';

		System.out.println(
				"             Controle de Estoque Savinis \n-----Bem vindo ao Controle de Estoque da empresa Savinis-----");
		System.out.println();

		while ((rodaSistema == 's') || (rodaSistema == 'S')) {

			System.out.println("Digite o número de acordo com a funcionalidade que deseja: \n1 - Compra \n2 - Venda");
			tipoEntrada = sc.nextInt();

			switch (tipoEntrada) {

			case 1: {
				System.out.println("Digite a quantidade de pecas que você comprou: ");
				estoque.compraPeca(sc.nextInt());
				System.out.println("O saldo do estoque é: " + estoque.getSaldoEstoque());
				break;
			}

			case 2: {
				System.out.println("Digite a quantidade de peças que foram vendidas: ");
				estoque.setQtdPeca(sc.nextInt());
				if (estoque.getQtdPeca() > estoque.getSaldoEstoque()) {
					System.out.println("Saldo Insuficiente!");
					break;
				}
				estoque.vendePeca();
				System.out.println("O saldo do estoque é: " + estoque.getSaldoEstoque());
				break;
			}
			}

			System.out.println("Você deseja continuar no sistema? (s/n)");
			rodaSistema = sc.next().charAt(0);
		}
		System.out.println("Sistema Encerrado!");
		sc.close();
	}
}
