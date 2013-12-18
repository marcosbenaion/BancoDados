package ufpa.br.progI;

public class BancoDadosClasse extends BancoDados implements Informavel
{
	private String nomeClasse;
	private String descricao;
	private String projetoRelacionado;
	private String bancoAtributos;
	private String bancoMetodos;
	
	public BancoDadosClasse()
	{
		nomeBanco = "Banco de dados de classe(novo)";
		tipoBanco = "Banco de dados de classe";
		setNomeClasse("Classe(novo)");
		setDescricaoClasse("Descricao da classe (aqui)");
		setProjetoRelacionado("Nenhum");
	}

	@Override
	public void imprimirBancoDados() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo dados do Banco: "+nomeBanco);
		System.out.println("Tipo do Banco: "+tipoBanco);
		System.out.println("Nome da classe: "+nomeClasse);
		System.out.println("Descricao da classe: "+descricao);
		System.out.println("Projeto Relacionado: "+projetoRelacionado);
		// adicionar mostrar atributos e metodos
	}


	public void entradaDados(String atributos,String metodos) {
		// TODO Auto-generated method stub
		bancoAtributos = atributos;
		bancoMetodos = metodos;
	}
	
	public void setNomeClasse(String nomeClasse)
	{
		this.nomeClasse = nomeClasse;
	}
	
	public void setDescricaoClasse(String descricao)
	{
		this.descricao = descricao;
	}
	
	public void setProjetoRelacionado(String projetoRelacionado)
	{
		this.projetoRelacionado = projetoRelacionado;
	}
}
