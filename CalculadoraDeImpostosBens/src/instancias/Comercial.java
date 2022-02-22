package instancias;

import core.Imovel;
import taxes.BemTributavel;

public class Comercial extends Imovel implements BemTributavel{

	protected String uso;
	
	public Comercial(String endereco, double valorVenal,String uso) {
		super(endereco, valorVenal);
		this.uso = uso;
	}

	@Override
	public String calcularImposto() {
		return "O valor do IPTU é: " + valorVenal*0.04;
		
	}

	@Override
	public String toString() {
		return "Residencial [metragem=" + uso + ", endereco=" + endereco + ", valorVenal=" + valorVenal + "]";
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
	
	

}