class Pessoa 
{
	private int id;
	private Data nascimento;

	public Pessoa()
	{
		this.nascimento = new Data();
	}
	public Data getNascimento()
	{
		return this.nascimento;
	}
	public void setNascimento(Data d)
	{
		this.nascimento = d;
	}
	public int getID() 
	{
		return this.id;
	}
	public void setID(int id) 
	{
		this.id = id;
	}
}