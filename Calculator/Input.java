/* Name - Vivek Hotchandani
   PRN-22070126133
   Batch-AIML B3
  */
  
import java.io.*;
import java.util.*;

class Input{
	public double[] inputnumbers(){
		double numbers[] = new double[2];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number:");
		
		double firstnumber= scan.nextDouble();
		numbers[0]=firstnumber;
		System.out.println("Enter Second Number:");
		double secondnumber=scan.nextDouble();
		numbers[1]=secondnumber;
		
		return numbers;
	
	}
	public double[] ArrayInput() {
		Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan1.nextInt();
        double[] array = new double[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan1.nextDouble();
        }

        return array;
    }
}