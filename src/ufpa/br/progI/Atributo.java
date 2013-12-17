package ufpa.br.progI;

public class Atributo 
{
	private String nomeAtributo;
	private String descricaoAtributo;
	private String tipoAtributo;
	
	public Atributo(String nomeAtributo,String descricaoAtributo,String tipoAtributo)
	{
		setNomeAtributo(nomeAtributo);
		setDescricaoAtributo(descricaoAtributo);
		setTipoAtributo(tipoAtributo);
	}
	
	public void setNomeAtributo(String nomeAtributo)
	{
		this.nomeAtributo = nomeAtributo;
	}
	
	public void setDescricaoAtributo(String descricaoAtributo)
	{
		this.descricaoAtributo = descricaoAtributo;
	}
	
	public void setTipoAtributo(String tipoAtributo)
	{
		this.tipoAtributo = tipoAtributo;
	}
	
	public String getNomeAtributo()
	{
		return nomeAtributo;
	}
	
	public String getDescricaoAtributo()
	{
		return descricaoAtributo;
	}
	
	public String getTipoAtributo()
	{
		return tipoAtributo;
	}
}
