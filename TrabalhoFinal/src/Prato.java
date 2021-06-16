
public class Prato extends Utensilio{
	
	private String nome = "Prato";
	private int estabilidade = 2;
	private double valor = 10;
	
	

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
		return "Prato";
	}

}
