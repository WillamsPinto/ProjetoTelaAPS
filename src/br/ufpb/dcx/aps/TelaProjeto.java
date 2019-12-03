package br.ufpb.dcx.aps;

public class TelaProjeto {
	private FabricaAbstrata fabrica;
	private Janela janela;
	private Menu menu;
	private Botao botao;
	
	public TelaProjeto() {}
	
	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;
	}
	
	public void montar() {
		this.janela = this.fabrica.criarJanela();
		this.menu = this.fabrica.criarMenu();
		this.botao = this.fabrica.criarBotao();
	}
	
	public String desenhar() {
		return janela.desenhar()+"{"+menu.desenhar()+","+botao.desenhar()+"}";
	}
	
}