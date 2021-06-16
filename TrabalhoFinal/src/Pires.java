
public class Pires extends Utensilio{
	
	private String nome = "Pires";
	private int estabilidade = 7;
	private double valor = 25;
	
	
	
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
		return "Pires";
	}

}
