public class Game {

    int inps;

    public void roll(int inps) {
        this.inps += inps;
    }

    public int getscore() {
        return inps;
    }
}
