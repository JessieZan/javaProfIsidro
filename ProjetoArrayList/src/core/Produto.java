package core;

import java.util.ListIterator;

public class Produto {
	private int    id;
	private String nome;
	private double preco;
	private int qtddEmEstoque;
	
	public Produto(int id, String nome, double preco, int qtddEmEstoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qtddEmEstoque = qtddEmEstoque;
	}
	public Produto(Produto produto) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", qtddEmEstoque=" + qtddEmEstoque + "]";
	}
	
	
	
}
