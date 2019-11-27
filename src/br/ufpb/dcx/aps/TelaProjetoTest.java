package br.ufpb.dcx.aps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaProjetoTest {

	void testTelaProjeto() {
		TelaProjeto tela = new TelaProjeto();
		tela.setFabrica(new FabricaWindows());
		tela.montar();
		tela.desenhar();
		
		assertEquals("JanelaQindows{MenuWindows, BotaoWindows}", tela.desenhar());
	}
}
