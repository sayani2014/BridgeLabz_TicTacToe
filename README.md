# BridgeLabz_TicTacToe

## Usecases
1. Start fresh by creating a tic tac toe board
   * Create a TicTacToeGame class
   * Create method for every use case and call from main
   * Create a board of char[] of size 10 and assign empty space to each element
   * 0th index is ignored to make it user friendly

2. Ability to allow the player to choose a letter X or O
   * Create a method to allow player to input X or O and call from main
   * Determine Player and Computer Letter to play the game
   
3. As a Player would like to see the board so I can choose the valid cells to make my move during my turn
   * Write a method showBoard to display the current Board
   
4. Ability for user to make a move to a desired location in the board
   * Select the index from 1 to 9 to make the move.
   * Ensure the index is free   
  
5. Ability to check for the free space before making the desired move
   * Check if the free space is available for the move
   * In case available make the move  
   
6. Toss to check who plays first.
   * Use Random to determine who starts first, the computer or the user  
  
7. Determine after every move the winner or the tie or change the turn
   * On Computer getting its turn would like the computer to play like me
   * Next thing I do is check if my Opponent can win then play to block it
   * If neither of us are winning then My first choice would be to take one of the available corners
   * If the corners are not available then take the Centre
   * Lastly any of the available sides
   * Play till the game is full or th player wins  
   
8. Ask for another game once the game completes   
