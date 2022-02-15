
import java.util.Scanner;

public class Machina {
	
		private double credito;
	
		Scanner teclado = new Scanner(System.in);
		
		Refrigerante produtosDisponiveis[];
		Pedido p1 = new Pedido();
		Refrigerante itemAdicionado;
		
		produtosDisponiveis = new Refrigerante[6];
		
		produtosDisponiveis[0] = new Refrigerante(0, "Coca-cola", 5.00, 6);
		produtosDisponiveis[1] = new Refrigerante(1, "Sprite", 5.00, 10);
		produtosDisponiveis[2] = new Refrigerante(2, "Fanta-Laranja", 5.00, 7);
		produtosDisponiveis[3] = new Refrigerante(3, "Fanta-uva", 3.00, 8);
		produtosDisponiveis[4] = new Refrigerante(4, "Guaraná", 3.00, 9);
		produtosDisponiveis[5] = new Refrigerante(5, "Pepsi Twist", 6.00, 4);
		
		public void criaPedido(double credito) {
			
			this.credito = credito;
		}
		
		public void addItem(Refrigerante refrigerante) {
			produtosDisponiveis[0] = refrigerante;
			if(produtosDisponiveis[0].getQtddEmEstoque() > 0) {
				
			}
			
			return "Seu carrinho contem " + listaItens.length + "itens\n"
					+ listaItens;
		}
		
		System.out.printf(p1.criaPedido(teclado.nextDouble()));
		System.out.println("Escolha os itens que deseja adicionar ao carrinho");
		for( Refrigerante item : produtosDisponiveis){
			System.out.println(item.nome);
		};
		
		itemAdicionado = produtosDisponiveis[teclado.nextInt()];
		
		if(itemAdicionado.qtddEmEstoque > 0) {
			addItem(itemAdicionado);
		} else {
			System.out.println("Produto fora de estoque. Por favor escolha outro item.");
		}
		
		
}
}
