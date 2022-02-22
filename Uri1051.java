import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario,valorImposto,f1,f2,f3;
        
        salario = teclado.nextDouble();

        if(salario <= 2000){
            System.out.println("Isento");
        }

        if(salario > 2000 && salario<= 3000){
            f1 = (salario - 2000)*0.08;
            valorImposto = f1;
            System.out.printf("R$ %.2f\n",valorImposto);
        }

        if(salario > 3000 && salario <= 4500){
            f1 = 1000*0.08;
            f2 = (salario - 3000)*0.18;
            valorImposto = f1 + f2;
            System.out.printf("R$ %.2f\n",valorImposto);
        }

        if(salario > 4500){
            f1 = 1000*0.08;
            f2 = 1500*0.18;
            f3 = (salario - 4500)*0.28;
            valorImposto = f1 + f2 + f3;
            System.out.printf("R$ %.2f\n",valorImposto);
        }

        teclado.close();
    }
}