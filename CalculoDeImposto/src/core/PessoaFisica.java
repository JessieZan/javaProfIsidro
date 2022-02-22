package core;

public class PessoaFisica extends Contribuinte{

    protected String cpf;
    protected double redimentoAnual;
    protected int dependentes;
    protected double arrecadacao;



    public PessoaFisica(String nome, String endereco, int numeroCadastral, String cpf, 
			int dependentes, double arrecadacao) {
		super(nome, endereco, numeroCadastral);
		this.cpf = cpf;
		this.dependentes = dependentes;
		this.arrecadacao = arrecadacao;
	}



	@Override
    public String toString() {
        return "{" +
            " cpf='" + getCpf() + "'" +
            ", redimentoAnual='" + getRedimentoAnual() + "'" +
            ", dependentes='" + getDependentes() + "'" +
            "}";
    }
	
	@Override
	public String calculaImposto(double rendimentoAnual) {
    	double base  = rendimentoAnual - (1770 * this.dependentes);
    	
    	if(base <= 25000){
            return "Isento";
        } else if (base < 50000) {
        	return String.format("R$ %.2f\n",base * 0.15);
        } else if (base < 100000) {
        	return String.format("R$ %.2f\n",base * 0.20);
        } else {
        	return String.format("R$ %.2f\n",base * 0.27);
        }

    }


    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRedimentoAnual() {
        return this.redimentoAnual;
    }

    public void setRedimentoAnual(double redimentoAnual) {
        this.redimentoAnual = redimentoAnual;
    }

    public int getDependentes() {
        return this.dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }


    @Override
	public double getArrecadacao() {
		return arrecadacao;
	}



	public void setArrecadacao(double arrecadacao) {
		this.arrecadacao = arrecadacao;
	}
    
    
    


}
