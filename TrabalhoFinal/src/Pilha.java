import java.util.LinkedList;
import java.util.Stack;

public class Pilha {
	
	//Atributos
	
	private Stack<Utensilio> pilha = new Stack<Utensilio>();
	private double estabilidade = 100;
	
	//Default
	
	public Pilha() {
		
	}
	
	//gets and Setters
	public Stack<Utensilio> getPilha() {
		return pilha;
	}
	public void setPilha(Stack<Utensilio> pilha) {
		this.pilha = pilha;
	}
	public double getEstabilidade() {
		return estabilidade;
	}
	public void setEstabilidade(double estabilidade) {
		this.estabilidade = estabilidade;
	}
	
	//Comportamentos
	
	public void adicionar(Utensilio utensilio) {
		pilha.push(utensilio);
	}
	
	public int Pontos() {
		int score = 0;
		for (int i = 0; i < pilha.size(); i++) {
			Utensilio utiltest = pilha.elementAt(i);
			switch (utiltest.toString()) 
			{
			case "Copo":
				score += 12;
				break;
			case "Prato":
				score += 7;
				break;
			case "Pires":
				score += 15;
				break;
			case "Piramide":
				score += 40;
				break;
			case "Panela":
				score += 11;
				break;			
			}
		}
		return score;
	}
	
	public void Demonstrar() {
		for (int i = 0; i < pilha.size(); i++) {
			System.out.println("| " + pilha.elementAt(i) + " |");
		}
	}

}
