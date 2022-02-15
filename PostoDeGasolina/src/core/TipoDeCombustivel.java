package core;

public class TipoDeCombustivel {

	private String Nome;
	private double valorLitro;
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public double getValorLitro() {
		return valorLitro;
	}
	
	public void setValorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public TipoDeCombustivel(String nome, double valorLitro) {
		super();
		Nome = nome;
		this.valorLitro = valorLitro;
	}
	
	
}
