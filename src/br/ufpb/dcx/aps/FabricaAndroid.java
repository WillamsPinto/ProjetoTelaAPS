package br.ufpb.dcx.aps;

public class FabricaAndroid implements FabricaAbstrata {

	public FabricaAndroid() {}

	public Janela criarJanela() {
		return new JanelaAndroid();
	}

	public Menu criarMenu() {
		return new MenuAndroid();
	}

	public Botao criarBotao() {
		return new BotaoAndroid();
	}
}
