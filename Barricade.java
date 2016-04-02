
package controller;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Barricade extends Vlak {
    private int BaricadeWaarde;
    private String MeldingTekst; // ?? 
    private Image imgBarricade;
    
    
    
    

    public Barricade(int x, int y) {
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("Resources/barricade.png"));
        imgBarricade = img.getImage();       
        this.setLocation(x * 48, y * 48);
        
    }
    
        @Override
    public void paintComponent(Graphics g){
        // call the paintcomponent in the super to draw their own "needed" stuf and then draw what you want yourself
        super.paintComponent(g);
        // draw the image you have loaded in the constructor on the panel
        /**
         * the first paramter is the image itself
         * the second and the third paramater are the coordinate of where the image should be drawn
         * the start coordinates 0,0 is the topleftcorner of this panel. 
         * the third and the forth parameters are the size of the image
         * the last one is magic
         */
        g.drawImage(imgBarricade, 0, 0, 48, 48, this);
    }
    
    public void verdwijn(){
    // make image disaapear
    }
    public void Melding(){
        
      JOptionPane.showMessageDialog(null, MeldingTekst, "Deze sleutel past niet op dit slot.", JOptionPane.PLAIN_MESSAGE);
    }
}