/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploprototype;

import java.awt.Color;

/**
 *
 * @author vncserver
 */
public abstract class PrototipoJogador {
    
    private String nome;
    private int idade;
    private int habilidade;
    private int velocidade;
    private int forca;
    
    public abstract PrototipoJogador clonar();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the habilidade
     */
    public int getHabilidade() {
        return habilidade;
    }

    /**
     * @param habilidade the habilidade to set
     */
    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the forca
     */
    public int getForca() {
        return forca;
    }

    /**
     * @param forca the forca to set
     */
    public void setForca(int forca) {
        this.forca = forca;
    }
    
    public String toString(){
        return " " +idade + habilidade + " "+ velocidade + " "+forca;
    }

       
}
