package core;

public class PessoaFisica extends Contribuinte{

    protected String cpf;
    protected double redimentoAnual;
    protected int dependentes;


    public PessoaFisica(String cpf, double redimentoAnual, int dependentes) {
        super(nome,endereco,numeroCadastral);

        this.cpf = cpf;
        this.redimentoAnual = redimentoAnual;
        this.dependentes = dependentes;
    }


    @Override
    public String toString() {
        return "{" +
            " cpf='" + getCpf() + "'" +
            ", redimentoAnual='" + getRedimentoAnual() + "'" +
            ", dependentes='" + getDependentes() + "'" +
            "}";
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


}
