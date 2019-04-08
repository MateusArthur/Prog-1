class Dicionario
{
	private Variavel variaveis[];

	public Dicionario()
	{
		for(int x = 0; x < variaveis.length; x ++)
			this.variaveis[x] = new Variavel();
	}
	public Variavel[] getVariavel()
	{
		return this.variaveis;
	}
	public void setVariavel(Variavel[] d)
	{
		this.variaveis = d;
	}
} 