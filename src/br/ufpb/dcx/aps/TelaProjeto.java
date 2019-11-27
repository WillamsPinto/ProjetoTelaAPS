package br.ufpb.dcx.aps;

public class TelaProjeto {
	private FabricaAbstrata fabrica;
	
	public TelaProjeto() {}
	
	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;
	}
	
	public void montar() {}
	
	public String desenhar() {
		return null;
	}
	
}