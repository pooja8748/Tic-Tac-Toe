import Player.player;
import board.Board;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
      
        System.out.println("First project -> Tic toc toe");
        Board b=new Board(3,'-');
        b.printBoardConfig();
        player p1= new player();
        p1.setPlayerdetail("Ravi", 21, "Karnataka", 1234567890, "ravi78@gmail.com",'X');
        p1.displayPlayerDetails();
    }
}
