package br.com.mbarbosa.aula2;

public class Aula implements Comparable<Aula> {

	private String nome;
	private int tempo;
	
	public Aula(String nome, int tempo) {
		
		this.nome = nome;
		this.tempo = tempo;
	}
	
	public String getNome() {
		return nome;
	}

	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.nome + ", Tempo: " + this.tempo + " minutos ]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.nome.compareTo(outraAula.getNome());
	}
	
}
