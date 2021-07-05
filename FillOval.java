import java.awt.*;
class FillOval extends Frame{

	public FillOval(){
		super("FillOval");
		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics g){
	    g.setColor(Color.blue);
		g.fillOval(50,50,100,100);
		g.setColor(Color.CYAN);
		g.drawOval(50,200,200,100);
	}
	
	public static void main(String args[]){
		new FillOval();
	}
}