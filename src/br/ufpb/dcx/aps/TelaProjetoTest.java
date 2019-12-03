package br.ufpb.dcx.aps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaProjetoTest {

	@Test
	void testTelaWindows() {
		TelaProjeto tela = new TelaProjeto();
		tela.setFabrica(new FabricaWindows());
		tela.montar();
		tela.desenhar();
		
		assertEquals("JanelaWindows{MenuWindows,BotãoWindows}", tela.desenhar());
	}
	
	@Test
	void testeTelaAndroid() {
		TelaProjeto tela = new TelaProjeto();
		tela.setFabrica(new FabricaAndroid());
		tela.montar();
		tela.desenhar();
		
		assertEquals("JanelaAndroid{MenuAndroid,BotãoAndroid}", tela.desenhar());
	}

}
