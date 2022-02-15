package userInterface;
import java.util.Scanner;

import core.BombaDeCombustivel;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BombaDeCombustivel b = new BombaDeCombustivel();
		
		int opcao;
		double valor;
		
		valor = 0;
		
		
		do {
			System.out.println("=======================================");
			System.out.println("   POSTO DE GASOLINA   ");
			System.out.println("=======================================");
			System.out.println(" Escolha seu Combustivel ");
			System.out.println(b.exibirDisplay());
			System.out.println("Para cancelar digite -1.");
			opcao = scan.nextInt();
			
			
			switch(opcao) {
			case 0: case 1: case 2:
				System.out.println(" Escolha o valor a ser abastecido!");
				valor = scan.nextDouble();
				
				System.out.println(b.calculaValorPorLitro(valor, opcao));
				break;
		
			default: 
				if(opcao == -1) {
					System.out.println("Agradecemos a preferencia! Volte sempre.");
					break;
				}
				
				System.out.println("Opcao Invalida! Escolha outra opcao");
			}
			
			
		} while (opcao != -1);
		
		
		
		scan.close();
	}
}
