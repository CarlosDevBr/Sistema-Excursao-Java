package trabalho_ed1;

import java.util.Scanner;

public class codigo_central {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		Gerenciamento menuOpcoes = new Gerenciamento();
		Gerenciamento inciarMatriz = new Gerenciamento();
		Gerenciamento opcao1 = new Gerenciamento();
		
		int opcao = 0, opcaoSub = 0;
		
		
		Excursao onibus = new Excursao();
		String destino;
		int c, l, passagem;
		
		System.out.println("Seja bem-vindo ao nosso sistema de excursões!!!"); 
		System.out.println("Digite o destino da viagem: ");
		destino = leitura.nextLine();
		onibus.setDestino(destino);
		System.out.println("Digite a quantidade de poltronas por coluna: ");
		c = Integer.parseInt(leitura.nextLine());
		System.out.println("Digite a quantidade de poltronas por linha: ");
		l = Integer.parseInt(leitura.nextLine());
		String[][] matriz = new String [c][l];
		opcao1.iniciarMatriz(l,c,matriz);
		System.out.println("Digite o valor da passagem: ");
		passagem = Integer.parseInt(leitura.nextLine());
		onibus.setPassagem(passagem);

		
		while (opcao != 6) {
			menuOpcoes.menuOpcoes();
			System.out.println("Digite uma opção: ");
			opcao = Integer.parseInt(leitura.nextLine());
			
			switch(opcao) {
				case 1: 
					opcao1.subMenu();
					System.out.println("Digite uma opÃ§Ã£o: ");
					opcaoSub = Integer.parseInt(leitura.nextLine());
					
					switch(opcaoSub) {
						case 1: opcao1.exibirLugares(l,c,matriz); break;
						case 2: opcao1.lugaresOcupados(l,c,matriz); break;
						case 3: opcao1.lugaresLivres(l, l, matriz); break;
					}
					break;
				
				case 2: 
					opcao1.adicionarPassageiro(l,c,matriz); 
					onibus.contadorAdiciona();
					break;
				case 3: 
					opcao1.alteraPoltrona(l,c,matriz);
					break;
				case 4: 
					opcao1.removePoltrona(l,c,matriz);
					onibus.contadorDiminui();
					break;
				case 5:
					System.out.println("Total arrecadado até o momento: R$" + onibus.getCount() * onibus.getPassagem());
					break;
				case 6:
					break;
				default:
					System.out.println("Opção invalida!");
					menuOpcoes.menuOpcoes();
					System.out.println("Digite uma opção valida: ");
					opcao = Integer.parseInt(leitura.nextLine());
					break;
			}
		}
		System.out.println("Encerrando...");
		onibus.somaValor();
		
	}

}