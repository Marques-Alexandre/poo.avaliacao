package poo.avaliacao;

import java.util.LinkedList;

public class Ator extends Pessoa{
	private String nacionalidade;
	private LinkedList<Filme> filmes = new LinkedList<Filme>();
	
	public Ator(String nome, String dataNascimento, String nacionalidade) {
		super(nome, dataNascimento);
		this.nacionalidade = nacionalidade;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public LinkedList<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(LinkedList<Filme> filmes) {
		this.filmes = filmes;
	}
	public void imprimir() {
		System.out.println("Ator: " + getNome() );
		System.out.println("Data de Nascimento: " + getDataNascimento());
		System.out.println("Nacionalidade: " + nacionalidade);
	}
	
}
