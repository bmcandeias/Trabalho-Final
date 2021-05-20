//Henrique
public class Jogador {
	
	//Atributos
	
	private String nome;
	private int score;
	
	//Contruct - default	
	
	public Jogador() {
		
	}
	
	public Jogador(String nome, int score) {
		super();
		this.nome = nome;
		this.score = score;
	}



	//Gets e Setters
	
	public String getNome() {
		return nome;
	}
	public int getScore() {
		return score;
	}  
	
	//Comportamentos

}
