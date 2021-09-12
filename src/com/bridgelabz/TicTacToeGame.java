package com.bridgelabz;

import java.util.Scanner;

/**
 * Class to create ticktactoe game with different methods
 * @author Aravind
 */
public class TicTacToeGame
{
    //create a board of char array of size 10
    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;
    public static void main(String[] args)
    {
        createEmptyBoard();
        chooseLetter();
        showBoard();

    }
    /**UC1
     * Method Name: createEmptyBoard
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
    /**UC2
     * Method Name: chooseLetter
     * Description: static method to choose letter for user and computer
     * Algorithm: It takes input from the user.Ternary operator(condition?exp1:exp2) lets us write if else
     * statement in one line. if user letter is 'X' then computer letter is become 'O' otherwise it becomes 'X'
     */
    private static void chooseLetter()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter :: X or O : ");
        userLetter = scanner.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }
    /**UC3
     * Method Name: showBoard
     * Description: method to display current board
     * Algorithm: it prints the every element in board array using println method.
     */
    private static void showBoard()
    {
        System.out.println( board[1] + " | " + board[2] + " | " + board[3] );
        System.out.println("----------");
        System.out.println( board[4] + " | " + board[5] + " | " + board[6] );
        System.out.println("----------");
        System.out.println( board[7] + " | " + board[8] + " | " + board[9] );
    }
}
