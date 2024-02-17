import java.util.*;
import java.io.*;
public class Neighbours{
public static int findNearest(int[] arr) {
        int minDist = Integer.MAX_VALUE;          // Initialize a variable named "minDist" with the maximum possible integer value
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
		// Iterate through the array from the first element to the second last element
		
            int dist = Math.abs(arr[i] - arr[i + 1]); 			// Calculate the absolute difference between the current element and the next element
            
			// Check if the calculated distance is less than the minimum distance
			if (dist < minDist) {
                minDist = dist;   // If true, update the minimum distance and the index of the nearest pair of elements
                index = i;
        }
    }
	// Return the index of the nearest pair of elements
        return index;
  }

}
