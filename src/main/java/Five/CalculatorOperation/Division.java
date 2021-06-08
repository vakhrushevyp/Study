package Five.CalculatorOperation;

public class Division extends Operation {
    private int z;


    public Division(int x, int y) {
        super(x, y);
        this.z = x / y;


    }
   
    public Object getResult() {
         return z;
        }

        

}
