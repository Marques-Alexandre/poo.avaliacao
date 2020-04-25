package poo.avaliacao;

import java.util.LinkedList;

public class Diretor extends Pessoa {
	private LinkedList<Filme> filmes = new LinkedList<Filme>();
	
	public Diretor(String nome, String dataNascimento) {
		super(nome, dataNascimento);
	}

	public LinkedList<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(LinkedList<Filme> filmes) {
		this.filmes = filmes;
	}
	public void imprimir() {
		System.out.println("Diretor: " + getNome() );
		System.out.println("Data de Nascimento: " + getDataNascimento());
	}
	
}
