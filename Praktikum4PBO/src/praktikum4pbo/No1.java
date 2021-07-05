/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4pbo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class No1 extends JPanel{
    
    public void lingkaran(Graphics g){
        Graphics2D ling = (Graphics2D) g;
        ling.setColor(Color.white);
        ling.fillOval(315, 187, 125, 125);
    }
    
    public void segitiga(Graphics g){
        Graphics2D segi = (Graphics2D) g;
        int x[] = {100,400,400};
        int y[] = {250,150,350};
        segi.setColor(Color.black);
        segi.fill(new Polygon(x,y,3));
    }
    
    public void mata (Graphics g){
        Graphics2D mt = (Graphics2D) g;
        mt.setColor(Color.gray);
        mt.fillOval(310, 187, 15, 15);
    }
    
    public void taring (Graphics g){
        Graphics2D tar = (Graphics2D) g;
        int x[] = {355,370,372};
        int y[] = {180,208,185};
        tar.setColor(Color.black);
        tar.fill(new Polygon(x, y, 3));
    }
    
    @Override
    public void paintComponent(Graphics g){
        segitiga(g);
        lingkaran(g);
        mata(g);
        taring(g);
    }
    
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        No1 gr = new No1();
        
        jf.setBackground(Color.white);
        jf.setSize(500,500);
        jf.getContentPane().add(gr);
        jf.setVisible(true);
    }
    
}
