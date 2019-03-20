class Retangulo 
{
	private double lado;
	private double altura;
	private int idade;

	public static void print(String a)
	{
		System.out.println(a);
	}
	public Retangulo() 
	{

	}
	public void setLado(double l) 
	{
		if(l <= 0){
			print("Lado minimo deve ser maior que zero 0");
			return;
		}
		this.lado = l;
	}
	public void setAltura(double a) 
	{
		if(a <= 0) 
		{
			print("Altura minima deve ser maior que zero 0");
			return;
		}
		this.altura = a;
	}
	public void setIdade(int i) 
	{
		if(i <= 0) 
		{
			print("Idade minima deve ser maior que zero 0");
			return;
		}
		this.idade = i;
	}
	public double getLado() 
	{
		print("Lado do Retangulo = " + this.lado);
		return this.lado;
	}
	public double getAltura() 
	{
		print("Altura do Triângulo = " + this.altura);
		return this.altura;
	}
	public int getIdade() 
	{
		print("Idade do Triângulo = " + this.idade);
		return this.idade;
	}
}