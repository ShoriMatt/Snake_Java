public class Structures {
    private char wall = '#';

    public int X = 16;
    public int Y = 40;

    public char[][] stage = new char[X][Y];

    public void createWall(){
        for (int y = 0; y < stage.length; y++) {
            for (int x = 0; x < stage[y].length; x++) {
                if (y == 0 || y == stage.length - 1 || x == 0 || x == stage[y].length - 1) {
                    stage[y][x] = wall;
                } else {
                    stage[y][x] = ' ';
                }
            }
        }
    }

    public void displayStage() {
        for (int y = 0; y < stage.length; y++) {
            for (int x = 0; x < stage[y].length; x++) {
                System.out.print(stage[y][x]);
            }
            System.out.println();
        }
    }

    public ResultRandomPos genRandomPos(boolean isSnake) {
        int y = (int) Math.round(Math.random() * this.Y - 2) + 1;
        int x = (int) Math.round(Math.random() * this.X - 2) + 1;

        if (isSnake) {
            if (x + 3 > this.Y - 1) {
                genRandomPos(isSnake);
            }
            return new ResultRandomPos(x, y);
        }
        return new ResultRandomPos(x, y);
    }

    final class ResultRandomPos {
        int x;
        int y;

        public ResultRandomPos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
