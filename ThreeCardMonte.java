/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threecardmonte;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class ThreeCardMonte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int randomNum, userInput;
        randomNum = 1 + r.nextInt(3);
        
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" + "He glances at you out of the corner of his eye and starts shuffling.\n" +"He lays down three cards.");
    
        System.out.println("Which one is the ace? \n" + "## ## ## \n" + "## ## ## \n" + "1  2  3");
        userInput = keyboard.nextInt();
        
        if(randomNum == userInput){
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        }else{
            System.out.println("Ha Ha! Fast Eddie wins again! The ace was card number " + randomNum );
        }
    
        if(randomNum == 1){
            System.out.println("AA ## ##\n" + "AA ## ##");
        }else if(randomNum == 2){
            System.out.println("## AA ##\n" + "## AA ##");
        }else{
            System.out.println("## ## AA\n" + "## ## AA");
        }
    
    
    
    }
    
}
