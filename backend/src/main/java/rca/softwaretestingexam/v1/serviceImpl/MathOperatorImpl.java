package rca.softwaretestingexam.v1.serviceImpl;

import org.springframework.stereotype.Service;
import rca.softwaretestingexam.v1.exceptions.InvalidOperationException;
import rca.softwaretestingexam.v1.services.IMathOperator;

@Service
public class MathOperatorImpl implements IMathOperator {

    @Override
    public double doMath(int operand1, int operand2, String operation) throws InvalidOperationException {
        if ("/".equals(operation) && operand2 ==0) {
            throw new InvalidOperationException("Cannot divide by 0");
        }

        switch (operation) {
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "**":
                return Math.pow(operand1, operand2);
            case "log":
                return operand1 * Math.log10(operand2);
            case "ln":
                return operand1 * Math.log(operand2);
            default:
                throw new RuntimeException("Unknown Operation");
        }
    }
}
