import java.util.Scanner;

public class CartaoCashBack {
	
	Scanner teclado = new Scanner(System.in);
	
	private String numeroCartao;
	private String nomeTitular;
	private int anoValidade;
	private int mesValidade;
	private int tipo;
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
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, int tipo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.tipo = tipo;
		this.saldo = 0.0;
	}
	
	public boolean comprar() {
		double valor = teclado.nextDouble();
		int tipo = this.tipo;
		
		if (tipo == 0) {
			saldo += valor*0.02;
			return true;
		} else if(tipo == 1) {
			saldo += valor*0.05;
			return true;
		} else if(tipo == 2) {
			saldo += valor*0.08;
			return true;
		}
		return false;		
	}
	
	public String exibirInfo() {
		String mensagem = "Numero do Cartao: " + numeroCartao + " \nTitular: " + nomeTitular + " \nAno de validade: "
				+ anoValidade + " \nMes de validade: " + mesValidade + " \nTipo: " + tipo + " \nSaldo: "
				+ saldo + "\n";

		return mensagem;
	}
	
	
}
