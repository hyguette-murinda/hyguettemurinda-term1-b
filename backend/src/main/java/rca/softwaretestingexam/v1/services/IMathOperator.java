package rca.softwaretestingexam.v1.services;

import rca.softwaretestingexam.v1.exceptions.InvalidOperationException;

public interface IMathOperator {

    double doMath(int operand1, int operand2, String operation) throws InvalidOperationException;
}
