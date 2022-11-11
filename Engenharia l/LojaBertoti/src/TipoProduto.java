public class TipoProduto {
	private String nome;
	private String alimentos;
	private String limpeza;
	private String utilitarios;

	public TipoProduto(String nome, String alimentos, String limpeza, String utilitarios) {
		this.nome = nome;
		this.alimentos = alimentos;
		this.limpeza = limpeza;
		this.utilitarios = utilitarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(String alimentos) {
		this.alimentos = alimentos;
	}

	public String getLimpeza() {
		return limpeza;
	}

	public void setLimpeza(String limpeza) {
		this.limpeza = limpeza;
	}
	
	public String getUtilitarios() {
		return utilitarios;
	}

	public void setUtilitarios(String utilitarios) {
		this.utilitarios = utilitarios;
	}
	
    public boolean comparacao (TipoProduto tipoProduto){
        if(this.alimentos.equals(tipoProduto.alimentos) && this.nome.equals(tipoProduto.nome) && this.limpeza.equals(tipoProduto.limpeza) && this.utilitarios.equals(tipoProduto.utilitarios)){
            return true;
        }
        else{
            return false;
        }
    }
}