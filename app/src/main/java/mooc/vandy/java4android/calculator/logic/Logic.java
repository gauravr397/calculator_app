package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION = 4;
    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {

        OperationInterface operationObj = null;
        switch(operation){
            case ADDITION:
                operationObj = new Add();
                break;
            case SUBTRACTION:
                operationObj = new Subtract();
                break;
            case MULTIPLICATION:
                operationObj = new Multiply();
                break;
            case DIVISION:
                operationObj = new Divide();
                break;
            default:
                break;
        }
        if(operationObj != null) {
            String outStr = operationObj.operate(argumentOne, argumentTwo);
            mOut.print(outStr);
        }
    }
}
