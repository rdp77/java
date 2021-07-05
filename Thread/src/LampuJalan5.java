import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LampuJalan5 extends Thread  implements ActionListener
{
	private JFrame Frm;
	private JButton L1,L2,L3,BtnStart,BtnStop,BtnExit;
	private Thread Trd;
                    private Color moff,mon,coff,con,hoff,hon;

	LampuJalan5()
	{
		Frm = new JFrame("Lampu Berjalan");
		Frm.setDefaultCloseOperation(Frm.EXIT_ON_CLOSE);
		Trd =new Thread();
		L1=new JButton();
		L2=new JButton();
		L3=new JButton();
		BtnStart=new JButton("Start");
		BtnStop=new JButton("Stop");
		BtnExit=new JButton("Exit");		
		Frm.add(L1);
		Frm.add(L2);
		Frm.add(L3);
		Frm.add(BtnStart);
		Frm.add(BtnStop);
		Frm.add(BtnExit);
		Frm.setLayout(null);
		L1.setBounds(50,100,50,50);
		L2.setBounds(110,100,50,50);
		L3.setBounds(170,100,50,50);
		BtnStart.setBounds(50,200,80,40);
		BtnStop.setBounds(150,200,80,40);
		BtnExit.setBounds(250,200,80,40);
		BtnStart.addActionListener(this);
		BtnStop.addActionListener(this);
		BtnExit.addActionListener(this);
		
                                        moff = new Color(207,140,127);
                                        mon = new Color (254,158,148);
		  coff = new Color(199,196,135);
                                        con = new Color (247,251,83);
	 	  hoff = new Color(143,195,139);
                                        hon = new Color (118,252,82);

		 L1.setBackground(mon);
                                       L2.setBackground(coff);
		L3.setBackground(hoff);
		Frm.setSize(500,300);
		Frm.setVisible(true);
	}
	
	public  void run()
	{
		while(true)
		{
			
                                                          L1.setBackground(mon);
			L2.setBackground(coff);
			L3.setBackground(hoff);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){ }

			L1.setBackground(moff);
			L2.setBackground(con);
			L3.setBackground(hoff);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){ }			

			L1.setBackground(moff);
			L2.setBackground(coff);
			L3.setBackground(hon);
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
		LampuJalan5 Oby = new LampuJalan5();
 		//Oby.start();
	}
	
}