package ujianj6;

/**
 *
 * @author Komputasi
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UjianJ6 extends JPanel {

    public void lingkaran(Graphics g){
        Graphics2D ling = (Graphics2D) g;
        ling.setColor(Color.red);
        ling.fillOval(0, 0, 300, 300);
    }
    public void PersegiPanjang(Graphics g){
        Graphics2D pp = (Graphics2D) g;
        pp.setColor(Color.BLACK);
        pp.fillRect(50, 100, 200, 100);
    }
    public void Persegi(Graphics g){
        Graphics2D p = (Graphics2D) g;
        p.setColor(Color.YELLOW);
        p.fillRect(60, 110, 80, 80);
    }
    public void Persegi2(Graphics g){
        Graphics2D pp = (Graphics2D) g;
        pp.setColor(Color.YELLOW);
        pp.fillRect(155, 110, 80, 80);
    }
     public void Segitiga(Graphics g){
        Graphics2D seg = (Graphics2D) g;
        seg.setColor(Color.BLACK);
        int x[] = {48,150,250};
        int y[] = {100,30,100};
        seg.fill(new Polygon(x,y,3));
    }
    public void Segitiga2(Graphics g){
        Graphics2D seg = (Graphics2D) g;
        seg.setColor(Color.RED);
        int x[] = {70,150,230};
        int y[] = {100,40,100};
        seg.fill(new Polygon(x,y,3));
    }
    public void triangle(Graphics g){
        Graphics2D tri = (Graphics2D) g;
        tri.setColor(Color.BLACK);
        int x[] = {50,150,250};
        int y[] = {200,270,200};
        tri.fill(new Polygon(x,y,3));
    }
    public void triangle2(Graphics g){
        Graphics2D tri = (Graphics2D) g;
        tri.setColor(Color.RED);
        int x[] = {70,150,230};
        int y[] = {200,250,200};
        tri.fill(new Polygon(x,y,3));
    }
    public void paintComponent(Graphics g){
        lingkaran(g);
        PersegiPanjang(g);
        Persegi(g);
        Persegi2(g);
        Segitiga(g);
        Segitiga2(g);
        triangle(g);
        triangle2(g);
    }
    
    
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        UjianJ6 ujian = new UjianJ6();
        
        jf.setVisible(true);
        jf.setBackground(Color.white);
        jf.setSize(500,500);
        jf.getContentPane().add(ujian);
    }    
}