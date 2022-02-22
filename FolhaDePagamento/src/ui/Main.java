package ui;

import core.Funcionario;
import core.Chefe;
import core.Comissionado;
import core.Horista;
import core.Empreiteiro;

public class Main {

	public static void main(String[] args) {
		Funcionario listaFuncionarios[];
		
		listaFuncionarios = new Funcionario[4];
		
		listaFuncionarios[0] = new Chefe("Jéssica Vargas Zanchetta", 0, 7000.00, 30, 500.00 );
		listaFuncionarios[1] = new Comissionado("Natalia Vargas Zanchetta", 0, 3000.00, 25);
		listaFuncionarios[2] = new Horista("Humberto Dal Bó", 0, 40.00, 65);
		listaFuncionarios[3] = new Empreiteiro("Renata Dal Bó", 0, 2000.00);
		
		

	}
	
	

}
