/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4pbo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author RDP77
 */
public class No2 extends JPanel implements Runnable{
    static JFrame frame;
    int panjang = 275;
    
    public void persegi(Graphics g, Color c, int x) {
        Graphics2D p = (Graphics2D) g;
        p.setColor(c);
        p.fillRect(100, 100, x, 25);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        persegi(g, Color.DARK_GRAY, 275);
        persegi(g, Color.LIGHT_GRAY, panjang);
    }
    
    public static void main(String[] args) {
        frame = new JFrame();
        No2 graphic2 = new No2();
        Thread t = new Thread(graphic2);
        
        frame.setSize(500, 300);
        frame.setBackground(Color.WHITE);
        frame.getContentPane().add(graphic2);
        frame.setVisible(true);
        t.start();
        
    }
    
    @Override
    public void run() {
        while (true) {       
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(No2.class.getName()).log(Level.SEVERE, 
                        null, ex);
            }
            
            if (panjang == 0) {
                JOptionPane.showMessageDialog(frame, "Loading selesai");
                System.exit(0);
            } else {
                panjang--;
            }
            
            frame.repaint();
        }
    }
    
}
