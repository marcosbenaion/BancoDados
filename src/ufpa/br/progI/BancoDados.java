package ufpa.br.progI;

public abstract class BancoDados 
{
	protected String nomeBanco;
	protected String tipoBanco;
	protected Data dataCriacao;
	protected static int qtadeProjetos = 0;
	protected static int qtadeBancoDadosClasses = 0;
	protected static int qtadeBancoDadosAtributos = 0;
	protected static int qtadeBancoDadosMetodos = 0;
	
	public static void verificarProjetos()
	{
		System.out.println("A quantidade de projetos existente no Banco de Dados é: "+
				qtadeProjetos+".\n");
	}
	
	public abstract void exibitQtadeBancoDados(); // exibe a quantidade de Banco de Dados do mesmo tipo que o selecioando
	

}
