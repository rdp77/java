import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LampuJalanBtn extends Thread  implements ActionListener
{
	private JFrame Frm;
	private JButton L1,L2,L3,L4,L5,BtnStart,BtnStop,BtnExit;
	private Thread Trd;

	LampuJalanBtn()
	{
		Frm = new JFrame("Lampu Berjalan");
		Frm.setDefaultCloseOperation(Frm.EXIT_ON_CLOSE);
		Trd =new Thread();
		L1=new JButton();
		L2=new JButton();
		L3=new JButton();
		L4=new JButton();
		L5=new JButton();
		BtnStart=new JButton("Start");
		BtnStop=new JButton("Stop");
		BtnExit=new JButton("Exit");		
		Frm.add(L1);
		Frm.add(L2);
		Frm.add(L3);
		Frm.add(L4);
		Frm.add(L5);
		Frm.add(L5);
		Frm.add(BtnStart);
		Frm.add(BtnStop);
		Frm.add(BtnExit);
		Frm.setLayout(null);
		L1.setBounds(50,100,50,50);
		L2.setBounds(110,100,50,50);
		L3.setBounds(170,100,50,50);
		L4.setBounds(230,100,50,50);
		L5.setBounds(290,100,50,50);
		BtnStart.setBounds(50,200,80,40);
		BtnStop.setBounds(150,200,80,40);
		BtnExit.setBounds(250,200,80,40);
		BtnStart.addActionListener(this);
		BtnStop.addActionListener(this);
		BtnExit.addActionListener(this);
		Color p = new Color(255,255,255);
		 L1.setBackground(p);
			L2.setBackground(p);
			L3.setBackground(p);
			L4.setBackground(p);
			L5.setBackground(p);
		Frm.setSize(500,300);
		Frm.setVisible(true);
	}
	
	public  void run()
	{
		while(true)
		{
			Color c = new Color(235,249,51);
			Color p = new Color(255,255,255);
			L1.setBackground(c);
			L2.setBackground(p);
			L3.setBackground(p);
			L4.setBackground(p);
			L5.setBackground(p);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){ }

			L1.setBackground(p);
			L2.setBackground(c);
			L3.setBackground(p);
			L4.setBackground(p);
			L5.setBackground(p);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){ }			

			L1.setBackground(p);
			L2.setBackground(p);
			L3.setBackground(c);
			L4.setBackground(p);
			L5.setBackground(p);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){ }

			L1.setBackground(p);
			L2.setBackground(p);
			L3.setBackground(p);
			L4.setBackground(c);
			L5.setBackground(p);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){ }

			L1.setBackground(p);
			L2.setBackground(p);
			L3.setBackground(p);
			L4.setBackground(p);
			L5.setBackground(c);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){ }
			
		}
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==BtnStart)
		{
			this.start();
		}
		if(ae.getSource()==BtnStop)
		{
			this.stop();
		}
		if(ae.getSource()==BtnExit)
		{
			System.exit(0);
		}
				
		
	}
	public static void main(String Args[])
	{
		LampuJalanBtn Oby = new LampuJalanBtn();
		//Oby.start();
	}
	
}