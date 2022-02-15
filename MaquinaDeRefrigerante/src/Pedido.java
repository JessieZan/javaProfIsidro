import java.util.Scanner;

public class Pedido {
	
	Scanner teclado = new Scanner(System.in);
	
	
	private double valorTotal;
	private Refrigerante refrigerante;
	Refrigerante listaItens[];
	
	//listaItens = new Refrigerante[6];
	
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public Refrigerante getRefrigerante() {
		return refrigerante;
	}
	
	public void setRefrigerante(Refrigerante refrigerante) {
		this.refrigerante = refrigerante;
	}
	
	
	
	
}
