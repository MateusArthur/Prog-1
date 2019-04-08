/*
						UML 

					- Private
					# Protect
					+ Public
*/
class Pessoa 
{
	private int id;
	private String nome;
	private Data nascimento;
	public Pessoa()
	{
		this.nascimento = new Data();
	}
	public Pessoa(int id, String nome)
	{
		this.nascimento = new Data();
		this.id = id;
		this.nome = nome;
	}
	public void setId(int i)
	{
		this.id = i;
	}
	public void setNome(String n)
	{
		this.nome = n;
	}
	public int getId()
	{
		return this.id;
	}
	public String getNome()
	{
		return this.nome;
	}
}