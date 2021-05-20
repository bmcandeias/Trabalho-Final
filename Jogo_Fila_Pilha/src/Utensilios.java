// Rodrigo
public abstract class Utensilios {
	//Atributos
	public String nome_Utensilio;
	private int valor_Estabilidade;
	private int valor_Pontos;
	
	//Contruct - default
	
	public Utensilios() {
		
	}
	
	public Utensilios(String nome_Utensilio, int valor_Estabilidade, int valor_Pontos) {
		super();
		this.nome_Utensilio = nome_Utensilio;
		this.valor_Estabilidade = valor_Estabilidade;
		this.valor_Pontos = valor_Pontos;
	}
	
	//Gets e Setters
	
	public String getNome_Utensilio(String string) {
		return nome_Utensilio;
	}

	public int getValor_Estabilidade() {
		return valor_Estabilidade;
	}

	public int getValor_Pontos() {
		return valor_Pontos;
	}

	//Comportamentos
	


}
