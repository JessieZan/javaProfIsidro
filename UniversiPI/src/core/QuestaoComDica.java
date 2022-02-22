package core;

public class QuestaoComDica extends QuestaoSimples{
	protected String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	@Override
	public String toString() {
		return "QuestaoComDica [dica=" + dica + ", enunciado=" + enunciado + ", resposta=" + resposta + "]";
	}
	
	@Override
	public String aplicarQuestao() {
		return super.enunciado + "\nDica: " + this.dica;
	}

	@Override
	public boolean corrigir(String resposta) {
		return this.resposta.equalsIgnoreCase(resposta);
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	
	
	
}
