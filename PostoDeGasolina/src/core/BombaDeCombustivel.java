package core;

public class BombaDeCombustivel {
	
	private double qtddLitros, valorTotal;
	
	private TipoDeCombustivel listaTipos[];

	public BombaDeCombustivel() {
		super();
		this.qtddLitros = 0.0;
		this.valorTotal = 0.0;
		this.listaTipos = new TipoDeCombustivel[3];
		
		this.listaTipos[0] = new TipoDeCombustivel("0 - Gasolina", 3.50);
		this.listaTipos[1] = new TipoDeCombustivel("1 - Alcool", 2.50);
		this.listaTipos[2] = new TipoDeCombustivel("2 - Diesel", 1.50);
	}
	
	public String exibirDisplay() {
		String msg="";
		for (TipoDeCombustivel t: listaTipos) {
			msg = msg + t.getNome() + " R$ "+t.getValorLitro()+"\n";
		}
		return msg;
	}
	
	public String calculaValorPorLitro(double valor, int opcao) {
		double total = valor /this.listaTipos[opcao].getValorLitro();
		String msg="A Quantidade de litros de "+ listaTipos[opcao].getNome() + " a ser abastecida é de " + total + " o valor por litro é de " + listaTipos[opcao].getValorLitro();
		return msg;
	}

	public double getQtddLitros() {
		return qtddLitros;
	}

	public void setQtddLitros(double qtddLitros) {
		this.qtddLitros = qtddLitros;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public TipoDeCombustivel[] getListaTipos() {
		return listaTipos;
	}

	public void setListaTipos(TipoDeCombustivel[] listaTipos) {
		this.listaTipos = listaTipos;
	}
	
	
	
}
