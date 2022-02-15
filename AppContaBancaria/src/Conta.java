
public class Conta {
	
	int numeroDaConta;
	String nomeTitular;
	String cpf;
	int tipo;
	double saldo;
	

	
	void depositar(double valor) {
		saldo += valor;
	}
	
	boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;		
	}
	
	
	void exibirDados(int num) {
		
		
		System.out.println("Conta Bancaria: "+numeroDaConta + 
				   ((tipo==0)?" - Conta Corrente":
					          ((tipo==1)?" - Poupan�a":" - Investimentos")));
		System.out.println("Titular: "+nomeTitular+" ("+cpf+")");
		System.out.printf("R$ %.2f\n",saldo);
	}
}
