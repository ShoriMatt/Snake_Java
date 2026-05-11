import java.util.Random;
import java.util.ArrayList;

public class Snake {
    public char snakeHead = '@';
    public char snakeBody = 'O';
    public int snakeSize = 0;
    Random r = new Random();
    
    public ArrayList<Integer> snakeSpawn(int X, int Y) {
        int y = r.nextInt(3, Y - 2);
        int x = r.nextInt(3, X - 2);
        ArrayList<Integer> rep = new ArrayList<Integer>();
        return rep ;
    }

    
}
