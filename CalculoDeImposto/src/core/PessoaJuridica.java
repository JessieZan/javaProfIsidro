package core;

public class PessoaJuridica extends Contribuinte{
    
    protected String cnpj;
    protected double arrecadacao;


    public PessoaJuridica(String nome, String endereco, int numeroCadastral, String cnpj, double arrecadacao) {
		super(nome, endereco, numeroCadastral);
		this.cnpj = cnpj;
		this.arrecadacao = arrecadacao;
	}



	@Override
    public String toString() {
        return "{" +
            " cnpj='" + getCnpj() + "'" +
            ", faturamento='" + getArrecadacao() + "'" +
            "}";
    }
	
	@Override
	public String calculaImposto(double faturamento) {
    	
    	
    	if(faturamento < 100000){
            return "Isento";
        } else if (faturamento < 250000) {
        	return String.format("R$ %.2f\n",faturamento * 0.06);
        } else if (faturamento < 450000) {
        	return String.format("R$ %.2f\n",faturamento * 0.15);
        } else {
        	return String.format("R$ %.2f\n",faturamento * 0.25);
        }

    }


    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public double getArrecadacao() {
        return this.arrecadacao;
    }

    public void setArrecadacao(double faturamento) {
        this.arrecadacao = faturamento;
    }
    
    


}