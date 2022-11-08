package fighter;

public class Alien extends Sprite {

    private final int INITIAL_X = 400;

    public Alien(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {

        loadImage("src/resources/Alien.png");
        getImageDimensions();
    }
    // how the aliens move in the game is here coded
    // they move automatically in x-direction (x-1)
    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}