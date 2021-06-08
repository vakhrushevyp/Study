package Five.CalculatorOperation;

public class Minus extends Operation {
    private int z;

    public Minus(int x, int y) {
        super(x, y);
        this.z = x - y;

    }
    public int getResult() {
        return z;
    }
}
