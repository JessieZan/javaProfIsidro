package core;

public class Horista extends Funcionario{
	protected double valorHora;
	protected int numeroHoras;
	
	public Horista(String nome, int numeroRegistro, double valorHora, int numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	@Override
	public double calcularSalario() {
		return this.valorHora * this.numeroHoras;
	}

	@Override
	public String toString() {
		return "Horista [valorHora=" + valorHora + ", numeroHoras=" + numeroHoras + ", nome=" + nome
				+ ", numeroRegistro=" + numeroRegistro + "]";
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	
	
	
}
