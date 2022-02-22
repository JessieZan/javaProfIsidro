package core;

public class Comissionado extends Funcionario{

	protected double salarioBase;
	protected double comissao;
	
	public Comissionado(String nome, int numeroRegistro, double salarioBase, double comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioBase + (this.salarioBase*this.comissao/100);
	}

	@Override
	public String toString() {
		return "Comissionado [salarioBase=" + salarioBase + ", comissao=" + comissao + ", nome=" + nome
				+ ", numeroRegistro=" + numeroRegistro + "]";
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
