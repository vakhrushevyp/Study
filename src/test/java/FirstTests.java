import Five.Calculator;
import Five.CalculatorOperation.Division;
import Five.CalculatorOperation.Minus;
import Five.CalculatorOperation.Multiplication;
import Five.CalculatorOperation.Plus;
import org.junit.Assert;
import org.junit.Test;

public class FirstTests {


    @Test
    public void PlusOperator() {
        Assert.assertEquals(10, new Plus(5, 5).getResult());
    }

    @Test
    public void MinusOperator() {
        Assert.assertEquals(0, new Minus(5, 5).getResult());
    }

    @Test
    public void MultiplicationOperator() {
        Assert.assertEquals(25, new Multiplication(5, 5).getResult());
    }

    @Test
    public void DivisionOperator() {
        Assert.assertEquals(1, new Division(5, 5).getResult());
    }


}
