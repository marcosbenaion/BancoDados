package ufpa.br.progI;

public class BancoDadosProjeto extends BancoDados implements Informavel
{
	private final String nomeProjeto;
	private String bancoDadosClasses;
	private final String administrador;
	@Override
	public void imprimirBancoDados() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo dados do Banco: "+nomeBanco);
		System.out.println("Tipo do Banco: "+tipoBanco);
		System.out.println("Nome do projeto: "+nomeProjeto);
		System.out.println("Classes associadas: "+bancoDadosClasses);
		System.out.println("Adiministrador do projeto: "+administrador);
		// adicionar mostrar classes
	}

	public void entradaDados(String valor) { // realiza entrada de dados p/ adicionar classes
		// TODO Auto-generated method stub
		bancoDadosClasses = valor;
	}
	
	public BancoDadosProjeto(String nomeBanco,String nomeProjeto,String administrador,int dia,int mes,int ano)
	{
		this.nomeBanco = nomeBanco;
		tipoBanco = "Banco de Dados de Projeto";
		this.nomeProjeto = nomeProjeto;
		Data dataCriacao = new Data(dia,mes,ano);
		qtadeProjetos = qtadeProjetos+1;
		bancoDadosClasses = "Nenhuma classe associada";
		this.administrador = administrador;
	}
	
	public BancoDadosProjeto()
	{
		nomeBanco = "Banco de Dados de Projeto "+qtadeProjetos;
		tipoBanco = "Banco de Dados de Projeto";
		nomeProjeto = "Projeto em Branco";
		Data dataCriacao = new Data(17,12,2013);
		qtadeProjetos = qtadeProjetos+1;
		bancoDadosClasses = "Nenhuma classe associada";
		administrador = "Nenhum selecionado";
	}
	
	public String getNomeProjeto()
	{
		return nomeProjeto;
	}
}
