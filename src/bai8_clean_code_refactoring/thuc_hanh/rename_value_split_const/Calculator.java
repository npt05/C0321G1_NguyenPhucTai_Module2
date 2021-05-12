package bai8_clean_code_refactoring.thuc_hanh.rename_value_split_const;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperator, int secondOperator, char operator){
        switch (operator){
            case ADDITION:
                return firstOperator + secondOperator;
            case SUBTRACTION:
                return firstOperator - secondOperator;
            case MULTIPLICATION:
                return firstOperator*secondOperator;
            case DIVISION:
                if (secondOperator != 0)
                    return firstOperator/secondOperator;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}