
import java.util.Scanner;
public class TestePalindromo {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String palavra = teclado.nextLine();
		char letras[] = palavra.toCharArray();
		boolean palindromo = true;
		
		for(int i = 0; i < letras.length /2 && palindromo; i++) {
			
				if(letras[i] != letras[letras.length - 1 - i]) {
					palindromo = false;
					break;
					
				}
		}
		
		System.out.println(palindromo ? "eh palindromo" : "nao eh palindromo");
		
		teclado.close();
	}
}
