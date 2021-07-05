/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2k19;
public class rata {
    int deret,a=1;
    float jumlah,rata2;
    public void deretan(int b){
        for(int i=0;i<b;i++){
            a=a+i;
            System.out.print(a+" ");
            jumlah = jumlah+a;}
        rata2=jumlah/b;
        System.out.println();
        System.out.println("Rata-rata = "+rata2);}}
