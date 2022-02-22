
public enum MultiplaEscolha {
	A(""),
	B(""),
	C(""),
	D("");
	
	private String alternativa;
	
	MultiplaEscolha(String alternativa){
		this.alternativa = alternativa;
	}

	public String getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(String alternativa) {
		this.alternativa = alternativa;
	}
	
	
}
