package ufpa.br.progI;

public class Metodo 
{
	private String nomeMetodo;
	private String argumentosEntrada;
	private String descricaoMetodo;
	private String tipoRetorno;
	
	public Metodo(String nomeMetodo,String argumentosEntrada,String descricaoMetodo,
			String tipoRetorno)
	{
		setNomeMetodo(nomeMetodo);
		setArgumentosEntrada(argumentosEntrada);
		setDescricaoMetodo(descricaoMetodo);
		setTipoRetorno(tipoRetorno);
	}
	
	public void imprimeMetodo()
	{
		System.out.println("Nome do Método: "+nomeMetodo);
		System.out.println("Argumentos de entrada: "+argumentosEntrada);
		System.out.println("Descricao do método: "+descricaoMetodo);
		System.out.println("Tipo de retorno: "+tipoRetorno);
	}
	
	public void setNomeMetodo(String nomeMetodo)
	{
		this.nomeMetodo = nomeMetodo;
	}
	
	public void setArgumentosEntrada(String argumentosEntrada)
	{
		this.argumentosEntrada = argumentosEntrada;
	}
	
	public void setDescricaoMetodo(String descricaoMetodo)
	{
		this.descricaoMetodo = descricaoMetodo;
	}
	
	public void setTipoRetorno(String tipoRetorno)
	{
		this.tipoRetorno = tipoRetorno;
	}
	
	public String getNomeMetodo()
	{
		return nomeMetodo;
	}
	
	public String getArgumentosEntrada()
	{
		return argumentosEntrada;
	}
	
	public String getDescricaoMetodo()
	{
		return descricaoMetodo;
	}
	
	public String getTipoRetorno()
	{
		return tipoRetorno;
	}
}
