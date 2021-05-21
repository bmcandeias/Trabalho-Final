import java.util.ArrayList;
import java.util.Queue;

//Tudo e Fe em Deus
public class Fila {
	//Atributos
	private ArrayList<Utensilios> fila;
	
	//Default
	
	public Fila() {
		this.fila = new ArrayList<Utensilios>();
	}
	


	//Gets and Setters
	

	
	//Comportamentos
	
	public void gerarObj() {
		//Gerar Obj Random
		for(Sets objSets : Sets.values()) {
			//Adicionar Util na fila
			this.fila.add(new Utensilios(objSets));
		}
	}
	
	//ToString
	@Override
	public String toString() {
		String listaUtensilios = "";
		int i = 0;
		for(Utensilios aobj : this.fila) {
			listaUtensilios += "\n" + i + " - " + aobj.toString();
		}
		return listaUtensilios;
	}
	
	
	
	
	
	
	
	
}
