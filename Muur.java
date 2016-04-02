package controller;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Fleur
 */
public class Muur extends Vlak {
    private int muurwaarde;
    private Image imgMuur;

    public Muur(int x, int y) {
        // the muur should know what kind of image it is. 
        // get the image icon of a path 
        // TODO: Change the path to more generic code something getresourses or getsource somethin.
        // because now it depends on which computer you're running
        // convert the icon to image so the panel can draw the image. 
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("Resources/muur.png"));
        imgMuur = img.getImage();
        // set the location of the panel (make coordinates) so when you add this panel to the frame, the frame
        // should know where to add it. 
        this.setLocation(x * 48, y * 48);
       
    }
    
    
    public void Bounce(){
    
    }
    /**
     * paint component method is a method which all panels have to draw something on the panel.
     * never ever call the paintcomponent manually. let the framework itself call the method.
     * if you want to repaint the panel for whatever reason after its initiated , then call the repaint() method. 
     * @param g 
     */
    
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
        g.drawImage(imgMuur, 0, 0, 48, 48, this);
    }
}