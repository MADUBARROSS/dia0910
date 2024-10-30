package atividade0910;

public class Casa {

	private String nome;
	private int altura;
	private int largura;
	private String telhado;
	private int numeroJanelas;

	public Casa (String nome, int altura, int largura, String telhado, int numeroJanelas) {
		this.nome = nome;
		this.altura = altura;
		this. largura = largura;
		this.telhado = telhado;
		this. numeroJanelas = numeroJanelas;
	}
	public String getNome () {
		return nome;
	}

	public void setNome (String nome) {
		this.nome = nome;
	}

	public int getAltura () {
		return altura;
	}

	public void setAltura (int altura) {
		this.altura = altura;
	}

	public int getLargura () {
		return largura;
	}

	public void setLargura (int largura) {
		this. largura = largura;
	}

	public String getTelhado () {
		return telhado;
	}

	public void setTelhado (String telhado) {
		this.telhado = telhado;
	}


	public int getNumeroJanelas () {
		return numeroJanelas;
	}

	public void setNumeroJanelas (int numeroJanelas) {
		this. numeroJanelas = numeroJanelas;

	}
}
