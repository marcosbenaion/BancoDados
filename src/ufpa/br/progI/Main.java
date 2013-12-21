package ufpa.br.progI;

public class Main {

	public static void main(String[] args) 
	{
		//verificando a quantidade de projetos adicionados
		//BancoDados.verificarProjetos();
		//criando um Banco de Dados de um Projeto
		BancoDadosProjeto ProjetoPicareta = new BancoDadosProjeto("BD de ProjetoPicareta",
				"ProjetoPicareta","Marcos",18,12,2013);
		//ProjetoPicareta.imprimirBancoDados();
		System.out.println();
		//criando classe Item (Banco de Dados da Classe Item)
		BancoDadosClasse Item = new BancoDadosClasse("BD de Classe Item","Item","Classe abstrata Item",
				"ProjetoPicareta",18,12,2013);
		//Item.imprimirBancoDados();
		System.out.println();
		//associando Item com o Projeto
		ProjetoPicareta.entradaDados("Item");
		ProjetoPicareta.imprimirBancoDados();
		//criando classe Picareta (Banco de Dados da Classe Picareta)
		BancoDadosClasse Picareta = new BancoDadosClasse("BD de Classe Picareta","Picareta",
				"Classe abstrata Picareta, estende de Item","ProjetoPicareta",18,12,2013);
	//	Picareta.imprimirBancoDados();
		System.out.println();
		//criando Banco de dados de atributos de Picareta
		BancoDadosAtributos PicaretaAtributos = new BancoDadosAtributos("BD de Atributos de Picareta",
				"Picareta",18,12,2013);
		//criando atributos
		Atributo resistenciaMax = new Atributo("resistenciaMax","Armazena a resistencia máxima da picareta","Inteiro");
		Atributo resistenciaAtual = new Atributo("resistenciaAtual","Armazena a resistência atual da Picareta","Inteiro");
		Atributo eficiencia = new Atributo("eficiencia","Armazena para qual tipo de materia a picareta é eficiente","String");
		Atributo preco = new Atributo("preco","Armazena o preco da picareta,baseado na resistencia da mesma","Inteiro");
		  //associando atributos com o Banco de Dados de Atributos de Picareta
		PicaretaAtributos.associar(resistenciaMax);
		PicaretaAtributos.associar(resistenciaAtual);
		PicaretaAtributos.associar(eficiencia);
		PicaretaAtributos.associar(preco);
		  // atualizando lista de atributos
		PicaretaAtributos.entradaDados("resistenciaMax,resistenciaAtual,eficiencia,preco");
		//PicaretaAtributos.imprimirBancoDados();
		System.out.println();
		// se quiser acessar um atributo
		PicaretaAtributos.listarAtributo(resistenciaMax);
		System.out.println();
		//criando Banco de dados de Metodos de Picareta
		BancoDadosMetodos PicaretaMetodos = new BancoDadosMetodos("BD de Metodos de Picareta","Picareta",18,12,2013);
		//criando metodos
		Metodo mostrarPreco = new Metodo("mostrarPreco","Nenhum","Mostra o preco da Picareta","Sem retorno(void)");
		Metodo decrementarResistencia = new Metodo("decrementarResistencia","Nenhum","Decrementa a resistencia da "
				+ "Picareta quando for utilizada","Sem retorno(void)");
		Metodo iniciarResistencia = new Metodo("iniciarResistencia","Nenhum","Inicia a resistencia da "
				+ "picareta com o valor de resistencia máximo","Sem retorno(void)");
		Metodo verificarResistencia = new Metodo("verificarResistencia","Nenhum","Exibe a resistencia atual da "
				+ "picareta","Sem retorno(void)");
		Metodo reparar = new Metodo("reparar","Nenhum","Restaura a resistencia atual da "
				+ "picareta para o valor de resistencia maximo","Sem retorno(void)");
		   // associando metodos com o Banco de Dados de Metodos de Picareta
		PicaretaMetodos.associar(mostrarPreco);
		PicaretaMetodos.associar(decrementarResistencia);
		PicaretaMetodos.associar(iniciarResistencia);
		PicaretaMetodos.associar(verificarResistencia);
		PicaretaMetodos.associar(reparar);
		   // atualizando lista de metodos
		PicaretaMetodos.entradaDados("mostrarPreco,decrementarResistencia,iniciarResistencia,verificarResistencia,reparar");
		//PicaretaMetodos.imprimirBancoDados();
		System.out.println();
		// mostrando um metodo
		PicaretaMetodos.listarMetodo(reparar);
		System.out.println();
		// Associando os Bancos de Dados de atributos e metodos com a classe
		Picareta.entradaDados("PicaretaAtributos", "PicaretaMetodos");
		//Picareta.imprimirBancoDados();
		System.out.println();
		// Associando a classe Picareta com o ProjetoPicareta
		ProjetoPicareta.entradaDados("Item,Picareta");
		//ProjetoPicareta.imprimirBancoDados();
		// ----- Criando outras classes PicaretaFerro e PicaretaDiamante
		BancoDadosClasse PicaretaFerro = new BancoDadosClasse("BD de Classe PicaretaFerro","PicaretaFerro","Classe concreta, "
				+ "estende de Picareta","ProjetoPicareta",18,12,2013);
		BancoDadosMetodos PicaretaFerroMetodos = new BancoDadosMetodos("BD de metodos de PicaretaFerro","PicaretaFerro",18,12,2013);
		Metodo minerarFerro = new Metodo("minerarFerro","Nenhum","Minera o material Ferro, realizando checagem do mesmo e "
				+ "decrementa resistencia da picareta","Sem retorno(void)");
		PicaretaFerroMetodos.associar(minerarFerro);
		PicaretaFerroMetodos.entradaDados("minerarFerro");
		ProjetoPicareta.entradaDados("Item,Picareta,PicaretaFerro");
		PicaretaFerro.entradaDados("Nenhum BD -> Atributos Herdados apenas", "PicaretaFerroMetodos");
		
		BancoDadosClasse PicaretaDiamante = new BancoDadosClasse("BD de classe PicaretaDiamante","PicaretaDiamante","Classe concreta,"
				+ " estende de Picareta","ProjetoPicareta",18,12,2013);
		BancoDadosMetodos PicaretaDiamanteMetodos = new BancoDadosMetodos("BD de metodos de PicaretaDiamante",
				"PicaretaDiamante",18,12,2013);
		Metodo minerarDiamante = new Metodo("minerarDiamante","Nenhum","Minera o material Diamante, realiza "
				+ "checagem do material e consome resistencia","Sem retorno(void)");
		PicaretaDiamanteMetodos.associar(minerarDiamante);
		PicaretaDiamanteMetodos.entradaDados("minerarDiamante");
		ProjetoPicareta.entradaDados("Item,Picareta,PicareaFerro,PicaretaDiamante");
		PicaretaDiamante.entradaDados("Nenhum BD -> Atributos Herdados apenas", "PicaretaDiamanteMetodos");
		
		System.out.println("-------------------------------------------------");
		// mostrando os Bancos de Dados Finais
		System.out.println();
		ProjetoPicareta.imprimirBancoDados();
		System.out.println();
		Item.imprimirBancoDados();
		System.out.println();
		Picareta.imprimirBancoDados();
		System.out.println();
		PicaretaAtributos.imprimirBancoDados();
		   // imprimindo um atributo
		   System.out.println();
		   PicaretaAtributos.listarAtributo(eficiencia);
		   System.out.println();
		PicaretaMetodos.imprimirBancoDados();
		   // imprimindo um metodo
		   System.out.println();
		   PicaretaMetodos.listarMetodo(mostrarPreco);
		   System.out.println();
		PicaretaFerro.imprimirBancoDados();
		System.out.println();
		PicaretaDiamante.imprimirBancoDados();
		System.out.println();
	}

}
