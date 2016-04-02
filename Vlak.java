package controller;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Fleur
 * extend from panel
 * so you can add the vlakjes inside the gameframe
 * and give the vlakjes sizes or images or locations and that kind of stuff
 */
public class Vlak extends JPanel{
    
    //private int pixelAmount = 64;   
    private int pixelAmount = 48;          //we can use either 32 pixel image squeares(standard) or aestatically pleasing 64 pixels. 
    private MovableGameObject[] movableObjects; // there can be 0..1 spelers on vlak. if player moves to a vlak, world calls setSpeler
    
    private Vlak[] buren;
    
    private Image imgNormaalVlak;
    
    public Vlak(){
        buren = new Vlak[4];
        movableObjects = new MovableGameObject[2];
        // set the size of this panel (and basically all the other panels because they all extends from this class)
        // to 48 by 48. the default size of the panels are 0 by 0, if we dont change it, you wont see the panels inside the frame
        this.setSize(pixelAmount, pixelAmount);
    }
    
    public void makeNormaalVlak(int x, int y){
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("Resources/normaal.png"));
        imgNormaalVlak = img.getImage();
        
        this.setLocation(x * 48, y * 48);
    }
    
    public void setBovenBuur(Vlak bovenBuur)
    {
        this.buren[0] = bovenBuur;
    }
    
    public void setLinkerBuur(Vlak linkerBuur)
    {
        this.buren[1] = linkerBuur;
    }
    
    public void setOnderBuur(Vlak onderBuur)
    {
        this.buren[2] = onderBuur;
    }
    
    public void setRechterBuur(Vlak rechterBuur)
    {
        this.buren[3] = rechterBuur;
    }
    
    public void setSpeler(Speler player) {
        this.movableObjects[1] = player;//There is a key on the tile.
    }
    
    public void setSleutel(Sleutel sleutel)
    {
        this.movableObjects[0] = sleutel;
    }
    
    public Sleutel getSleutel()
    {
        Sleutel returnSleutel =(Sleutel) this.movableObjects[0];    //make temporary variable to be returned.
        this.movableObjects[0] = null; //Sets the current key to be null.
        return returnSleutel;//returns the key value to the player.
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
        g.drawImage(imgNormaalVlak, 0, 0, 48, 48, this);
    }
}