class BlurayDisc {
	private String rotulo;
	protected int id;
	protected float densidade;
	public char[] dados;

	public BlurayDisc(String rotulo, int id) {
		setIndentificacao(rotulo, id);
		this.dados = new char[4096];
	}

	public void setIndentificacao(String rotulo, int id) {
		this.rotulo = rotulo;
		this.id = id;
	}

	private String getRotulo() {
		return this.rotulo;
	}
}