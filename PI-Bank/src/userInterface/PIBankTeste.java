package userInterface;
import java.util.Scanner;

import core.Conta;
import core.ContaEspecial;
import core.exception.ContaException;

public class PIBankTeste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tipoDeConta;
		int opcao;
		double valor;
		
		Conta conta;
		conta = new Conta("Jessica Vargas Zanchetta", "987.654.321-00", 1, 0);
		
		ContaEspecial contaEspecial;
		contaEspecial = new ContaEspecial("Jessica Vargas Zanchetta", "987.654.321-00", 1, 0,1000);
		
		do {
			System.out.println("PIBank - Seu banco Daora!!!");
			System.out.println("Escolha o tipo de conta");
			System.out.println("1-Conta Padrao/2-Conta Especial");
			tipoDeConta = scan.nextInt();
			System.out.println("1-Creditar/2-Debitar/3-Info/0-Encerra");
			opcao = scan.nextInt();
			
			
			try {
			switch(opcao) {
			
				case 1:
				System.out.println("Digite o valor para creditar");
				valor = scan.nextDouble();
				if(tipoDeConta == 1) {
					conta.creditar(valor);
				} else if (tipoDeConta == 2){
					contaEspecial.creditar(valor);
				}
				break;
				
			case 2:				
				System.out.println("Digite o valor do debitar");
				
				valor = scan.nextDouble();
				
				if(tipoDeConta ==1) {
					if (conta.debitar(valor)) {
						System.out.println("Debito Efetuado com sucesso!");
					}
					else {
						System.out.println("Saldo Insuficiente");
					}	
				} else if(tipoDeConta == 2) {
					if (contaEspecial.debitar(valor)) {
						System.out.println("Debito Efetuado com sucesso!");
					}
					else {
						System.out.println("Saldo e Limite Insuficientes");
					}	
				}
				
				break;
			case 3:
				if(tipoDeConta ==1) {
					System.out.println(conta.toString());
					break;
				} else if(tipoDeConta == 2) {
					System.out.println(contaEspecial.toString());
					break;
				}
				
			case 0:
				System.out.println("obrigado pela preferencia");
				break;
			default:
				System.out.println("Opcao invalida");
				break;
			}
			
		
			} catch(ContaException e){
				System.err.println("Erro de Regra de Negócio:" +e.getMessage());
			}
			
		} while (opcao != 0);
		
		
		scan.close();
	}
}
