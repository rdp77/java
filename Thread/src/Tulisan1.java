import javax.swing.*;
import java.awt.*;
class Tulisan1 extends Thread
{
	private JLabel Tulisan;
	private JFrame Frm;
	private int X=0;
	private int LebarTulisan,LebarFrame=500;
	private boolean Kanan=true;
	Tulisan1(String Str)
	{
		Tulisan=new JLabel(Str);
		LebarTulisan=Tulisan.getWidth();
		Frm=new JFrame("Menjalankan Teks dengan Thread");
		Frm.setLayout(null);
		Frm.setDefaultCloseOperation(Frm.EXIT_ON_CLOSE);
		Frm.add(Tulisan);
		Tulisan.setFont(new Font("ARIAL",Font.BOLD,36));
		Tulisan.setBounds(X,100,460,50);
		Frm.setSize(800,500);
		Frm.setVisible(true);
	}
	public void run()
	{
		while(true)
		{
			LebarTulisan=Tulisan.getWidth();
			LebarFrame=Frm.getWidth();
			if(Kanan){
				if(X+LebarTulisan < LebarFrame)
				{
					//X=LebarFrame-LebarTulisan+20;
					Kanan=true;	
					X++;	
				}
				else
					Kanan=false;	
		}
			else
			{
			
				if(X > 0)
				{
					X--;
					Kanan=false;
				}
				else
					Kanan=true;
			}		
			try{
				Thread.sleep(10);
			}catch(InterruptedException ie){}
			Tulisan.setBounds(X,100,LebarTulisan,50);
		}	
	}
	public static void main(String Args[])
	{
		Tulisan1 Oby1 = new Tulisan1("PEMROGRAMAN LANJUT");
		Oby1.start();
		Tulisan1 Oby2 = new Tulisan1("PEMROGRAMAN LANJUT");
		Oby2.start();
	}
}