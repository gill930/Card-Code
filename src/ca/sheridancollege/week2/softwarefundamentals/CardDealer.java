/*Name= Harmanjot Kaur Gill
*Student id= 991649779
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
       System.out.println("Clbs is: "+nineClubs.getSuit());
       System.out.println("Clbs is: "+nineClubs.getValue());
        
        Card nineClubs1 = new Card("Clubs", 9);
      nineClubs1.setSuit("diamonds");
       System.out.println("Clubs is: "+nineClubs1.getSuit());
       System.out.println("Clubs is: "+nineClubs1.getValue());
        
       Card nineHearts =new Card("Hearts",9);
       nineHearts.setSuit("spades");
        System.out.println("Hearts is: "+nineHearts.getSuit());
       System.out.println("Hearts is: "+nineHearts.getValue());
          
      Card tree = new Card("tree",4);
      tree.setSuit("tree");
      System.out.println("tree is: "+tree.getSuit());
      System.out.println("tree is: "+tree.getValue());
    }
}
