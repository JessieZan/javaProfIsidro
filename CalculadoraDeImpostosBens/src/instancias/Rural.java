package instancias;

import core.Imovel;

public class Rural extends Imovel{
	
	String tipo;

	public Rural(String endereco, double valorVenal, String tipo) {
		super(endereco, valorVenal);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Rural [tipo=" + tipo + ", endereco=" + endereco + ", valorVenal=" + valorVenal + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
