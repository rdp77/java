/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2pbo;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExportData {
    public void tugas (String data){
        String dataa = new String (data);
        FileOutputStream input = null;
        try{
            input = new FileOutputStream("D:/test.txt");
        } catch (FileNotFoundException e){
            System.out.println("File Tidak Ada");} 
        try{
            for(int i=0; i<data.length(); i++){
                input.write((int)dataa.charAt(i));}
        }catch (IOException e){}
        try {
            input.close();
        }catch (Exception e){}}}
