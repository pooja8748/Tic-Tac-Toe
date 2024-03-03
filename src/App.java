import board.Board;
import player.Player;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
      
        System.out.println("First project -> Tic toc toe");
        Board b=new Board(3,'-');
        b.printBoardConfig();
        Player p1= new Player();
        p1.setPlayerdetail("Ravi", 21, "Karnataka", 1234567890, "ravi78@gmail.com",'X');
        p1.displayPlayerDetails();
    }
}
