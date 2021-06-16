import javax.swing.JOptionPane;

public class Jogo {
	
	//Atributos
	/**
	 * O jogo é a Class que tem todas operações de outras classes para fazer a criação do jogo.
	 * O jogo no final é chamado para a main onde vai chamar as operações.
	 * 
	 * @author Bruno Candeias
	 * @author Henrique
	 * @author Rodrigo
	 */
	private Fila fila = new Fila();
	private Pilha pilha = new Pilha();
	private Jogador jogador = new Jogador();
	//private Tempo tempo = new Tempo();
	//Acessores

	//Contructor - default
	/**
	 * Default Controlador
	 * 
	 * É o controlador default desta class jogo
	 */
	public Jogo(){
		
	}
	/**
	 * DemonstrarPilha
	 * 
	 * É o método que demonstra e cria o visual da pilha
	 */
	public void DemonstrarPilha() {
		System.out.println("  Pilha");
		System.out.println("_________");
		pilha.Demonstrar();
	}
	
	/**
	 * Estabilidade
	 * 
	 * A estabilidade é o método que atribui valores aos objectos dentro da pilha.
	 * 
	 * @param i
	 */
	public void Estabilidade(int i) {
		Utensilio util = fila.getFila().elementAt(i);
		switch (util.toString()) 
		{
		case "Copo":
			pilha.setEstabilidade(pilha.getEstabilidade()-12);
			break;
		case "Prato":
			pilha.setEstabilidade(pilha.getEstabilidade()-7);
			break;
		case "Pires":
			pilha.setEstabilidade(pilha.getEstabilidade()-15);
			break;
		case "Piramide":
			pilha.setEstabilidade(pilha.getEstabilidade()-40);
			break;
		case "Panela":
			pilha.setEstabilidade(pilha.getEstabilidade()-11);
			break;		
		}
	}
	
	//Comportamentos
	
	/**
	 * Demonstrar
	 * 
	 *  O demonstrar é um método que demonstra estabilidade.
	 */
	public void Demonstrar() {
		System.out.println(fila);
		System.out.println("");
		System.out.println("");
		showEstabilidade();
	}

	/**
	 * PreecherFila
	 * 
	 * O metodo preecherfila faz load dos utensilios para dentro da fila.
	 */
	public void PreecherFila() {
		for (int i = 0; i < 3; i++) {
			fila.adicionarFila();
		}
	}
	
	/**
	 * RemoverFila
	 * 
	 * O método removerfila remove tudo na fila.
	 */
	public void RemoverFila() {
		fila.remove();
	}
	/**
	 * showEstabilidade
	 * 
	 * Demonstra estabilidade da pilha no momento.
	 */
	public void showEstabilidade() {
		System.out.println(pilha.getEstabilidade());
	}
	
	/**
	 * Nome
	 * 
	 * Atribui um nome de um jogador.
	 */
	public void Nome() {
		jogador.setNome(JOptionPane.showInputDialog("Coloque o Nome do Jogador"));
	}
	
	/**
	 * Selecionar
	 * 
	 * O método selecionar demonstra a fila e diz ao jogador para escolher um dos 3 utensilios.
	 */
	public void Selecionar(){
		int i = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que quere adicionar"));
		switch (i) {
		case 1:
			pilha.adicionar(fila.getFila().elementAt(0));
			Estabilidade(0);
			RemoverFila();
			break;
		case 2:
			pilha.adicionar(fila.getFila().elementAt(1));
			Estabilidade(1);
			RemoverFila();
			break;
		case 3:
			pilha.adicionar(fila.getFila().elementAt(2));
			Estabilidade(2);
			RemoverFila();
			break;
		default:
			System.out.println("Escolha de Novo");
			RemoverFila();
			break;
		}
	}
	
	/**
	 * Pontos
	 * 
	 * Demonstra os pontos do jogador
	 */
	public void Pontos() {
		jogador.setScore(pilha.Pontos());
		System.out.println(jogador.getNome() + " = " + jogador.getScore());
	}
	
	/**
	 * StartJogo
	 * 
	 * Começa um novo jogo até o jogo Acabar.
	 */
	public void StartJogo() {
		Nome();
		do {
				PreecherFila();
				Demonstrar();
				Selecionar();
				DemonstrarPilha();
		}while(pilha.getEstabilidade() > 0);
		System.out.println("Jogo Acabou");
		Pontos();
	}
	

	//Metodos Complementares
	
	/**
	 * String
	 * 
	 * Decifra e demonstra os dados em texto dento das arrays
	 * 
	 * @return Nomes das variaveis dentro do jogo
	 */
	@Override
	public String toString() {
		return "Jogo [fila=" + fila + ", pilha=" + pilha + ", jogador=" + jogador + "]";
	}

}
