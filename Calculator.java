/* Name - Vivek Hotchandani
   PRN-22070126133
   Batch-AIML B3
  */
  
import java.io.*;
import java.util.*;

class Calculator{
	public double addition(double firstnumber,double secondnumber){
		return firstnumber+secondnumber;
	}
	public double subtraction(double firstnumber,double secondnumber){
		return firstnumber-secondnumber;
	}
	
	public double multiplication(double firstnumber, double secondnumber){
		return firstnumber*secondnumber;
	}
	public double division(double firstnumber, double secondnumber){
		return firstnumber/secondnumber;
	}

	public  double sumArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    public double Var(double[] array) {
        double mean = sumArray(array) / array.length;
        double variance = 0;

        for (double num : array) {
            variance += (num - mean) * (num - mean);
        }

        return variance / array.length;
    }

    public double SD(double[] array) {
        return squareRoot(Var(array));
    }

    // Custom square root function using Newton's method
    public double squareRoot(double num) {
        double x = num;
        double y = 1;
        double epsilon = 1e-15;

        while (Math.abs(x - y) > epsilon) {
            x = (x + y) / 2;
            y = num / x;
        }

        return x;
    }
}
