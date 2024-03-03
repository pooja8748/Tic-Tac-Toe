package game;

import player.*;

import java.sql.Struct;
import java.util.Scanner;

import board.*;

public class Game {
    Player[] players;
    Board board;
    int turn;
    int noOfMoves;
    boolean gameOver;
    String zero;
    String cross;

    public Game(Player[] players, Board board) {
        this.players = players;
        this.board = board;
        this.turn = 0;
        this.noOfMoves = 0;
        this.gameOver = false;

        StringBuilder z = new StringBuilder();
        StringBuilder c = new StringBuilder();

        for (int i = 0; i < board.size; i++) {
            z.append('0');
            z.append('X');
        }

        this.zero = z.toString();
        this.cross = c.toString();

    }

    public void printBoardConfig() {
        int sz = this.board.size;
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                System.out.println(board.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        printBoardConfig();

    }

    public int getIndex() {
        while (true) {
            // Player Aman give one position
            System.out.println("Player:" + players[turn].getPlayerName() + "give one position");
            Scanner sc = new Scanner(System.in);
            int pos = sc.nextInt() - 1;
            int sz = board.size;
            int row = pos / sz;
            int col = pos * sz;
            if (row < 0 || row >= sz || col < 0 || col >= sz) {
                System.out.println("Invalid position");
                continue;
            }
            if (board.matrix[row][col] != '-') {
                System.out.println("Position already occupied");
                continue;
            }
            return pos;
        }
    }
    public boolean checkCombinations()
    {
        int sz = board.size;
         //Rowvise
         for(int i=0;i<sz;i++)
         {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<sz;j++)
            {
                sb.append(board.matrix[i][j]);
            }
            String pattern =sb.toString();
            if(pattern.equals(zero) || pattern.equals(cross))
            {
                return true;
            }
         }
        //Columnvise
        for(int i=0;i<sz;i++)
         {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<sz;j++)
            {
                sb.append(board.matrix[j][i]);
            }
            String pattern =sb.toString();
            if(pattern.equals(zero) || pattern.equals(cross))
            {
                return true;
            }
         }
        //Diagonal
        int i=0,j=0;
        StringBuilder sb = new StringBuilder();
        while(i<sz)
        {
            sb.append(board.matrix[i][j]);
            i++;
            j++;
        }
        String pattern = sb.toString();
        if(pattern.equals(zero)|| pattern.equals(cross))
        {
            return true;
        }
        //Anti-Diagonal
        i=0;
        j=sz-1;
        sb = new StringBuilder();
        while(i<sz)
        {
            sb.append(board.matrix[i][j]);
            i++;
            j--;
        }
        pattern = sb.toString();
        if(pattern.equals(zero)|| pattern.equals(cross))
        {
            return true;
        }
        return false;
    }
   
}
