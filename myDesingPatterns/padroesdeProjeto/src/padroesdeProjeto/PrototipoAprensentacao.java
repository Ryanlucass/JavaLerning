package padroesdeProjeto;

public abstract class PrototipoAprensentacao {

	private int duracao;
	private int quantidadeSlide;
	
	
	public abstract PrototipoAprensentacao clonar();
	
	public int getDuracao() {
		return duracao;
	}
	
	public int setDuracao(int duracao) {
		return this.duracao = duracao;
	}
	
	public int getQuantidadeSlide() {
		return quantidadeSlide;
	}
	
	public int setQuantidadeSlide(int quantiade) {
		return quantidadeSlide = quantiade;
	}
	
	public String ToString() {
		return "Duração: " + duracao +" minutos"+ "\nQuantidade do slide: " + quantidadeSlide +" slides";
	}
}
