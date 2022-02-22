package core;

public class Contribuinte {
    protected String nome;
	protected String endereco;
	protected int numeroCadastral;



    public Contribuinte(String nome, String endereco, int numeroCadastral) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.numeroCadastral = numeroCadastral;
    }



    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", endereco='" + getEndereco() + "'" +
            ", numeroCadastral='" + getNumeroCadastral() + "'" +
            "}";
    }
    
    


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroCadastral() {
        return this.numeroCadastral;
    }

    public void setNumeroCadastral(int numeroCadastral) {
        this.numeroCadastral = numeroCadastral;
    }


	public String calculaImposto(double valor) {
		
		return "";
	}



	public double getArrecadacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}

