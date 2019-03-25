class Main {
	public void main(String args[]) {
		BlurayDisc c;
		BlurayDisc h = new BlurayDisc("Teste", 1);
		String st = "teste";
		float num;

		// a) c.dados[10] = 'i';
		// R: A variável c não foi inicialidzada, ela está null
		// b) h.setIndentificacao(st, num);
		// Os parametros que deveriam ser passado seriam um String e um Int, ao invés esta sendo passado uma string e um float
		// c) c.setIndentificacao(12, "Outro metodo")
		// Alem de c não ter sido inicializada  ou argumentos são String, int
		// d) c = new BlurayDisc();
		// A assinatura do método está invalida deveria ser BlurayDisc(String, int)
		// e) h.rotulo = "Outro rótulo";
		// o método rotulo é privado so pode ser alterado dentro da classe
		// f) num = 2.34f; FUNCIONA
		num = 2.34f;
		// g) num = h.densidade;
		num = h.densidade;
		// h) st = h.getRotulo();
		// getrotulo e private só pode ser usado na classe
		// i) c = new BlurayDisc(st, 234);
		c = new BlurayDisc(st, 234);
		// c.dados[100] = "Dado posição 100";
		// c.dados[100] é tipo char  e não string
	}
}