// Rodrigo
public class Utensilios {
	//Atributos
	public  Sets sets;
	
	//Contruct - default
	
	public Utensilios() {
		
	}
	
	public Utensilios(Sets sets) {
		super();
		this.sets = sets;
	}
	
	//Gets e Setters

	public Sets getSets() {
		return sets;
	}

	//Comportamentos
	
	//ToString
	@Override
	public String toString() {
		return this.sets.toString();
	}
	

}
