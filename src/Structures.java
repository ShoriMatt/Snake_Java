public class Structures {
    private char wall = '#';

    public int x;
    public int y;

    public char[][] stage = new char[16][40];

    public void createWall(){
        for (int y = 0; y < this.stage.length; y++) {
            for (int x = 0; x < this.stage[y].length; x++) {
                if (y == 0 || y == this.stage.length - 1 || x == 0 || x == this.stage[y].length - 1) {
                    this.stage[y][x] = wall;
                } else {
                    this.stage[y][x] = ' ';
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
}
