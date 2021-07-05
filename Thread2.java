 class Thread2 extends Thread
 {
 	private String Tulisan;
 	
 	Thread2(String Str)
 	{
 		Tulisan=new String(Str);
 	}
 
 	public void run()
 	{
       for (int I = 1; I <= 10; I++)
       {
          System.out.println(Tulisan);
          try
          {
          	Thread.sleep(1000);
          }catch(InterruptedException ie){}
       		
       }
    }
    
    public static void main(String Args[])
    {
    	Thread2 T1 = new Thread2("Pemrograman");
    	T1.start();  // Memulai thread
    	Thread2 T2 = new Thread2("Lanjut");
    	T2.start();  // Memulai thread
    }
}