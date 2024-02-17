import java.util.*;
import java.io.*;

public class  Userinput{
    public static void main(String[] args) throws IOException {
		// Initialize a BufferedReader object "br" to read input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Initialize a Scanner object "scan" to read input from the console
        Scanner scan = new Scanner(System.in);
		
		// Prompt the user to enter the number of elements in the array
        System.out.println("Type How many numbers to Enter in the array:");
		// Read the number of elements from the user input
        int n = scan.nextInt();
		// Create an array of integers "inputarray" with size "n"
        int[] inputarray = new int[n];

        int index = 0;

        System.out.println("Enter " + n + " numbers to be entered with a space");
		// Read the input line from the user
        String array = br.readLine();
		 // Split the input line into an array of strings "input" using whitespaces as delimiters
        String[] input = array.trim().split("\\s+"); // + mean 1 or more , //* means zero or more
		// Convert each string in the "input" array to an integer and store it in the "inputarray" array
        for (int i = 0; i < n; i++) {
            inputarray[i] = Integer.parseInt(input[i]);
        }
		
		// Call the "findNearest" method from the "Neighbours" class to find the index of the nearest neighboring pair
        int nearestIndex=Neighbours.findNearest(inputarray);
		
		// Print the index of the nearest neighboring pair
        System.out.println("The nearest neighboring pair is at index " + nearestIndex);

    }

}