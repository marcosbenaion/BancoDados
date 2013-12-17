package ufpa.br.progI;

public class BancoDadosProjeto extends BancoDados implements Informavel
{
	private String nomeProjeto;
	private BancoDadosClasse vetorClasses[];
	@Override
	public void imprimirBancoDados(BancoDadosProjeto objeto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void entradaDados(BancoDadosProjeto objeto) {
		// TODO Auto-generated method stub
		
	}
	
	public BancoDadosProjeto(String nomeBanco,String nomeProjeto,int dia,int mes,int ano)
	{
		tipoBanco = "Banco de Dados de Projeto";
		setNomeProjeto(nomeProjeto);
	}
	
	public void setNomeProjeto(String nomeProjeto)
	{
		this.nomeProjeto = nomeProjeto;
	}
	
	public String getNomeProjeto()
	{
		return nomeProjeto;
	}
}
