 class Thread1 extends Thread
 {
 	private String Tulisan;
 	
 	Thread1(String Str)
 	{
 		Tulisan=new String(Str);
 	}
 
 	public void run()
 	{
       for (int I = 1; I <= 20; I++)
       {
          System.out.println(Tulisan+" ");
       }
    }
    
    public static void main(String Args[])
    {
    	Thread1 T1 = new Thread1("Pemrograman");
    	T1.start(); // Memulai thread
    	Thread1 T2 = new Thread1("Lanjut");
    	T2.start(); // Memulai thread	
    }
}