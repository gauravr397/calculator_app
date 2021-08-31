package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements OperationInterface{

    @Override
    public String operate(int arg1, int arg2) {
        if(arg2==0)
            return "Undefined";
        Integer quotient = arg1/arg2;
        Integer rem = arg1%arg2;
        return quotient.toString() + " R: " + rem.toString();
    }
}
