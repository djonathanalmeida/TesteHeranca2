package entidades;

public class ProdutoImportado extends Produto{
	
	private Double taxa;
	
	public ProdutoImportado() {
		
	}

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double precoTotal() {
		return super.getPreco() + taxa;
	}
	
	@Override
	public String precoEtiqueta() {
		return super.getNome() + "R$ " + String.valueOf(precoTotal()) + "(Taxa: R$ " + taxa + ")";
	}

}
