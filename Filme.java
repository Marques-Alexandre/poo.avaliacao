package poo.avaliacao;

import java.util.LinkedList;

public class Filme {
	private String titulo;
	private int ano;
	private Diretor diretor;
	private LinkedList<Ator> atores = new LinkedList<Ator>();
	private LinkedList<Musico> musicos = new LinkedList<Musico>();
	
	public Filme(String titulo, int ano) {
		this.titulo = titulo;
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	public LinkedList<Ator> getAtores() {
		return atores;
	}
	public void setAtores(LinkedList<Ator> atores) {
		this.atores = atores;
	}
	public LinkedList<Musico> getMusicos() {
		return musicos;
	}
	public void setMusicos(LinkedList<Musico> musicos) {
		this.musicos = musicos;
	}
	public void imprimir() {
		System.out.println("Titulo do filme: " + titulo);
		System.out.println("Ano do filme: " + ano);
	}
	
	
}
