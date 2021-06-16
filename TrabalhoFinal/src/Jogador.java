
public class Jogador {
	
	 //Atributos
	private int score = 0;
	
	private String nome;
	
	//Default
	public Jogador() {
		
	}
	
	
	
	//Gets and Setters

	public String getNome() {
		return nome;
	}
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score += score;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
