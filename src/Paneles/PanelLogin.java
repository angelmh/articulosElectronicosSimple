package Paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class PanelLogin extends  PanelMenu {
    public PanelLogin(){
       this.setSize(500,300);
    }
     
@Override
   public void paintComponent(Graphics g){
         Dimension dim=getSize();
         ImageIcon imagenFondo= new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"));
         g.drawImage(imagenFondo.getImage(), 0, 0,dim.width, dim.height,null);
         setOpaque(false);
    }
   
}