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
public class PrototypeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


                
                
        
        PrototipoJogador jogador1 = new PrototipoJogadorZagueiro().clonar();
        

        
        PrototipoJogador jogador2 = new PrototipoJogadorAtacante().clonar();        
        
        PrototipoJogador jogador3 = new PrototipoJogadorAtacante().clonar();        
        
        jogador1.setHabilidade(20);

        System.out.println("jog1"+jogador1.toString());
        
        
        System.out.println("jog2"+jogador2.toString());
        
                
            
        
    }
}
