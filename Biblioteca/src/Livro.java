
public class Livro {
	private String titulo;
	private String autor;
	private int anoDePublicacao;
	private String categoria;
	private String posicao;
	private boolean emprestado;
	
	
	public Livro(String titulo,String autor,String categoria,String posicao,int anoDePublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
		this.categoria = categoria;
		this.posicao = posicao;
		this.emprestado = false;
	}
	
	
/*
	public Livro(String titulo, String autor, int anoDePublicacao, String categoria, String posicao,
			boolean emprestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
		this.categoria = categoria;
		this.posicao = posicao;
		this.emprestado = false;
	}

*/

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public boolean isEmprestado() {
		return emprestado;
	}


	public void emprestar() {
		this.emprestado = true;
	}

	public void devolver() {
		this.emprestado = false;
	}

	public String exibirInfo() {
		String mensagem = "Título do Livro: " + titulo + " \nAutor do Livro: " + autor + " \nAno de publicacao: "
				+ anoDePublicacao + " \nCategoria: " + categoria + " \nPosicao: " + posicao + " \nStatus: "
				+ (emprestado ? "Emprestado" : "Disponivel") + "\n";

		return mensagem;
	}

}
