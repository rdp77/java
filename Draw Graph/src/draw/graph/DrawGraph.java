/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw.graph;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author RDP77
 */
public class DrawGraph extends JFrame{

    /**
     * @param args the command line arguments
     */
    public DrawGraph(){
        super("Draw");
        setSize(400, 400);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(50, 150, 50, 200);
        
        g.setColor(Color.orange);
        g.fillRect(110, 100, 50, 250);
        
        g.setColor(Color.yellow);
        g.fillRect(170, 50, 50, 300);
        
        g.setColor(Color.green);
        g.fillRect(230, 100, 50, 250);
        
        g.setColor(Color.BLUE);
        g.fillRect(290, 150, 50, 200);
       
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        DrawGraph frame = new DrawGraph();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
