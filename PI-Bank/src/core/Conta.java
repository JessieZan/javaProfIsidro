package core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldo;
	
	public Conta(String nomeTitular, String cpf, int numeroConta, float saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	
	
	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", cpf=" + cpf + ", numeroConta=" + numeroConta + ", saldo="
				+ saldo + ", getNomeTitular()=" + getNomeTitular() + ", getCpf()=" + getCpf() + ", getNumeroConta()="
				+ getNumeroConta() + ", getSaldo()=" + getSaldo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	public void creditar(double valor) {
		saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;		
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}



	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public int getNumeroConta() {
		return numeroConta;
	}



	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}



	



	
}
