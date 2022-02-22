package core;

public class Chefe extends Funcionario{
	
	protected double salarioBase;
	protected double adicionalFuncao;
	protected double beneficioTerno;
	

	public Chefe(String nome, int numeroRegistro, double salarioBase, double adicionalFuncao, double beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}



	@Override
	public double calcularSalario() {
		return this.salarioBase + this.salarioBase*this.adicionalFuncao/100 + this.beneficioTerno;
	}
	
	
	@Override
	public String toString() {
		return "Chefe [salarioBase=" + salarioBase + ", adicionalFuncao=" + adicionalFuncao + ", beneficioTerno="
				+ beneficioTerno + ", nome=" + super.nome + ", numeroRegistro=" + super.numeroRegistro + "]";
	}



	public double getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}



	public double getAdicionalFuncao() {
		return adicionalFuncao;
	}



	public void setAdicionalFuncao(double adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}



	public double getBeneficioTerno() {
		return beneficioTerno;
	}



	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
	

	

}
