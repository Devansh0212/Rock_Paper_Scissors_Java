# Rock-Paper-Scissors

This is a simple Rock-Paper-Scissors game implemented in Java. The program allows users to play against the computer by choosing either "rock", "paper", or "scissors". The game follows the standard rules of Rock-Paper-Scissors.

## Description

The Rock-Paper-Scissors program allows users to play the game against the computer. It prompts the user to enter their name and greets them. The program also keeps track of the user's score based on the outcome of each game. The score is stored in a file called "rating.txt".

The program accepts the following commands:

- `rock`: Choose rock as your move.
- `paper`: Choose paper as your move.
- `scissors`: Choose scissors as your move.
- `exit`: Exit the game.
- `rating`: Display the user's current score.

After each move, the program determines the winner and updates the user's score accordingly. A draw awards 50 points, while a win against the computer awards 100 points.

## Getting Started

To run the Rock-Paper-Scissors game, make sure you have Java installed on your system. You can compile and run the Java file `Rock_Paper_Scissors.java` using the following commands:

javac Rock_Paper_Scissors.java
java Rock_Paper_Scissors


Follow the on-screen prompts to enter your name and play the game. Use the available commands to make your moves and interact with the program.

## Scoring System

The program reads the user's score from the file "rating.txt". If the file does not exist or the user's name is not found in the file, the initial score is set to 0. The score is updated after each game based on the outcome.



## Author

Devansh Brahmbhatt
