package trabalho_ed1;

import java.util.Scanner;
public class Gerenciamento {
	
	

	Scanner leitura = new Scanner(System.in);

	Excursao onibus = new Excursao();
	
	
	int l, c, fila, poltrona, i = 0;
	
	public void iniciarMatriz (int l, int c, String[][] matriz) {
		for(l = 0; l < matriz.length; l ++) {
			for(c = 0; c < matriz[l].length; c ++) {
				matriz[l][c] = " - ";
			}
		}	
	}
	
	public void menuOpcoes() {
		System.out.println("\n===================================");
		System.out.println("|  * GERENCIAMENTO DE EXCURSÕES *  |");
		System.out.println("|         - MENU INICIAL -          |");
		System.out.println("| 1) Exibir lugares                 |");
		System.out.println("| 2) Adicionar passageiro(s)        |");
		System.out.println("| 3) Alterar poltrona               |");
		System.out.println("| 4) Remover passageiro(s)          |");
		System.out.println("| 5) Exibir valor arrecadado        |");
		System.out.println("| 6) Sair                           |");
		System.out.println("====================================\n");
	}
	
	public void subMenu() {
		System.out.println("===================================");
		System.out.println("|    SUB-MENU EXIBIR POLTRONAS    |");
		System.out.println("| 1) Exibir todos os lugares      |");
		System.out.println("| 2) Exibir somente ocupados      |");
		System.out.println("| 3) Exibir somente livres        |");
		System.out.println("===================================\n");
	}
	
	public void exibirLugares(int l, int c, String[][] matriz) {
		System.out.println("=== MAPA DE LUGARES ===\n");
		
		for(l = 0; l < matriz.length; l ++) {
			for(c = 0; c < matriz[l].length; c ++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}	
	}
	
public void lugaresLivres(int linha, int coluna, String[][] matriz) {
		
		System.out.println("=== LUGARES OCUPADOS ===\n");
		
		for(linha = 0; linha < matriz.length; linha ++) {
			for(coluna = 0; coluna < matriz[linha].length; coluna ++) {
				if (matriz[linha][coluna] == " X ")
					System.out.print(matriz[linha][coluna] + "  ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
}

public void LugaresOcupados(int l,int c, String[][] matriz) {
	
	System.out.println("=== LUGARES LIVRES ===\n");
	
	for(l = 0; l < matriz.length; l ++) {
		for(c = 0; c < matriz[l].length; c ++) {
			if (matriz[l][c] == " - ")
				System.out.print(matriz[l][c] + "  ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}	
}

	public void adicionarPassageiro(int l, int c, String[][] matriz) {
		
		do {
		System.out.println("Digite a fileira (de 1 a "+c+"): ");
		fila = Integer.parseInt(leitura.nextLine());
		fila --;
		}while((fila <0) || (fila >=c));
		do {
		System.out.println("Digite a poltrona (de 1 a "+l+"): ");
		poltrona = Integer.parseInt(leitura.nextLine());
		poltrona --;
		}while((poltrona < 0) || (poltrona >=l));
		
		if (matriz[fila][poltrona] == " X ") {
			System.out.println("Este lugar já está ocupado!");
		} else {
			matriz[fila][poltrona] = " X ";
		}
		
		for(l = 0; l < matriz.length; l ++) {
			for(c = 0; c < matriz[l].length; c ++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}	
		
	}
	
	public void removePoltrona(int l,int c,String[][] matriz) {
		do {
		System.out.println("Informe os dados a seguir para remover a poltrona.\n");
		System.out.println("Digite a fileira (de 1 a "+c+"): ");
		fila = Integer.parseInt(leitura.nextLine());
		fila --;
		}while((fila <0) || (fila >=c));
		
		do {
		System.out.println("Digite a poltrona (de 1 a "+l+"): ");
		poltrona = Integer.parseInt(leitura.nextLine());
		poltrona --;
		}while((poltrona < 0) || (poltrona >=l));
		
		if (matriz[fila][poltrona] == " - ") {
			System.out.println("Este lugar já está vazio!");
		} else {
			matriz[fila][poltrona] = " - ";
			
			System.out.println("Lugar Removido!");
		}
	}
	
	public void alteraPoltrona(int l,int c,String[][] matriz) {
		do {
		System.out.println("Informe os dados a seguir para alterar a poltrona.\n");
		System.out.println("Digite a fileira (de 1 a "+c+"): ");
		fila = Integer.parseInt(leitura.nextLine());
		fila --;
		}while((fila < 0) || (fila >= c));
		
		do {
		System.out.println("Digite a poltrona (de 1 a "+l+"): ");
		poltrona = Integer.parseInt(leitura.nextLine());
		poltrona --;
		}while((poltrona < 0) || (poltrona >=l));
		
		if (matriz[fila][poltrona] == " - ") {
			System.out.println("Este lugar já está vazio!");
		} else {
			matriz[fila][poltrona] = " - ";
			
			System.out.println("Lugar deletado!");
			
			System.out.println("Digite uma nova fileira (de 1 a "+c+"): ");
			fila = Integer.parseInt(leitura.nextLine());
			fila --;
			
			System.out.println("Digite uma nova poltrona (de 1 a "+l+"): ");
			poltrona = Integer.parseInt(leitura.nextLine());
			poltrona --;
			
			if (matriz[fila][poltrona] == " X ") {
				System.out.println("Este lugar já está ocupado!");
			} else {
				matriz[fila][poltrona] = " X ";
			}
		}
	}
}
	