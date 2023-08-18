/*
DuckDuckGoose Lab
Programmer: Hemang Shankar
*/

import java.util.Scanner; //imports the scanner class

class Main {
  public static void main(String[] args) {
    //Declares a scanner object
    Scanner input = new Scanner(System.in);
    
    //Declares a linked list 
    CLList list;
    
    //Initialize variable
    int userChoice = 1;
    
    //Clears the console
    System.out.print("\033[H\033[2J");
    System.out.flush();

    //Uses a sentinel loop to repeatedly keep the program running until the user's choice
    while(userChoice != 0){
      //Obtain total number of players for the game
      System.out.println("\nEnter the number of players in this game:");
      
      //Stores the input of the user into the variable
      userChoice = input.nextInt();
      
      //Repeatedly prompts the user to enter a valid choice for number of players
      while(userChoice < 0){
        System.out.println("\nInvalid choice. Valid number of players is greater or equal to 0");
        userChoice = input.nextInt();
      }
      
      // Exit if user entered 0 as number of players
      if (userChoice == 0){
        //Exits the program that causes JVM to exit
        System.exit(0);
        //closes the scanner1
        input.close();
      }


      //Circular list
      list = new CLList();
      list.InsertAtHead("Player " + 1);

      //Inserts value into the circular list
      for(int i = 2; i <= userChoice; i++){
        list.InsertAtTail("Player " + i);
      }

      //Prints out the linked list 
      System.out.println("\nThe participants in this Duck Duck Goose game are: ");
      list.PrintList();

      System.out.println("\n\nDuck Duck Goose game begins now:\n ");
      //Calls the method to begin the game
      list.DuckDuckGoose();
      
      list=null;
    }
  }
}

/*Test Cases
Enter the number of players in this game:
5

The participants in this Duck Duck Goose game are: 
Player 1
Player 2
Player 3
Player 4
Player 5


Duck Duck Goose game begins now:
 
Player 1 is Duck
Player 2 is Duck
Player 3 is Goose and hence eliminated.

Player 4 is Duck
Player 5 is Duck
Player 1 is Goose and hence eliminated.

Player 2 is Duck
Player 4 is Duck
Player 5 is Goose and hence eliminated.

Player 2 is Duck
Player 4 is Duck
Player 2 is Goose and hence eliminated.


Player 4 is the winner in this game

Enter the number of players in this game:
0
____________________________________________________________________________________________________
Enter the number of players in this game:
-5

Invalid choice. Valid number of players is greater or equal to 0
-3

Invalid choice. Valid number of players is greater or equal to 0
6

The participants in this Duck Duck Goose game are: 
Player 1
Player 2
Player 3
Player 4
Player 5
Player 6


Duck Duck Goose game begins now:
 
Player 1 is Duck
Player 2 is Duck
Player 3 is Goose and hence eliminated.

Player 4 is Duck
Player 5 is Duck
Player 6 is Goose and hence eliminated.

Player 1 is Duck
Player 2 is Duck
Player 4 is Goose and hence eliminated.

Player 5 is Duck
Player 1 is Duck
Player 2 is Goose and hence eliminated.

Player 5 is Duck
Player 1 is Duck
Player 5 is Goose and hence eliminated.


Player 1 is the winner in this game

Enter the number of players in this game:
5

The participants in this Duck Duck Goose game are: 
Player 1
Player 2
Player 3
Player 4
Player 5


Duck Duck Goose game begins now:
 
Player 1 is Duck
Player 2 is Duck
Player 3 is Goose and hence eliminated.

Player 4 is Duck
Player 5 is Duck
Player 1 is Goose and hence eliminated.

Player 2 is Duck
Player 4 is Duck
Player 5 is Goose and hence eliminated.

Player 2 is Duck
Player 4 is Duck
Player 2 is Goose and hence eliminated.


Player 4 is the winner in this game

Enter the number of players in this game:
0
_________________________________________________________________________________________________________
Enter the number of players in this game:
8

The participants in this Duck Duck Goose game are: 
Player 1
Player 2
Player 3
Player 4
Player 5
Player 6
Player 7
Player 8


Duck Duck Goose game begins now:
 
Player 1 is Duck
Player 2 is Duck
Player 3 is Goose and hence eliminated.

Player 4 is Duck
Player 5 is Duck
Player 6 is Goose and hence eliminated.

Player 7 is Duck
Player 8 is Duck
Player 1 is Goose and hence eliminated.

Player 2 is Duck
Player 4 is Duck
Player 5 is Goose and hence eliminated.

Player 7 is Duck
Player 8 is Duck
Player 2 is Goose and hence eliminated.

Player 4 is Duck
Player 7 is Duck
Player 8 is Goose and hence eliminated.

Player 4 is Duck
Player 7 is Duck
Player 4 is Goose and hence eliminated.


Player 7 is the winner in this game

Enter the number of players in this game:
-6

Invalid choice. Valid number of players is greater or equal to 0
-10

Invalid choice. Valid number of players is greater or equal to 0
0
__________________________________________________________________________________________________________
Enter the number of players in this game:
15

The participants in this Duck Duck Goose game are: 
Player 1
Player 2
Player 3
Player 4
Player 5
Player 6
Player 7
Player 8
Player 9
Player 10
Player 11
Player 12
Player 13
Player 14
Player 15


Duck Duck Goose game begins now:
 
Player 1 is Duck
Player 2 is Duck
Player 3 is Goose and hence eliminated.

Player 4 is Duck
Player 5 is Duck
Player 6 is Goose and hence eliminated.

Player 7 is Duck
Player 8 is Duck
Player 9 is Goose and hence eliminated.

Player 10 is Duck
Player 11 is Duck
Player 12 is Goose and hence eliminated.

Player 13 is Duck
Player 14 is Duck
Player 15 is Goose and hence eliminated.

Player 1 is Duck
Player 2 is Duck
Player 4 is Goose and hence eliminated.

Player 5 is Duck
Player 7 is Duck
Player 8 is Goose and hence eliminated.

Player 10 is Duck
Player 11 is Duck
Player 13 is Goose and hence eliminated.

Player 14 is Duck
Player 1 is Duck
Player 2 is Goose and hence eliminated.

Player 5 is Duck
Player 7 is Duck
Player 10 is Goose and hence eliminated.

Player 11 is Duck
Player 14 is Duck
Player 1 is Goose and hence eliminated.

Player 5 is Duck
Player 7 is Duck
Player 11 is Goose and hence eliminated.

Player 14 is Duck
Player 5 is Duck
Player 7 is Goose and hence eliminated.

Player 14 is Duck
Player 5 is Duck
Player 14 is Goose and hence eliminated.


Player 5 is the winner in this game

Enter the number of players in this game:
-5

Invalid choice. Valid number of players is greater or equal to 0
0
*/