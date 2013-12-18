package ufpa.br.progI;

import java.util.ArrayList;

public class BancoDadosAtributos extends BancoDados
{
	private ArrayList< Atributo > vetorAtributos = new ArrayList< Atributo >();
	
	public void listarAtributos()
	{
		int valor = vetorAtributos.lastIndexOf(vetorAtributos);
		for(int i=0;i<valor;i++)
		{
			
		}
	}
	
	public void associar(Atributo objeto)
	{
		vetorAtributos.add(objeto);
	}
}
