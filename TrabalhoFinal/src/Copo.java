
public class Copo extends Utensilio{
	
	private String nome = "Copo";
	private int estabilidade = 5;
	private double valor = 15;
	
	
	//Acessores
	public String getNome() {
		return nome;
	}
	public int getEstabilidade() {
		return estabilidade;
	}
	public double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Copo";
	}

}
