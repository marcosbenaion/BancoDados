package ufpa.br.progI;

public class BancoDadosProjeto extends BancoDados implements Informavel
{
	private String nomeProjeto;
	private String bancoDadosClasses;
	@Override
	public void imprimirBancoDados() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo dados do Banco: "+nomeBanco);
		System.out.println("Tipo do Banco: "+tipoBanco);
		System.out.println("Nome do projeto: "+nomeProjeto);
		System.out.println("Classes associadas: "+bancoDadosClasses);
		// adicionar mostrar classes
	}

	public void entradaDados(String valor) { // realiza entrada de dados p/ adicionar classes
		// TODO Auto-generated method stub
		bancoDadosClasses = valor;
	}
	
	public BancoDadosProjeto(String nomeBanco,String nomeProjeto,int dia,int mes,int ano)
	{
		this.nomeBanco = nomeBanco;
		tipoBanco = "Banco de Dados de Projeto";
		setNomeProjeto(nomeProjeto);
		Data dataCriacao = new Data(dia,mes,ano);
		qtadeProjetos = qtadeProjetos+1;
	}
	
	public BancoDadosProjeto()
	{
		this.nomeBanco = "Banco de Dados de Projeto "+qtadeProjetos;
		tipoBanco = "Banco de Dados de Projeto";
		setNomeProjeto("Projeto "+qtadeProjetos);
		Data dataCriacao = new Data(17,12,2013);
		qtadeProjetos = qtadeProjetos+1;
		bancoDadosClasses = "Nenhuma classe associada";
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
