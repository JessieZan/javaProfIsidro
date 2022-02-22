package core;

public class Empreiteiro extends Funcionario{
	protected double valorEmpreita;

	public Empreiteiro(String nome, int numeroRegistro, double valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	
	@Override
	public double calcularSalario() {
		
		return this.valorEmpreita;
	}

	@Override
	public String toString() {
		return "Empreiteiro [valorEmpreita=" + valorEmpreita + ", nome=" + nome + ", numeroRegistro=" + numeroRegistro
				+ "]";
	}

	public double getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(double valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
	
}

/**/