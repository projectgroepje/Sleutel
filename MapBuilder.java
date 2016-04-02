package controller;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.Scanner;
import javax.swing.ImageIcon;


public class MapBuilder {

    private Scanner m;
    private String map[] = new String[10];
    private Image normaalPanel, barricade, muur, sleutel;
    String inputLine = "";

    public MapBuilder() {
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("Resources/normaal.png"));
        normaalPanel = img.getImage();
        img = new ImageIcon(getClass().getClassLoader().getResource("Resources/barricade.png"));
        barricade = img.getImage();
        img = new ImageIcon(getClass().getClassLoader().getResource("Resources/muur.png"));
        muur = img.getImage();
        img = new ImageIcon(getClass().getClassLoader().getResource("Resources/sleutel.png"));
        sleutel = img.getImage();

        openFile();
        readFile();
        closeFile();

    }

    public Image getNormaalPanel() {
        return normaalPanel;
    }

    public Image getbarricade() {
        return barricade;
    }

    public Image getMuur() {
        return muur;
    }

    public Image getsleutel() {
        return sleutel;
    }

    public String getMap(int x, int y) {
        String index = map[y].substring(x, x + 1);
        return index;
    }

    private void openFile() {
        try {
        // m = new Scanner(new File("C://Users//Elitebook//Desktop//OO Project Per3//GameArt//map.txt"));
        ClassLoader classLoader = getClass().getClassLoader();  //These three lines read txt file from Resources.
	File file = new File(classLoader.getResource("Resources/map.txt").getFile());
        m = new Scanner(file);

                    
        } catch (Exception e) {
            System.out.println("error loading");

        }

    }

    private void readFile() {

        while (m.hasNext()) {
            for (int i = 0; i < 10; i++) {
                map[i] = m.next();
            }
        }
    }

    private void closeFile() {
        m.close();
    }

}
