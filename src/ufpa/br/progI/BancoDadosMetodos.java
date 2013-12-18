package ufpa.br.progI;

import java.util.ArrayList;

public class BancoDadosMetodos extends BancoDados implements Informavel
{
	private ArrayList< Metodo > vetorMetodos = new ArrayList< Metodo >();
	private String classeAssociada;
	private String listaMetodos;
	
	public BancoDadosMetodos()
	{
		this.nomeBanco = "Banco de Dados de Metodos (novo)";
		tipoBanco = "Banco de Dados de metodos";
		Data dataCriacao = new Data(17,12,2013);
		listaMetodos = "Nenhum método";
	}
	
	public BancoDadosMetodos(String nomeBanco,String classeAssociada,int dia,int mes, int ano)
	{
		this.nomeBanco = nomeBanco;
		tipoBanco = "Banco de Dados de metodos";
		Data dataCriacao = new Data(dia,mes,ano);
		listaMetodos = "Nenhum metodo";
		this.classeAssociada = classeAssociada;
	}
	
	public void entradaDados(String listaMetodos)
	{
		this.listaMetodos = listaMetodos;
	}
	
	public void associar(Metodo objeto)
	{
		vetorMetodos.add(objeto);
	}
	
	public void listarMetodo(Metodo objeto)
	{
		objeto.imprimeMetodo();
	}
	
	@Override
	public void imprimirBancoDados() {
		// TODO Auto-generated method stub
		System.out.println("Nome do Banco: "+nomeBanco);
		System.out.println("Tipo do Banco: "+tipoBanco);
		System.out.println("Lista de Metodos: "+listaMetodos);
	}
}
