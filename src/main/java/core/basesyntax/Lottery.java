package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    
    public Ball getRandomBall(){
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(101));
        return ball;
    }
}
