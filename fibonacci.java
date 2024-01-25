/* Name - Vivek Hotchandani
   PRN-22070126133
   Batch-AIML B3
  */

import java.io.*;
import java.util.*;

class Fibonacci{
	
    public static void main(String args[]){
		//int number=Integer.parseInt(args[0]);
		//System.out.println("Enter Number:");
		
		//Scanner
		//Scanner scan=new Scanner(System.in);
		//int number=scan.nextInt();
		
		
		//buffered Reader
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		try{
		int number=Integer.parseInt(reader.readLine());
		for (int i=0;i<number;i++){
			System.out.println(fibonacci(i)+" ");
	    }
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}
	public static int fibonacci(int n){
		
		if(n<=1){
			return n;
		}
		else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}