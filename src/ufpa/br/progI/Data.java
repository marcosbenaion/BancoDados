package ufpa.br.progI;

public class Data 
{
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano)
	{
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public Data()
	{
		setDia(17);
		setMes(12);
		setAno(2013);
	}
	
	public int getDia(){return dia;}
	public int getMes(){return mes;}
	public int getAno(){return ano;}
	
	public void setDia(int dia)
	{
		if (dia >=1 && dia <=31)
			this.dia = dia;
	}
	
	public void setMes(int mes)
	{
		if (mes >= 1 && mes <= 12)
			this.mes = mes;
	}
	
	public void setAno(int ano)
	{
		if (ano >= 1990 && ano <= 2013)
			this.ano = ano;
	}
}
