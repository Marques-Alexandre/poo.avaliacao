package poo.avaliacao;

import java.util.LinkedList;

public class Musico extends Pessoa {
	private String estiloMusical;
	private LinkedList<Filme> filmes = new LinkedList<Filme>();
	
	public Musico(String nome, String dataNascimento, String estiloMusical) {
		super(nome, dataNascimento);
		this.estiloMusical = estiloMusical;
	}
	
	public String getEstiloMusical() {
		return estiloMusical;
	}
	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	public LinkedList<Filme> getFilmes() {
		return filmes;
	}
	public void setFilmes(LinkedList<Filme> filmes) {
		this.filmes = filmes;
	}
	public void imprimir() {
		System.out.println("Músico: " + getNome() );
		System.out.println("Data de Nascimento: " + getDataNascimento());
		System.out.println("Estilo Musical: " + estiloMusical);
	}


	
	
}
