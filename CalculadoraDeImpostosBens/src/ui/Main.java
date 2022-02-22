package ui;

import core.Imovel;
import core.Veiculo;
import instancias.Carro;
import instancias.Comercial;
import instancias.Moto;
import instancias.Residencial;
import instancias.Rural;
import taxes.BemTributavel;

public class Main {

	public static void main(String[] args) {
		
		Veiculo veiculos[] = new Veiculo[4];
		Imovel imoveis[] = new Imovel[5];
		
		veiculos[0] = new Carro("Ford", "Focus",1999 ,35000.00, 4, 2.0);
		veiculos[1] = new Moto("Honda", "Biz",2000 ,4000.00, 400, "Underbone");
		veiculos[2] = new Carro("Toyota", "Corolla",2020 ,140000.00, 4, 3.0);
		veiculos[3] = new Moto("Harley Davidson","Eclipse",2007 ,40000.00, 850, "Trail");
		
		imoveis[0] = new Residencial("Rua Acelon Pacheco da Costa, 231",555000.00, 56.00);
		imoveis[1] = new Comercial("Avenida Brasil, 231",1000000.00, "Loja de Jogos");
		imoveis[2] = new Rural("Rua das Capivaras",480000.00, "Fazenda");
		imoveis[3] = new Comercial("Avenida Atlantica, 23",1000000.00, "Loja de Flores");
		imoveis[4] = new Rural("Rua das Antas",480000.00, "Chacara");
		
		BemTributavel btlist[] = new BemTributavel[10];
		
		btlist[0] = (Carro) veiculos[0];
		btlist[1] = (Moto) veiculos[1];
		btlist[2] = (Carro) veiculos[2];
		btlist[3] = (Moto) veiculos[3];
		btlist[4] = (Residencial) imoveis[0];
		btlist[5] = (Comercial) imoveis[1];
		btlist[6] = (Comercial) imoveis[3];
		
		System.out.println("Bens Tributaveis + Valores dos Imposto");
		for(Veiculo q: veiculos) {
			
			if (q instanceof BemTributavel) {
				System.out.println(q.calcularImposto());
				
			}
			else {
				return;
			}
		}
		
		for(Imovel i: imoveis) {
			
				if (i instanceof BemTributavel) {
				System.out.println(i.calcularImposto());
				
				}
				else {
					return;
				}
			}
		}

}
