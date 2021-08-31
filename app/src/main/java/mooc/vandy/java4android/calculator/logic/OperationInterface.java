package mooc.vandy.java4android.calculator.logic;

/**
 * Defines the interface for performing operation on input numbers.
 */
public interface OperationInterface {
    /**
     * Implemented by each Operation class to perform specific operation.
     * @param arg1: First Integer
     * @param arg2: Second Integer
     */
    public String operate(int arg1, int arg2);
}