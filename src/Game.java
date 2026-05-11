public class Game extends Structures {

    public Game() {
        super();
    }
    
    public static void main(String[] args) {
        Game game = new Game();

        game.createWall();
        game.displayStage();
    }
}