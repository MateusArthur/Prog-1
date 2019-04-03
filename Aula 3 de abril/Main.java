class Main 
{
	public static void print(String a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Pessoa p = new Pessoa();
		p.nascimento.setDia(11);
		p.nascimento.setMes(01);
		p.setID(20);
		print("Dia = " + p.getNascimento().getDia() + " Mês = " + p.getNascimento().getMes() + " ID = " + p.getID());
	}
}