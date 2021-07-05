package animasij5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animasi extends JPanel implements Runnable{
    
    static JFrame jf;
    int x = 0;
    int y = 0;
    String status = "turun";
            
    public void circle(Graphics g){
        Graphics2D cr = (Graphics2D) g;
        cr.setColor(Color.orange);
        cr.fillOval(x, 0, 100, 100);
    }
    
    public void triangle(Graphics g){
        Graphics2D tri = (Graphics2D) g;
        int x[] = {0, 125, 250};
        int y[] = {100, 0, 100};
        tri.setColor(Color.green);
        tri.fill(new Polygon(x, y, 3));
        
    }
    
    public void rectangle(Graphics g){
        Graphics2D rec = (Graphics2D) g;
        rec.setColor(Color.blue);
        rec.fillRect(0, 100, 250, 250);
    }
    
     public void rectangle2(Graphics g){
        Graphics2D rec = (Graphics2D) g;
        rec.setColor(Color.white);
        rec.fillRect(75, 250, 70, 100);
    }
   
   
    public void paintComponent(Graphics g){
        circle(g);
        triangle(g);
        rectangle(g);
        rectangle2(g);
    }
    
    public static void main(String[] args) {
        jf = new JFrame();
        Animasi anim = new Animasi();
        Thread th = new Thread(anim);
        
        jf.setBackground(Color.black);
        jf.setSize(500, 500);
        jf.getContentPane().add(anim);
        jf.setVisible(true);
        th.start();
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Animasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(x<=0) status="turun";
            if(x>=400) status="naik";
                    
            if(status.equals("turun")) x+=2;
            if(status.equals("naik")) x-=2;
            
            
            //y++;
            jf.repaint();
        }
    }
    
}
