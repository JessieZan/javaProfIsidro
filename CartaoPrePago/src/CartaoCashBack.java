import java.util.Scanner;

public class CartaoCashBack extends Cartao{
	
	Scanner teclado = new Scanner(System.in);
	
	protected int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	

	@Override
	public boolean comprar(double valor) {

		int tipo = this.tipo;
		if(valor <= super.saldo){
		if (tipo == 0) {
			super.saldo += valor*0.02;
			return true;
		} else if(tipo == 1) {
			super.saldo += valor*0.05;
			return true;
		} else if(tipo == 2) {
			super.saldo += valor*0.08;
			return true;
		}	
		}
		
		return false;		
	}


	@Override
	public String exibirInfo() {
		String mensagem = "Numero do Cartao: " + numeroCartao + " \nTitular: " + nomeTitular + " \nAno de validade: "
				+ anoValidade + " \nMes de validade: " + mesValidade + " \nTipo: " + tipo + " \nSaldo: "
				+ saldo + "\n";

		return mensagem;
	}
	
	
}
