import java.util.*;

public class TestaSingleton {

	public static void main(String args[]) {
		
               Heroi h1;
                
		h1 = Heroi.criaInstancia("Sonic", 50);

		h1.setForca(100);


		System.out.println("Heroi: "+ h1.getNome());
               
                
                System.out.println("Heroi: "+ h1.getForca());
		
        	
		
		
	}
}