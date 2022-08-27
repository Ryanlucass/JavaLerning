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
public class PrototipoJogadorZagueiro extends PrototipoJogador {

    @Override
    public PrototipoJogador clonar() {
        
        
        PrototipoJogador jogadorZagueiro = new PrototipoJogadorZagueiro();
        
        jogadorZagueiro.setVelocidade(5);
        jogadorZagueiro.setHabilidade(5);
        jogadorZagueiro.setForca(10);
        
        return jogadorZagueiro;
    }
    
}
