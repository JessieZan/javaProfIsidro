package ui;

import java.util.Scanner;

import core.PessoaFisica;
import core.PessoaJuridica;
import core.Contribuinte;
public class Main{
    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);

    	int numCadastral;
    	int opcao;
		double valor;
		
		Contribuinte listaContribuintes[];
		
		listaContribuintes = new Contribuinte[4];
		
		listaContribuintes[0] = new PessoaFisica("Jessica Vargas Zanchetta", "Rua girua 486", 0, "897.657.849-99",1,24000.00);
		listaContribuintes[1] = new PessoaFisica("Natalia Vargas Zanchetta", "Rua girua 486", 1, "897.657.849-99",2, 45000.00);
		listaContribuintes[2] = new PessoaJuridica("Taqueria", "Rua girua 486", 2, "897.657.845/0001-99", 300000.00);
		listaContribuintes[3] = new PessoaJuridica("Guacamole", "Rua girua 486", 3, "897.657.845/0001-99", 449000.00);
		
		
		do {
			System.out.println("Calculo de Imposto!!!");
			System.out.println("Digite seu numeroCadastral");
			numCadastral = scan.nextInt();
			System.out.println("1-Calcular Imposto/2-Info/0-Encerra");
			opcao = scan.nextInt();
			
			switch(opcao) {
			case 1:
				
				valor = listaContribuintes[numCadastral].getArrecadacao();
				System.out.println(listaContribuintes[numCadastral].calculaImposto(valor));
				
				break;
				
			case 2:				
				
				System.out.println(listaContribuintes[numCadastral].toString());
				break;
			case 0:
				System.out.println("obrigado pela preferencia");
				break;
			default:
				System.out.println("Opcao invalida");
				break;
			}
			
		} while (opcao != 0);

        scan.close();
    }
}
