/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segi6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Stephanus
 */
public class Segi6 extends JPanel implements Runnable{
    
    static JFrame jf;
    int x =101, y = 701;
    String status = "kiri";
    String status2 = "jalan";
    
    
    public void Rectangle1(Graphics g){
        Graphics2D sg = (Graphics2D) g;
        sg.setColor(Color.blue);
        sg.fillRect(100, 50, 100, 150);
    }
    
    public void segitiga1(Graphics g){
        Graphics2D f = (Graphics2D) g;
        int x[] = {50, 100, 100};
        int y[] = {125, 50, 200};
        f.setColor(Color.blue);
        f.fill(new Polygon(x, y, 3));
    }
    
    public void segitiga2(Graphics g){
        Graphics2D n = (Graphics2D) g;
        int x[] = {200, 250, 200};
        int y[] = {50, 125, 200};
        n.setColor(Color.blue);
        n.fill(new Polygon(x, y, 3));
    }
    
    public void Rectangle2(Graphics g){
        Graphics2D h = (Graphics2D) g;
        h.setColor(Color.blue);
        h.fillRect(700, 50, 100, 150);
    }
    
    public void segitiga3(Graphics g){
        Graphics2D k = (Graphics2D) g;
        int x[] = {650, 700, 700};
        int y[] = {125, 50, 200};
        k.setColor(Color.blue);
        k.fill(new Polygon(x, y, 3));
    }
    
    public void segitiga4(Graphics g){
        Graphics2D sg = (Graphics2D) g;
        int x[] = {800, 850, 800};
        int y[] = {50, 125, 200};
        sg.setColor(Color.blue);
        sg.fill(new Polygon(x, y, 3));
    }
    
    public void circle1(Graphics g){
        Graphics2D cl = (Graphics2D) g;
        cl.setColor(Color.yellow);
        cl.fillOval(x, 75, 100, 100);
    }
    
    public void circle2(Graphics g){
        Graphics2D cl = (Graphics2D) g;
        cl.setColor(Color.yellow);
        cl.fillOval(y, 75, 100, 100);
    }
    
    @Override
     public void paintComponent(Graphics g){
         Rectangle1(g);
         Rectangle2(g);
         segitiga1(g);
         segitiga2(g);
         segitiga3(g);
         segitiga4(g);
         circle1(g);
         circle2(g);
     }
    public static void main(String[] args) {
        // TODO code application logic here
        jf = new JFrame();
        Segi6 p = new Segi6();
        Thread th = new Thread(p);
        
        jf.setSize(950, 350);
        jf.getContentPane().add(p);
        jf.setVisible(true);
        th.start();
    }

    @Override
    public void run() {
        while (true) {            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Segi6.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(x<=101)  status = "kiri";
            if(x>=701) status = "kanan";
            
            if(status.equals("kiri")) x+=1;
            if(status.equals("kanan")) x-=1;
            
            if(y<=101)  status2 = "jalan";
            if(y>=701) status2 = "balik";
            
            if(status2.equals("jalan")) y+=1;
            if(status2.equals("balik")) y-=1;
            
            jf.repaint();
        }
    }
    
}
