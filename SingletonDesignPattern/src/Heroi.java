import java.util.*;

//Heroi � um Singleton

public class Heroi {
	
    
        private static Heroi heroi = null; 
        
        
	private String nome;
	
        
        private int forca;
	
	
		
	/*
	 *N�o existe construtor p�blico num Singleton
	 */
	private Heroi() {}    //  Inibe o construtor padr�o
	
	private Heroi(String nome, int forca) {
		this.nome = nome;
		this.forca = forca;
	}
        
        
	
	public static Heroi criaInstancia() {
		if (heroi == null) {
			heroi = new Heroi(); 
		} 
		return heroi; 
	} 

	public static Heroi criaInstancia(String nome, int forca) {
		if (heroi == null) {
			heroi = new Heroi(nome, forca); 
		} 
		return heroi; 
	} 
	
        
        
        
        
        
        
        
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setForca(int forca) {
		this.forca = forca;
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getForca() {
		return this.forca;
	}

	
	public String toString() {
		return "Nome: " + nome + " Forca: "+ forca;
	}
}






