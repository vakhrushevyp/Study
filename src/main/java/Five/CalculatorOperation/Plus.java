package Five.CalculatorOperation;

public class Plus extends Operation {

    private int z;

    public Plus(int x, int y) {
        super(x, y);
        this.z = x + y;
    }

    public int getResult() {
        return z;
    }

}










