/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourorderpleasecodewars;

/**
 *
 * @author Amr Halawani
 */
public class YourOrderPleaseCodeWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //https://www.codewars.com/kata/your-order-please
       String result = Order.order("4of Fo1r pe6ople g3ood th5e the2");
        System.out.println(result);
         String result2 = Order.order("");
        System.out.println( result2 );
    }
    
}
