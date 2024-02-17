//Creating Odd and even arrays

import java.util.*;
import java.io.*;

class oddeven{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		System.out.println("Type Number of Elements to Enter:");
		int n = scan.nextInt();
		
		double[] inputarray = new double[n];
		double[] odd = new double[n];
		double[] even = new double[n];
		
		int index_even = 0;
		int index_odd = 0;
		int count = 0;
		
		System.out.println("Enter "+ n + " Numbers in single line separated by space.");
		
		String array = br.readLine();
		String[] input = array.trim().split("\\s+");    //+ mean 1 or more , //* means zero or more
		
		for(int i=0 ; i<n;i++){
			inputarray[i] = Double.parseDouble(input[i]);
			
		}
		for(int j=0;j<n;j++){
			if(inputarray[j] % 2 == 0){
				even[index_even] = inputarray[j];
				index_even++;
			}
			else{
					odd[index_odd] = inputarray[j];
					index_odd++;
			}	
	
    }
	System.out.println("____________Entered Sequence________________");
	for(int in=0;in< inputarray.length;in++){
		System.out.println(" "+inputarray[in]);
		
	}
	
	System.out.println("____________Entered Sequence________________");
	for(int in=0;in< even.length;in++){
		System.out.println(" "+even[in]);
		
	}
	
	System.out.println("____________Entered Sequence________________");
	for(int in=0;in< odd.length;in++){
		System.out.println(" "+odd[in]);
		
	}
	
	}
}