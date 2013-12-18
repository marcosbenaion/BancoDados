package ufpa.br.progI;

import java.util.ArrayList;

public class BancoDadosAtributos extends BancoDados implements Informavel
{
	private ArrayList< Atributo > vetorAtributos = new ArrayList< Atributo >();
	private String classeRelacionada;
	private String listaAtributos;
	
	public BancoDadosAtributos()
	{
		this.nomeBanco = "Banco de Dados de Atributos (novo)";
		tipoBanco = "Banco de Dados de atributos";
		Data dataCriacao = new Data(17,12,2013);
		listaAtributos = "Nenhum atributo";
		classeRelacionada = "Nenhuma";
	}
	
	public BancoDadosAtributos(String nomeBanco,String classeRelacionada,int dia,int mes, int ano)
	{
		this.nomeBanco = nomeBanco;
		Data dataCriacao = new Data(dia,mes,ano);
		listaAtributos = "Nenhum atributo";
		this.classeRelacionada = classeRelacionada;
		tipoBanco = "Banco de Dados de atributos";
	}
	
	public void entradaDados(String listaAtributos)
	{
		this.listaAtributos = listaAtributos;
	}
	
	public void listarAtributo(Atributo objeto)
	{
		objeto.imprimeAtributo();
	}
	
	public void associar(Atributo objeto)
	{
		vetorAtributos.add(objeto);
	}


	@Override
	public void imprimirBancoDados() {
		// TODO Auto-generated method stub
		System.out.println("Nome do Banco: "+nomeBanco);
		System.out.println("Tipo do Banco: "+tipoBanco);
		System.out.println("Lista de atributos: "+listaAtributos);
	}
}
