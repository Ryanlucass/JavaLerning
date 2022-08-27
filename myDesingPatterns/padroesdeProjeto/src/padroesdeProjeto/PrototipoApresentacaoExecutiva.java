package padroesdeProjeto;

public class PrototipoApresentacaoExecutiva extends PrototipoAprensentacao{

	@Override
	public PrototipoAprensentacao clonar() {
		PrototipoAprensentacao apresentacaoExecutiva = new PrototipoApresentacaoExecutiva();
		
		apresentacaoExecutiva.setDuracao(15);
		apresentacaoExecutiva.setQuantidadeSlide(15);
		
		return apresentacaoExecutiva;
	}

}
