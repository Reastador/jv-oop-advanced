package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Square square;
    private IsoscelesTrapezoid isoscelesTrapezoid;
    private RightTriangle rightTriangle;
    private Rectangle rectangle;
    private Circle circle;
    private Random random = new Random();

    public Shape createShape() {
        Shape[] shapes = { new Square(), new IsoscelesTrapezoid(),
                new RightTriangle(), new Rectangle(), new Circle()};
        int intGen = random.nextInt(shapes.length - 1);

        return shapes[intGen];
    }

    public Shape[] createArray() {
        int randInt = random.nextInt(15);
        Shape[] shapes = new Shape[randInt];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = createShape();
        }
        return shapes;
    }
}