package rca.softwaretestingexam.v1.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import rca.softwaretestingexam.v1.dtos.DoMathRequestDto;
import rca.softwaretestingexam.v1.exceptions.InvalidOperationException;
import rca.softwaretestingexam.v1.serviceImpl.MathOperatorImpl;
import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathOperatorServiceTest {

    @Mock
    private MathOperatorImpl mathOperatorService;
//    PcUserService mock = org.mockito.Mockito.mock(PcUserService.class);

    @Test
    public void whenAdd_returnAddition() throws InvalidOperationException {
        int operator1 = 3;
        int operator2 = 1;
        String operation = "+";

        double mathOperation = mathOperatorService.doMath(operator1,operator2, operation);
        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(mathOperation);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(mathOperation).isEqualTo(actualMathOperator);
    }

    
    @Test
    public void whenSub_returnSubtraction() throws InvalidOperationException {
        int operator1 = 3;
        int operator2 = 1;
        String operation = "-";

        double mathOperation = mathOperatorService.doMath(operator1,operator2, operation);
        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(mathOperation);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(mathOperation).isEqualTo(actualMathOperator);
    }

    @Test
    public void whenMult_returnMultiplication() throws InvalidOperationException {
        int operator1 = 3;
        int operator2 = 1;
        String operation = "*";

        double mathOperation = mathOperatorService.doMath(operator1,operator2, operation);
        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(mathOperation);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(mathOperation).isEqualTo(actualMathOperator);
    }

    @Test
    public void whenDiv_returnDivision() throws InvalidOperationException {
        int operator1 = 3;
        int operator2 = 1;
        String operation = "/";

        double mathOperation = mathOperatorService.doMath(operator1,operator2, operation);
        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(mathOperation);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(mathOperation).isEqualTo(actualMathOperator);
    }

}
