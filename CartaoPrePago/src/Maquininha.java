

public class Maquininha {
	public static void main(String[] args) {
		
		Cartao c1, c2;
		CartaoCashBack ccb1, ccb2;
		

		c1 = new Cartao("123 456 789", "Jéssica Vargas Zanchetta", 22, 12);
		c2 = new Cartao("987 654 321", "Stephen King", 25, 10);
		ccb1 = new CartaoCashBack("552233", "Machado de Assis",24, 9, 0);
		ccb2 = new CartaoCashBack("665544", "José de Alencar",22, 5, 1);
		
		
		ccb1.comprar();
		
		System.out.println(ccb1.exibirInfo());
		
		ccb2.comprar();
		
		System.out.println(ccb2.exibirInfo());
		
		c1.comprar();
		
		System.out.println(c1.exibirInfo());
		
		c2.comprar();
		
		System.out.println(c2.exibirInfo());
		
		
	}
}