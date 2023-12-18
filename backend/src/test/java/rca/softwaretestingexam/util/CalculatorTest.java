package rca.softwaretestingexam.util;

import org.junit.jupiter.api.Test;
import rca.softwaretestingexam.v1.exceptions.InvalidOperationException;
import rca.softwaretestingexam.v1.serviceImpl.MathOperatorImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private  MathOperatorImpl mathOperatorService = new MathOperatorImpl();
    @Test
    void WhenAdd_returnSum() throws InvalidOperationException {
        double actual = mathOperatorService.doMath( 3, 1,"+");
        double expected  = 5;
        assertEquals(actual,expected);
    }
    @Test
    public void WhenAddWithZero_returnNumber() throws InvalidOperationException {
        assertEquals(mathOperatorService.doMath(3, 0,"+"),3.0);
    }
    
    @Test
    void WhenDivide_returnQuotient() throws InvalidOperationException {
        double actual = mathOperatorService.doMath(3,1,"/");
        double expected = 3.0;
        assertEquals(actual,expected);
    }
    @Test
    void WhenDivisorZero_returnException(){
        Exception exception = assertThrows(InvalidOperationException.class, () -> {
            mathOperatorService.doMath(1,0,"/");
        });
        assertEquals(exception.getMessage(),"Cannot divide by 0");
    }
    @Test
    void WhenDivideByOne_returnNumber() throws InvalidOperationException {
        double expected = 3.0;
        double actual = mathOperatorService.doMath(3,1,"/");
        assertEquals(actual , expected);
    }
    @Test
    void WhenMultByOne_returnNumber() throws InvalidOperationException {
        double actual = mathOperatorService.doMath(3,1,"*");
        double expected = 3.0;
        assertEquals(actual,expected);
    }

}