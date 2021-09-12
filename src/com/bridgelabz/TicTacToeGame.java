package com.bridgelabz;

/**
 * Class to create ticktactoe game with different methods
 * @author Aravind
 */
public class TicTacToeGame
{
    //create a board of char array of size 10
    static char[] board = new char[10];
    public static void main(String[] args)
    {
        createEmptyBoard();

    }
    /**UC1
     * Name: createEmptyBoard
     * Description: Static method to create empty board
     * Algorithm: It takes board array indexes from 1 to 9 using for loop and
     * assign empty space to each element in the board.
     */
    private static void createEmptyBoard()
    {
        for(int index=1; index<board.length;index++)
        {
            board[index] = ' ';
        }
    }
}
