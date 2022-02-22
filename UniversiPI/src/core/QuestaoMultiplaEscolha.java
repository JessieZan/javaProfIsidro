package core;

public class QuestaoMultiplaEscolha extends QuestaoSimples{
	protected String alternativa1;
	protected String alternativa2;
	protected String alternativa3;
	protected String alternativa4;
	
	public QuestaoMultiplaEscolha(String enunciado, String resposta/*, String alternativa1, 
			String alternativa2, String alternativa3, String alternativa4*/) {
		super(enunciado, resposta);
		/*
		this.alternativa1 = alternativa1;
		this.alternativa2 = alternativa2;
		this.alternativa3 = alternativa3;
		this.alternativa4 = alternativa4;
		*/
	}
	
	@Override
	public String aplicarQuestao() {
		return super.enunciado + String.format("\nA)%s\nB)%s\nC)%s\nD)%s\n", this.alternativa1, this.alternativa2, this.alternativa3, this.alternativa4);
	}

	@Override
	public boolean corrigir(String resposta) {
		return this.resposta.equalsIgnoreCase(resposta);
	}

	@Override
	public String toString() {
		return "QuestaoMultiplaEscolha [alternativa1=A" + alternativa1 + ", alternativa2=B" + alternativa2
				+ ", alternativa3=C" + alternativa3 + ", alternativa4=D" + alternativa4 + "]";
	}

	public String getAlternativa1() {
		return alternativa1;
	}

	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}

	public String getAlternativa2() {
		return alternativa2;
	}

	public void setAlternativa2(String alternativa2) {
		this.alternativa2 = alternativa2;
	}

	public String getAlternativa3() {
		return alternativa3;
	}

	public void setAlternativa3(String alternativa3) {
		this.alternativa3 = alternativa3;
	}

	public String getAlternativa4() {
		return alternativa4;
	}

	public void setAlternativa4(String alternativa4) {
		this.alternativa4 = alternativa4;
	}
	
	

	
	
}
