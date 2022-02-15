import java.util.Scanner;
public class Cartao {
	
	Scanner teclado = new Scanner(System.in);
	private String numeroCartao;
	private String nomeTitular;
	private int anoValidade;
	private int mesValidade;
	private double saldo;
	
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public int getAnoValidade() {
		return anoValidade;
	}
	
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	
	public int getMesValidade() {
		return mesValidade;
	}
	
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cartao(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = 0.00;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean comprar() {
		double valor = teclado.nextDouble();
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;		
	}
	
	public String exibirInfo() {
		String mensagem = "Numero do Cartao: " + numeroCartao + " \nTitular: " + nomeTitular + " \nAno de validade: "
				+ anoValidade + " \nMes de validade: " + mesValidade + " \nSaldo: "
				+ saldo + "\n";

		return mensagem;
	}
	
	
}
