package controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Eindvlak extends Vlak {

    private String MeldingTekst;
    private Image imgEindvlak;
 
    // if our levels differ in size/number of tiles we must make sure to get a finalposition variable in the level class that we can send
    // to this class.
//    private Color kleur;
//    private int width;
//    private int height;
//   
//
//    public Eindvlak(Color kleur, int width, int height) {
//        this.kleur = kleur;
//        this.width = width;
//        this.height = height;
//    }
    
    public Eindvlak(int x, int y){
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("Resources/eind.jpg"));
        imgEindvlak = img.getImage();       
        this.setLocation(x * 48, y * 48);       
        
    }

//    public void eind(Graphics g, int x, int y) {
//        // g.setColor(Color.GREEN);
//        //g.fillRect(435, 435, 45, 45);
//
//        g.setColor(kleur);
//        g.fillRect(x, y, width, height);

   // }
    
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
        g.drawImage(imgEindvlak, 0, 0, 48, 48, this);
    }

    public void Melding() {
        JOptionPane.showMessageDialog(null, MeldingTekst, "Gefeliciteerd, je hebt gewonnen!", JOptionPane.PLAIN_MESSAGE);
        
    }

 
}
