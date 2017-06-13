package Paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class PanelMenu extends  javax.swing.JPanel {
    public PanelMenu(){
       this.setSize(1366,700);
    }
     
    public void paintComponent(Graphics g){
         Dimension dim=getSize();
         ImageIcon imagenFondo= new ImageIcon(getClass().getResource("/Imagenes/fondoMenu.png"));
         g.drawImage(imagenFondo.getImage(), 0, 0,dim.width, dim.height,null);
         setOpaque(false);
         super.paintComponent(g);
    }
    
}
