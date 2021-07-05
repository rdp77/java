import java.awt.*;
class PolyLines extends Frame{
	int x1[]={50,75,95,115,135};
	int y1[]={150,130,160,175,160};
	int x2[]={67,82,95,120,135};
	int y2[]={300,280,310,305,325};
	
	public PolyLines(){
		super("Poly Lines");
		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics g){
		g.drawPolyline(x1,y1,5);
		g.setFont(new Font("Times Roman",Font.BOLD,15));
		g.drawString("Current Color is black",100,100);
		g.setColor(Color.blue);
		g.drawPolyline(x2,y2,4);
		g.drawString("Current Color is blue",100,250);
	}
	
	public static void main(String args[]){
		new PolyLines();
	}
}