class Circulo extends FormaGeometrica 
{
	public Rotulo rotulo = new Rotulo();
	private int raio;

	public void setRaio(int r)
	{
		this.raio = r;
	}
	public int getRaio()
	{
		return this.raio;
	}
}