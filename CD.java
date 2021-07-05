import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

class CD extends JFrame 
{
	private JTextField JTDetik,JTMenit;
	private int Menit=5,Detik=60;
	private Timer Waktu;
	CD()
	{
		setSize(500,300);
		setTitle("Contoh CountDown Timer");
		JTDetik = new JTextField();
		JTMenit = new JTextField();
		Waktu = new Timer();
		setLayout(null);
		
		add(JTMenit);add(JTDetik);
		
		JTMenit.setBounds(200,100,60,50);
		JTDetik.setBounds(270,100,60,50);
		JTMenit.setFont(new Font("ARIAL",Font.BOLD,48));
		JTDetik.setFont(new Font("ARIAL",Font.BOLD,48));
		if(Menit < 10)
			JTMenit.setText('0'+String.valueOf(Menit));
		else
			JTMenit.setText(String.valueOf(Menit));	
		if(Detik < 10)
			JTDetik.setText('0'+String.valueOf(Detik));
        else 
			JTDetik.setText(String.valueOf(Detik));
		
		Waktu.schedule(new JarumDetik(),0,1000);
 		setVisible(true);
	}
	
	class JarumDetik extends TimerTask
	{
		public void run()
		{
			Detik--;
			if(Detik < 0)
			{
				Detik=60;
				Menit--;
			}
			if(Menit < 10)
				JTMenit.setText('0'+String.valueOf(Menit));
			else
				JTMenit.setText(String.valueOf(Menit));	
			if(Detik < 10)
				JTDetik.setText('0'+String.valueOf(Detik));
        	else 
				JTDetik.setText(String.valueOf(Detik));
		
			
		}
	}
	
	public static void main(String Args[])
	{
		CD Oby = new CD();

	}
}