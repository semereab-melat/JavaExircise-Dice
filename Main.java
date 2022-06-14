import java.util.Scanner;

/***************************************************************
 Filename:  Dice
 Created by: MELAT SEMEREAB
 Created on: 10/11/2021
 Comment: Design and write a program to use the Math.random() function to roll two
 dice and print the resulting numbers until the user wishes to stop 
 ***************************************************************/


class Main {
  public static void main(String[] args) {
    
      // creating a keyboard object to connect us with end-user
      Scanner keyboard = new Scanner(System.in);
      // declaring our variables
      int dice1, dice2;
      char userInput;
      String wordInput;

      do
      {
         dice1 = (int) (Math.random() * 6) +1;
         dice2 = (int) (Math.random() * 6) +1;
         System.out.println("Dice 1 is " + dice1 +"\nDice 2 is " + dice2);
         System.out.println("You want ro try again? yes = 'Y' and no = 'N': ");
         wordInput = keyboard.nextLine().toUpperCase();
         userInput = wordInput.charAt(0);

      } while (userInput == 'Y');  //do-while
   }//main
}//class