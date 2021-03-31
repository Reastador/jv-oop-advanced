package core.basesyntax;

public class Square extends Shape {
    private int sideA;

    public Square(String name, String color, int sideA) {
        super(name, color);
        this.name = name;
        this.color = color;
        this.sideA = sideA;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.sideA, 2);
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.name).append(" , area: ")
                .append(this.calculateArea())
                .append(" sq. units, All sides equals: ").append(this.sideA)
                .append(" , color: ").append(this.color);
        return sb.toString();
    }
}
