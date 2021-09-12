package com.bridgelabz;

import java.util.Scanner;

/**
 * Class to create ticktactoe game with different methods
 * @author Aravind
 */
public class TicTacToeGame {
    //create a board of char array of size 10
    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;

    public static void main(String[] args) {
        createEmptyBoard();
        chooseLetter();
        showBoard();
        makeMove();
    }

    /**
     * UC1
     * Method Name: createEmptyBoard
     * Description: Static method to create empty board
     * Algorithm: It takes board array indexes from 1 to 9 using for loop and
     * assign empty space to each element in the board.
     */
    private static void createEmptyBoard() {
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
    }

    /**
     * UC2
     * Method Name: chooseLetter
     * Description: static method to choose letter for user and computer
     * Algorithm: It takes input from the user.Ternary operator(condition?exp1:exp2) lets us write if else
     * statement in one line. if user letter is 'X' then computer letter is become 'O' otherwise it becomes 'X'
     */
    private static void chooseLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter :: X or O : ");
        userLetter = scanner.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }

    /**
     * UC3
     * Method Name: showBoard
     * Description: method to display current board
     */
    private static void showBoard() {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
    /**
     * UC4
     * Method Name: makeMove
     * Description: method to make user to move to desired location
     * Algorithm: It takes user input from index 1 to 9. If you enter invalid index or try to move
     * to occupied position it prints error message else it moves the user letter to desired location.
     */
    private static void makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your location(1-9): ");
        int position = scanner.nextInt();
        if (position > 9 && position < 1) {
            System.err.println("Enter a valid location b/w 1 to 9");
            makeMove();
        } else if (board[position] != ' ') {
            System.err.println("You already chosen this! Enter a valid location");
            makeMove();
        } else {
            board[position] = userLetter;
            showBoard();
            checkFreeSpace();
            makeMove();
        }
    }
    /**UC5
     * Method Name: checkFreeSpace
     * Description: method to check if space is available in the board.
     * Algorithm: It checks free space is available or not before make a move and
     * count the number of spaces available.It extends UC4.
     */
    private static void checkFreeSpace()
    {
        boolean isSpaceAvailable = true;
        int numOfFreeSpaces = 0;
        for(int index=1;index<board.length;index++)
        {
            if((board[index] == ' '))
            {
                numOfFreeSpaces++;
            }
        }
        if(numOfFreeSpaces== 0)
        {
            isSpaceAvailable = false;
            System.err.println("Board is full! You can't make another move");

        }
        else
        {
            System.out.println("Free space is available! you have "+numOfFreeSpaces+ " moves left");
        }
    }
}