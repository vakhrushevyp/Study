package Five.CalculatorOperation;

public class Multiplication extends Operation {

    private int z;

    public Multiplication(int x, int y) {
        super(x, y);
        this.z = x * y;
    }

    public int getResult() {
        return z;
    }
}
