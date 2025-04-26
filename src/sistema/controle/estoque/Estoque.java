package sistema.controle.estoque;

public class Estoque {

	private Integer qtdPeca;
	private Integer saldoEstoque = 0;
	
	public Estoque() {
		
	}
	
	public void compraPeca(Integer qtdPeca) {
		this.saldoEstoque += qtdPeca;
	}
	
	public void vendePeca() {
		this.saldoEstoque -= qtdPeca;
	}
	
	public Estoque(Integer qtdPeca, Integer saldoEstoque) {
		super();
		this.qtdPeca = qtdPeca;
		this.saldoEstoque = saldoEstoque;
	}

	public Integer getQtdPeca() {
		return qtdPeca;
	}

	public void setQtdPeca(Integer qtdPeca) {
		this.qtdPeca = qtdPeca;
	}

	public Integer getSaldoEstoque() {
		return saldoEstoque;
	}

	public void setSaldoEstoque(Integer saldoEstoque) {
		this.saldoEstoque = saldoEstoque;
	}
	
}
