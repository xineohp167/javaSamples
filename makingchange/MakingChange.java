/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makingchange;

/**
 * Reads integer N (number of pennies) and prints out the best way 
 * (fewest number of coins) to make change using US coins (quarters, dimes, nickels, and pennies only).
 * @author Fabien
 */
public class MakingChange {
    
    // Make enum Coins
    public enum Coins{
        QUARTERS(25),
        DIMES(10),
        NICKELS(5),
        PENNIES(1);
        
        private final int value;
        Coins(int value){
            this.value = value;
        }
        
        private int value(){
            return value;
        }
        
    }
    
    /**
     * Returns the change in string format using fewest number of coins
     * @param amount the amount of money
     * @return the string output
     */
    public static String getChange(int amount){
        String result = "";
        for (Coins c : Coins.values()) {
            if(amount >= c.value()){
                int numberOfCoins = amount / c.value();
                amount = amount % c.value();
                result += c + " : " + numberOfCoins + "\n";
            }
        }
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        for (Coins c : Coins.values()) {
//            System.out.println(c + " " + c.value());
//        }
        int change = 73;
        String test = getChange(change);
        System.out.println(test);
        System.out.println("int change is " + change);
    }
    
}
