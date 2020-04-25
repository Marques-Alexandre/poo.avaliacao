package poo.avaliacao;

public class Main {
	public static void main(String[] args) {
		Filme f1 = new Filme("Jurassic World", 2015);
		Ator a1 = new Ator("Chris Pratt", "21/06/1979","Estados Unidos");
		Ator a2 = new Ator("Bryce Dallas", "02/03/1981","Estados Unidos");
		Ator a3 = new Ator("Nick Robinson", "22/03/1995", "Estados Unidos");
		Ator a4 = new Ator("Irrfan Khan", "30/11/1962", "Índia");
		Ator a5 = new Ator("Brian Tee", "15/03/1977", "Japão");
		Diretor d1 = new Diretor("Colin Trevorrow", "13/09/1976");
		Musico m1 = new Musico("Michael Giacchino", "10/10/1967","Musica internacional / Trilha sonora");
		
		// Associação do Filme 01:
		f1.getAtores().add(a1);
		f1.getAtores().add(a2);
		f1.getAtores().add(a3);
		f1.getAtores().add(a4);
		f1.getAtores().add(a5);
		a1.getFilmes().add(f1);
		a2.getFilmes().add(f1);
		a3.getFilmes().add(f1);
		a4.getFilmes().add(f1);
		a5.getFilmes().add(f1);
		
		f1.setDiretor(d1);
		d1.getFilmes().add(f1);
		
		f1.getMusicos().add(m1);
		m1.getFilmes().add(f1);
		
		// Filme 02:
		Filme f2 = new Filme("Os Mercenários 3", 2014);
		Ator b1 = new Ator("Sylvester Stallone", "06/07/1946","Estados Unidos");
		Ator b2 = new Ator("Jason Statham", "26/07/1967", "Inglaterra");
		Ator b3 = new Ator("Arnold Schawarzenegger", "30/07/1947", "Áustria");
		Ator b4 = new Ator("Antonio Bandeiras", "10/08/1960","Espanha");
		Ator b5 = new Ator("Jet Li", "26/04/1960", "China");
		Diretor d2 = new Diretor("Patrick Hughes II", "30/04/1975");
		Musico m2 = new Musico("Brian Tyler", "08/05/1982", "Musica internacional / Trilha sonora");
		
		// Associação do Filme 02:
		f2.getAtores().add(b1);
		f2.getAtores().add(b2);
		f2.getAtores().add(b3);
		f2.getAtores().add(b4);
		f2.getAtores().add(b5);
		b1.getFilmes().add(f2);
		b2.getFilmes().add(f2);
		b3.getFilmes().add(f2);
		b4.getFilmes().add(f2);
		b5.getFilmes().add(f2);
		
		f2.setDiretor(d2);
		d2.getFilmes().add(f2);
		
		f2.getMusicos().add(m2);
		m2.getFilmes().add(f2);
		
		// Imprimir filme 01:
		System.out.println("=--=--=--=--=--= FILME 1 --=--=--=--=--=--=--");
		f1.imprimir();
		System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--");
		for (Ator a : f1.getAtores()) {
			a.imprimir();
			System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--");
		}
		d1.imprimir();
		System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--");
		for (Musico m : f1.getMusicos())
			m.imprimir();
		System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--");
		
		// Imprimir filme 02:
		System.out.println("=--=--=--=--=--= FILME 2 --=--=--=--=--=--=--");
		f2.imprimir();
		System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--");
		for (Ator a : f2.getAtores()) {
			a.imprimir();
			System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--");
		}
		d2.imprimir();
		System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--");
		for (Musico m : f2.getMusicos())
			m.imprimir();
		System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--");
		
		
		
	}
}
