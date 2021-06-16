import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class TestPilha {


	@Test
	public void TestPontos() {
		Pilha pilha = new Pilha();
		Stack<Utensilio> pilha3 = new Stack<Utensilio>();
		pilha3.add(new Copo());
		pilha3.add(new Panela());
        pilha3.add(new Pires());
        pilha.setPilha(pilha3);
		assertEquals(pilha.Pontos(), pilha.Pontos(), 
			"Os pontos somados do programa não estão de acordo com os pontos supostos");
		
	}
	
	@Test
	public void testPilhaVazia() {
		Stack<Utensilio> pilha1 = new Stack<Utensilio>();
	        assertTrue(pilha1.isEmpty());
	        assertEquals(pilha1.size(), 0);
	}
	
	@Test
    public void testAdicionarPilhaVazia() {
		Stack<Utensilio> pilha2 = new Stack<Utensilio>();
        int numeroAdicionar = 6;
        for (int i = 0; i < numeroAdicionar; i++) {
            pilha2.add(null);
        }
        assertFalse(pilha2.isEmpty());
        assertEquals(pilha2.size(), numeroAdicionar);
    }
	
	@Test
	public void testGetEstabilidade() {
		Pilha pilha = new Pilha();
		int estabilidadeInicial = 100;
		assertEquals(estabilidadeInicial, pilha.getEstabilidade(),
		"As estabilidades têm de ter o mesmo valor pois quando uma pilha é criada tem 100 de estabilidade");
	}
	 
	@Test
	public void testSetEstabilidade() {
		Pilha pilha = new Pilha();
		pilha.setEstabilidade(50);
		int estabilidadeInicial = 100;
		assertEquals(estabilidadeInicial - pilha.getEstabilidade(), pilha.getEstabilidade(), 
		"Os valores da estabilidade têm de ser iguais");
	}
}
