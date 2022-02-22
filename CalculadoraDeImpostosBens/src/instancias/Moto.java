package instancias;

import core.Veiculo;
import taxes.BemTributavel;

public class Moto extends Veiculo implements BemTributavel{

	protected int cilindradas;
	protected String tipo;

	public Moto(String marca, String modelo, int ano, double preco,int cilindradas, String tipo) {
		super(marca, modelo, ano, preco);
		this.cilindradas = cilindradas;
		this.tipo = tipo;
	}

	@Override
	public String calcularImposto() {
		if(this.cilindradas < 500) {
			return "O valor do IPVA é: " + preco*0.025;
		} else {
			return "O valor do IPVA é: " + preco*0.05;
		}
		
	}

	@Override
	public String toString() {
		return "Moto [cilindradas=" + cilindradas + ", tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo
				+ ", ano=" + ano + ", preco=" + preco + "]";
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
