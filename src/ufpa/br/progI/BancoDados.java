package ufpa.br.progI;

public abstract class BancoDados 
{
	private String nomeBanco;
	private String tipoBanco;
	private Data dataCriacao;
	protected static int qtadeProjetos = 0;
	
	public static void verificarProjetos()
	{
		System.out.println("A quantidade de projetos existente no Banco de Dados �: "+
				qtadeProjetos+".\n");
	}

}
