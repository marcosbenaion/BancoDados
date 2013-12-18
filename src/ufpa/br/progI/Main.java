package ufpa.br.progI;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BancoDados.verificarProjetos();
		BancoDadosProjeto novo = new BancoDadosProjeto();
		novo.imprimirBancoDados();
		BancoDadosClasse novo1 = new BancoDadosClasse();
		novo1.imprimirBancoDados();
		Atributo teste = new Atributo("Bla","Ble","Bli");
		BancoDadosAtributos BD = new BancoDadosAtributos();
		BD.associar(teste);
	}

}
