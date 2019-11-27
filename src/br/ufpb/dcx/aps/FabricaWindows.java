package br.ufpb.dcx.aps;

public class FabricaWindows implements FabricaAbstrata{
	
	public FabricaWindows() {}


	public Janela criarJanela() {
		return new JanelaWindows();
	}


	public Menu criarMenu() {
		return new MenuWindows();
	}


	public Botao criarBotao() {
		return new BotaoWindows();
	}
}
