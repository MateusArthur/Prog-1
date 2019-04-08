class Evento 
{
	private int id;
	private Data2 encontros[];
	public Evento()
	{
		for(int x = 0; x < encontros.length; x ++)
			this.encontros[x] = new Data2();	
	}
	public void setId(int i)
	{
		this.id = i;
	}
	public int getId()
	{
		return this.id;
	}
	public Data2[] getEncontros()
	{
		return this.encontros;
	}
	public void setEncontros(Data2[] d)
	{
		this.encontros =d;
	}
	public void setDia(int d, int p)
	{
		this.encontros[p].dia = d;
	}
	public void setMes(int m, int p)
	{
		this.encontros[p].mes = m;
	}
	public void setAno(int a, int p)
	{
		this.encontros[p].mes = a;
	}
	public int getDia(int p)
	{
		return this.encontros[p].dia;
	}
	public int getMes(int p)
	{
		return this.encontros[p].mes;
	}
	public int getAno(int p)
	{
		return this.encontros[p].ano;
	}
}