/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author aluno
 */
public abstract class Personagem {
   protected JPanel pai;  // referência ao JPanel onde será desenhado o Aldeao
   
   protected boolean atacando; // indica se está atacando ou não

    public Personagem(JPanel pai,boolean atacando) {
        this.pai = pai;
        
        this.atacando = atacando;
    }
    public abstract void desenhar(Graphics g);
    public abstract void mover(int direcao);
    public abstract void atacar();
    
   
    
    
    
}
