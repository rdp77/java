import java.awt.*;
import java.awt.event.*;
class FillRect extends Frame {

	
	public FillRect(){
		super("Fill3DRect");
		setLayout(new FlowLayout()); 
		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics g){
	    g.setColor(Color.BLUE);
		g.fillRect(100,100,50,200);
	
	}
	

	public static void main(String args[]){
		new FillRect();
	
	}
}