package instancias;

import core.Imovel;
import taxes.BemTributavel;

public class Residencial extends Imovel implements BemTributavel{

	protected double metragem;
	
	public Residencial(String endereco, double valorVenal,double metragem) {
		super(endereco, valorVenal);
		this.metragem = metragem;
	}

	@Override
	public String calcularImposto() {
		if(this.metragem < 100) {
			return "O valor do IPTU é: " + valorVenal*0.015;
		} else {
			return "O valor do IPTU é: " + valorVenal*0.03;
		}
		
	}

	@Override
	public String toString() {
		return "Residencial [metragem=" + metragem + ", endereco=" + endereco + ", valorVenal=" + valorVenal + "]";
	}

	public double getMetragem() {
		return metragem;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}
	
	

}
