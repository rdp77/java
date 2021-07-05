/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg2;

/**
 *
 * @author RDP77
 */
public class Test9 {
    String text = "abaaba";
    
    public void addText(){
        if (text.length() >= 6){
            text += text;
            else{
                    text += text.substring(3);
                    }
        }
        System.out.println("New Text : "+ text);
    }
    public static void main(String[] args){
        Test9 test = new Test9();
        test.addText();
    }
}
