package instancias;

import core.Veiculo;
import taxes.BemTributavel;

public class Carro extends Veiculo implements BemTributavel{
	
	protected int numPortas;
	protected double potencia;

	public Carro(String marca, String modelo, int ano, double preco, int numPortas, double potencia) {
		super(marca, modelo, ano, preco);
		this.numPortas = numPortas;
		this.potencia = potencia;
	}

	@Override
	public String calcularImposto() {
		if(this.ano < 2000) {
			return "Isento";
		} else {
			return "O valor do IPVA é: " + preco*0.04;
		}
		
	}
	
	@Override
	public String toString() {
		return "Carro [numPortas=" + numPortas + ", potencia=" + potencia + ", marca=" + marca + ", modelo=" + modelo
				+ ", ano=" + ano + ", preco=" + preco + "]";
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	

}
