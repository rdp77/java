/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.uts;
    import java.util.Scanner;
/**
 *
 * @author RDP77
 */
public class TugasUTS {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilihan,a,b,hasil; //Tipe data disini menggunakan int untuk inputan berupa bilangan bulat sedangkan untuk variabelnya menggunakan pilihan,a,b, dan hasil//
        char ulang; //Tipe data disini menggunakan char untuk inputan berupa karakter sedangkan variabelnya menggunakan ulang sebagai perulangan//
        ulangi: //Pernyataan pemilihan yang mempunyai label ulangi//
            do { //Pernyataan perulangan do akan dilakukan terus menerus//
        Scanner keyboard = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("# 1. Program Penjumlahan");
        System.out.println("# 2. Program Pengurangan");
        System.out.println("# 3. Program Perkalian");
        System.out.println("=====================================");
        System.out.print("Pilih Perhitungan Yang Anda Inginkan = ");//Ouput pemilihan program//
        pilihan = keyboard.nextInt();//Input dengan menggunakan variabel pilihan sebagai simbol pemilihan program//
            switch (pilihan) { //Pernyataan pemilihan switch dengan menggunakan inputan angka pada variabel pilihan//
                case 1://Pernyataan Pemilihan case jika variabel pilihan sama dengan 1 akan mengeksekusi program di bawah//
                    System.out.print("Masukkan angka pertama = ");
                    a = keyboard.nextInt();//Inputan integer pada variabel a//
                    System.out.print("Masukkan angka kedua = ");
                    b = keyboard.nextInt();//Inputan interger pada variabel b//
                    hasil=a+b; //Operator disini menggunakan tanda + untuk menjumlahkan variabel a dengan b agar menghasilkan variabel baru yaitu hasil//
                    System.out.println("Penjumlahan dari "+a+" dan "+b+" Adalah "+hasil);//Output dari variabel a,b dan hasil//
                    System.out.println("==========================================");
                    break;//Berakhirnya suatu perintah pada case//
                case 2://Pernyataan Pemilihan case jika variabel pilihan sama dengan 2 akan mengeksekusi perintah di bawah//
                    System.out.print("Masukkan angka pertama = ");
                    a = keyboard.nextInt();//Inputan integer pada variabel a//
                    System.out.print("Masukkan angka kedua = ");
                    b = keyboard.nextInt();//Inputan interger pada variabel b//
                    hasil=a-b; //Operator disini menggunakan tanda - untuk mengurangi variabel a dengan b agar menghasilkan variabel baru yaitu hasil//
                    System.out.println("Pengurangan dari "+a+" dan "+b+" Adalah "+hasil);//Output dari variabel a,b dan hasil//
                    System.out.println("==========================================");
                    break;//Berakhirnya suatu perintah pada case//
                case 3://Pernyataan Pemilihan case jika variabel pilihan sama dengan 3 akan mengeksekusi perintah di bawah//
                    System.out.print("Masukkan angka pertama = ");
                    a = keyboard.nextInt();//Inputan integer pada variabel a//
                    System.out.print("Masukkan angka kedua = ");
                    b = keyboard.nextInt();//Inputan interger pada variabel b//
                    hasil=a*b; //Operator disini menggunakan tanda * untuk mengkalikan variabel a dengan b agar menghasilkan variabel baru yaitu hasil//
                    System.out.println("Perkalian dari "+a+" dan "+b+" Adalah "+hasil);//Output dari variabel a,b dan hasil//
                    System.out.println("==========================================");
                    break;//Berakhirnya suatu perintah pada case//
                default:	
                    //Pernyataan Pemilihan default apabila semua seleksi case tidak cocok semua maka akan mengeksekusi perintah dibawah//
                    System.out.println("Maaf inputan anda tidak ada dalam list");
                    System.out.println("==========================================");
                    break ulangi; //Pernyataan pemilihan break ulangi untuk memilih atau menuju label ulangi//
            }
		System.out.print("\nApakah anda mau mengulanginya? (y/n) ");                
                ulang = keyboard.next().charAt(0); //Inputan untuk menyatakan ingin mengulangi program atau tidak//
}
		while(ulang == 'y'); //Pernyataan Perulangan while akan dilakukan terus menerus dilakukan jika variabel ulang berinput y dan jika variabel ulang tidak berinput y maka akan mengeksekusi perintah di bawah//
		System.out.println("DONE PROGRAM BERHENTI");	
    }
    
}