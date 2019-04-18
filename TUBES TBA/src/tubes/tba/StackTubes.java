/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.tba;

import java.util.Stack;

/**
 *
 * @author Jundi
 */
public class StackTubes {
static void showpush(Stack st, int a) {
      st.push(new Integer(a));
      System.out.println("push(" + a + ")");
      System.out.println("stack: " + st);
   }

   static void showpop(Stack st) {
       System.out.println(st.pop());
   }

   public static void main(String args[]) {
      
   }
    
}
