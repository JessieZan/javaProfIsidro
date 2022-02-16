package core;

public class PessoeJuridica extends Contribuinte{
    
    protected String cnpj;
    protected double faturamento;


    public PessoeJuridica(String cnpj, double faturamento) {
        super(nome,endereco,numeroCadastral);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }


    @Override
    public String toString() {
        return "{" +
            " cnpj='" + getCnpj() + "'" +
            ", faturamento='" + getFaturamento() + "'" +
            "}";
    }



    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getFaturamento() {
        return this.faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }


}
