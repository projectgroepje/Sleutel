package controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class Speler extends MovableGameObject implements ActionListener, KeyListener {

    private Image imgspeler;

    private Sleutel sleutel; // can hold key.

    private Vlak currentVlak;
    private int tileX, tileY;   //not sure if currentVlak give both tiles

    public Speler() {
        ImageIcon img = new ImageIcon("/Users/AnnMarie/Desktop/project/speler.png");
        imgspeler = img.getImage();

        tileX = 0;
        tileY = 0;
    }

    public void keyReleased0(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_P) {
            //Get the current key from the Vlak the player is on. Remember to check for nulls
        } else {
            move(e);
        }
    }

    public void pickUpSleutel(Sleutel newSleutel) {
        this.sleutel = newSleutel;

    }

    public Image getPlayerImage() {
        return imgspeler;
    }

    public void move(KeyEvent moveDirection) {

        if (moveDirection.getKeyCode() == KeyEvent.VK_LEFT) {
            //Get the neighbouring Vlak in the direction given, move there, repaint this vlak and repaint the new CurrentVlak.
        } else if (moveDirection.getKeyCode() == KeyEvent.VK_RIGHT) {

        } else if (moveDirection.getKeyCode() == KeyEvent.VK_UP) {

        } else if (moveDirection.getKeyCode() == KeyEvent.VK_DOWN) {

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.move(e);

        /*speler moet vlak kennen, vlak moet weten of er sleutel of speler op hem staat . sleutel en speler erven van vlakonderdeel. speler gaat van vlak af, speler zegt tegen vlak repaint jezelf, */
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTileX() {
        return tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void checkSpelerEind() {

        if (getTileX() == 9 && getTileY() == 9) {
            JOptionPane j = new JOptionPane();
            j.showMessageDialog(null, "Gefeliciteerd, je hebt gewonnen!", "resultaat", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

    }

}
