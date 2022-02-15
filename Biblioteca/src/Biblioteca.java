import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] ars) {
		Livro l1, l2, l3, l4, l5;
		Scanner teclado = new Scanner(System.in);

		l1 = new Livro("Annabelle", "Jéssica Vargas Zanchetta", "Terror", "E1P1", 1999);
		l2 = new Livro("Pet Sematary", "Stephen King", "Terror", "E1P2", 1999);
		l3 = new Livro("Dom Casmurro", "Machado de Assis", "Romance", "E5P2", 1930);
		l4 = new Livro("Iracema", "José de Alencar", "Romance", "E5P2", 1950);
		l5 = new Livro("Mogli", "Jéssica Vargas Zanchetta", "Desenho", "E1P2", 1980);

		/*
		 * l1.setTitulo("Annabelle"); l1.setAutor("Jéssica Vargas Zanchetta");
		 * l1.setAnoDePublicacao(1999); l1.setCategoria("Terror");
		 * l1.setPosicao("E1P2"); l1.devolver();
		 * 
		 * l2.setTitulo("Pet Sematary"); l2.setAutor("Stephen King");
		 * l2.setAnoDePublicacao(1989); l2.setCategoria("Terror");
		 * l2.setPosicao("E1P1"); l2.devolver();
		 * 
		 * l3.setTitulo("Dom Casmurro"); l3.setAutor("Machado de Assis");
		 * l3.setAnoDePublicacao(1930); l3.setCategoria("Romance");
		 * l3.setPosicao("E5P2"); l3.devolver();
		 * 
		 * l4.setTitulo("Iracema"); l4.setAutor("José de Alencar");
		 * l4.setAnoDePublicacao(1950); l4.setCategoria("Romance");
		 * l4.setPosicao("E1P2"); l4.devolver();
		 * 
		 * l5.setTitulo("Mogli"); l5.setAutor("Jéssica Vargas Zanchetta");
		 * l5.setAnoDePublicacao(1980); l5.setCategoria("Desenho");
		 * l5.setPosicao("E1P2"); l5.devolver();
		 */
		
		System.out.println(l1.exibirInfo());
		System.out.println(l2.exibirInfo());
		System.out.println(l3.exibirInfo());
		System.out.println(l4.exibirInfo());
		System.out.println(l5.exibirInfo());

		l1.emprestar();

		System.out.println(l1.exibirInfo());

		teclado.close();
	}
}
