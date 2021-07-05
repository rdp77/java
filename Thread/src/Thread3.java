 class Thread3 implements Runnable
 {
 	private String Tulisan;
 	private Thread T;
 	
 	Thread3(String Str)
 	{
 		Tulisan=new String(Str);
 		T=new Thread(this);
 		T.start();
 	}
 
 	public void run()
 	{
       for (int I = 0; I <= 10; I++)
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
    	Thread3 T1 = new Thread3("Pemrograman");
  		Thread3 T2 = new Thread3("Lanjut");
    }
}