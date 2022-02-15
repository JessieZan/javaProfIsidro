
public class Refrigerante {

		private int ID;
		private String nome;
		private double preco;
		private int qtddEmEstoque;
		
		
		
		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public double getPreco() {
			return preco;
		}
		
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		public int getQtddEmEstoque() {
			return qtddEmEstoque;
		}
		
		public void setQtddEmEstoque(int qtddEmEstoque) {
			this.qtddEmEstoque = qtddEmEstoque;
		}

		public Refrigerante(int iD, String nome, double preco, int qtddEmEstoque) {
			super();
			ID = iD;
			this.nome = nome;
			this.preco = preco;
			this.qtddEmEstoque = qtddEmEstoque;
		}
		
		
	
}
