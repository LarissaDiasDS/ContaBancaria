package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println("*************************************************************************");
			System.out.println("                                                                         ");
			System.out.println("                               BANCO ÍLIA                                ");
			System.out.println("                                                                         ");
			System.out.println("*************************************************************************");
			System.out.println("                                                                         ");
			System.out.println("                  1 - Criar conta                                        ");
			System.out.println("                  2 - Listar todas as contas                             ");
			System.out.println("                  3 - Buscar conta por numero                            ");
			System.out.println("                  4 - Atualizar dados da conta                           ");
			System.out.println("                  5 - Apagar a conta                                     ");
			System.out.println("                  6 - Sacar                                              ");
			System.out.println("                  7 - Depositar                                          ");
			System.out.println("                  8 - Transferir valores entre contas                    ");
			System.out.println("                  9 - Sair                                               ");
			System.out.println("                                                                         ");
			System.out.println("*************************************************************************");
			System.out.println("Entre com a opção desejada:                                              ");
			System.out.println("                                                                         ");
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println("\n Banco Ília - Sua economia começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1: 
				System.out.println("Criar conta \n\n");
				
				break;
				
			case 2: 
				System.out.println("Listar todas as contas \n\n");
				
				break;
				
			case 3: 
				System.out.println("Buscar conta por numero \n\n");
				
				break;
				
			case 4: 
				System.out.println("Atualizar dados da conta \n\n");
				
				break;
				
			case 5: 
				System.out.println("Apagar a conta \n\n");
				
				break;
				
			case 6: 
				System.out.println("Sacar \n\n");
				
				break;
				
			case 7: 
				System.out.println("Depositar \n\n");
				
				break;
				
			case 8: 
				System.out.println("Transferir valores entre contas \n\n");
				
				break;
				
			case 9: 
				System.out.println("Sair \n\n");
				
				break;
				
			default:
				System.out.println("Opção invalida \n\n");
			}
		}

	}
	
	public static void sobre() {
		System.out.println("\n****************************************************************");
		System.out.println("Projeto desenvolvido por:                                         ");
		System.out.println("Larissa Dias - larissadsantoslds@gmail.com                        ");
		System.out.println("github.com/LarissaDiasDS                                          ");
		System.out.println("                                                                  ");
	}

}
