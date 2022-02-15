import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	    Scanner keyboard = new Scanner(System.in);

	    char O;
	    double S = 0.0;
	    double M = 0.0;

	    O = keyboard.next().charAt(0);

	    float[][] matriz = new float[12][12];
	    
	    for(int l = 0; l < 12; l++){
	        for(int c = 0; c < 12; c++){
	           System.out.print( matriz[l][c]);
	        }
	    }


	    keyboard.close();


	    }
}
