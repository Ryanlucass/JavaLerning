package padroesdeProjeto;

public class PrototipoApresentacaoPitch extends PrototipoAprensentacao{

	@Override
	public PrototipoAprensentacao clonar() {
		// TODO Auto-generated method stub
		PrototipoAprensentacao apresentacaoPich = new PrototipoApresentacaoPitch();
		
		apresentacaoPich.setDuracao(5);
		apresentacaoPich.setQuantidadeSlide(5);
		
		return apresentacaoPich;
	}

}
