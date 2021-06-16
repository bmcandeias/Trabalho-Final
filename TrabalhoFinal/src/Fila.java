
import java.util.Stack;

public class Fila {
	//Atributos
	private Stack<Utensilio> fila =  new Stack<Utensilio>();
	

	private Utensilio copo = new Copo();
	private Utensilio prato = new Prato();
	private Utensilio pires = new Pires();
	private Utensilio piramide = new Piramide();
	private Utensilio panela = new Panela();
	//Default
	public Fila() {

	}

	//Gets e setters
	public Stack<Utensilio> getFila() {
		return fila;
	}
	
	//Comportamentos
	public void remove() {
		fila.removeAllElements();
	}

	public void adicionarFila() {
		int r  = (int) (Math.random() * 20 + 1);
		switch (r) {
		case 1:
		case 2:
		case 3:
		case 4:
			fila.add(copo);
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			fila.add(prato);
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			fila.add(pires);
			break;
		case 13:
			fila.add(piramide);
			break;
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			fila.add(panela);
			break;
		}
	}
	
	@Override
	public String toString() {
		return "Fila =" + fila + "]";
	}
	
}
