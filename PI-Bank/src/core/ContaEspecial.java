package core;

import core.exception.ContaException;

public class ContaEspecial extends Conta {

	double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float saldo, double limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", nomeTitular=" + nomeTitular + ", cpf=" + cpf + ", numeroConta="
				+ numeroConta + ", saldo=" + saldo + ", toString()=" + super.toString() + ", getNomeTitular()="
				+ getNomeTitular() + ", getCpf()=" + getCpf() + ", getNumeroConta()=" + getNumeroConta()
				+ ", getSaldo()=" + getSaldo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public void creditar(double valor) {
		if (valor <= 0) {
			throw new ContaException("O valor nao pode ser negativo ou zero!");
		}
		saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (valor <= 0) {
			throw new ContaException("O valor nao pode ser negativo ou zero!");
		}
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		} else if(valor > saldo) {
			
			if(valor <= limite+saldo) {
				saldo = 0;
				limite = valor - saldo;
				return true;
			} else if(valor > limite + saldo){
				return false;
			}
			
				
		}
	return false;
	
	}
	}
