package padroesdeProjeto;
import java.util.Scanner;

public class Main {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		PrototipoAprensentacao  apresentacaoP = new PrototipoApresentacaoPitch().clonar();
		PrototipoAprensentacao  apresentacaoE = new PrototipoApresentacaoExecutiva().clonar();
		
		System.out.println("Apresentação Pitch\n"+apresentacaoP.ToString());
		System.out.println("\nApresentação Executiva\n"+apresentacaoE.ToString());
		
		
		System.out.println("\nDeseja Mudar as configurações do template ?\n");
		System.out.println("01 - TempletadePitch\n02 - Executivo");
		var escolha = ler.nextInt();
		
		if(escolha == 1) {
			System.out.println("Digite os valor para a duração do slide:");
			var duracaoPitch = ler.nextInt();
			System.out.println("Digite a quantidade  dos slides:");
			var quantidadePitch = ler.nextInt();
			
			apresentacaoP.setDuracao(duracaoPitch);
			apresentacaoP.setQuantidadeSlide(quantidadePitch);
			
			System.out.println("\nNova config:");
			
			System.out.println("Apresentação Pitch\n"+apresentacaoP.ToString());
			System.out.println("Apresentação Executiva\n"+apresentacaoE.ToString());
		}
		
		if(escolha == 2) {
			System.out.println("Digite os valor para a duração do slide:");
			var duracaoExecutivo = ler.nextInt();
			System.out.println("Digite a quantidade  dos slides:");
			var quantidadeExecutivo = ler.nextInt();
			
			apresentacaoE.setDuracao(duracaoExecutivo );
			apresentacaoE.setQuantidadeSlide(quantidadeExecutivo);
			
			System.out.println("\nNova config:");
			
			System.out.println("Apresentação Executiva\n"+apresentacaoE.ToString());
		}
	}

}
