package entidades;

import java.util.Date;

public class ProdutoUsado extends Produto{
	
	private Date dataFabricacao;
	
	public ProdutoUsado() {
		
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String precoEtiqueta() {
		return super.getNome() + "(usado) R$ " + "(Data de fabricação: " + dataFabricacao + ")";
			
	}


}
