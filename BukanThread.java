class BukanThread
 {
 	private String Tulisan;
 	
 	BukanThread(String Str)
 	{
 		Tulisan=new String(Str);
 	}
 
 	public void run()
 	{
       for (int I = 1; I <= 10; I++)
       {
          System.out.println(Tulisan+" ");
       }
    }
    
    public static void main(String Args[])
    {
    	BukanThread T1 = new BukanThread("Pemrograman");
    	T1.run();
    	BukanThread T2 = new BukanThread("Lanjut");
    	T2.run();
    }
}