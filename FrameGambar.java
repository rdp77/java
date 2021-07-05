import java.awt.*;
import java.awt.event.*;

public class FrameGambar extends Frame{
	int red, green, blue;
	public FrameGambar(){
		Panel p=new Panel();
		Scrollbar sbRed=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		Scrollbar sbGreen=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		Scrollbar sbBlue=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);

		sbRed.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent ae){
				red=ae.getValue();
				Color c=new Color(red, green, blue);
				FrameGambar.this.setBackground(c);
			}
		});

		sbGreen.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent ae){
				green=ae.getValue();
				Color c=new Color(red, green, blue);
				FrameGambar.this.setBackground(c);
			}
		});


	sbBlue.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent ae){
				blue=ae.getValue();
				Color c=new Color(red, green, blue);
				FrameGambar.this.setBackground(c);
			
			}
		});



		p.add(sbRed);
		p.add(sbGreen);
		p.add(sbBlue);

		add(p,BorderLayout.SOUTH);

		setSize(500,400);
		setVisible(true);

	}
	public void paint(Graphics g){
		g.setColor(Color.GREEN);
		g.fillArc(50,50,100,100,0,45);
		g.setColor(Color.YELLOW);
		g.fillArc(50,50,100,100,45,15);
		
	}
	

	public static void main(String[] args){
		new FrameGambar();
	}
}