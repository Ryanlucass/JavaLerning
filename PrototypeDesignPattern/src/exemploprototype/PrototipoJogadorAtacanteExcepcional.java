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
public class PrototipoJogadorAtacante extends PrototipoJogador{    
    
    @Override
    public PrototipoJogador clonar() {
        PrototipoJogador jogadorAtacante = new PrototipoJogadorAtacante();
        
        jogadorAtacante.setHabilidade(15);
        jogadorAtacante.setVelocidade(10);
        jogadorAtacante.setForca(5);
        
        return jogadorAtacante;
    }
    
}
