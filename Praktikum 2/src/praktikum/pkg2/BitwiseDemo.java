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
public class BitwiseDemo {
   static final int VISIBLE = 1;
   static final int DRAGGABLE = 2;
   static final int SELECTABLE = 4;
   static final int EDITABLE = 8;
   
   public static void main(String[] args){
       int flags = 0;
       
       flags = flags | VISIBLE;
       flags = flags | DRAGGABLE;
       
       if ((flags & VISIBLE) == VISIBLE){
           if ((flags & DRAGGABLE) == DRAGGABLE){
               System.out.println("Flags are Visible and Draggable");
           }
       }
       
       flags = flags | EDITABLE;
       
       if ((flags & EDITABLE) == EDITABLE){
           System.out.println("Flags are now also Editable");
       }
   }
}
