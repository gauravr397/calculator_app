package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements OperationInterface{

    @Override
    public String operate(int arg1, int arg2) {
        Integer result =arg1+arg2;
        return result.toString();
    }
}
