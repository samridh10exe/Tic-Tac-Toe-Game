Explanation:
1. We first declare a 2-dimensional char array "board" to represent the Tic Tac Toe board and a char variable "currentPlayer" to keep track of the player's turn.
2. In the "initializeBoard()" method, we initialize the board to contain dashes.
3. In the "drawBoard()" method, we use nested for loops to draw the board like a square.
4. In the "playGame()" method, we use a while loop to keep the game going until it is finished. We prompt the player for input, check if the move is valid, and then set the proper symbol on the board. We then check if the game has been won or tied, and switch the player's turn if not.
5. In the "isValid()" method, we check if the move is valid based on the row and column entered by the player.
6. In the "isWinner()" method, we check if either player has won by checking all possible winning combinations.
7. In the "isTie()" method, we check if the game has ended in a tie by checking if there are any empty spaces left on the board.
8. Finally, in the "main()" method, we initialize the board, draw it, and start the game.
