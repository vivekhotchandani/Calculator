This Java program consists of two classes:

Userinput: This class contains a method inputArray which takes the size of the array as input and returns an array of double values based on the user's input.

##ConversionAL: This class contains the main method which takes user input to create a primitive double array and then converts it to an ArrayList<Double>. It also demonstrates the conversion of an ArrayList<Double> back to a primitive double array.

Explanation
##Userinput Class
inputArray method: This method uses a BufferedReader to read user input. It prompts the user to enter the array elements separated by spaces, reads the input as a string, and then splits the input string into an array of strings using whitespaces as delimiters. It converts each string element to a double and populates the array with the converted elements.
ConversionAL Class
main method: This method uses a Scanner to read user input for the size of the array. It then calls the inputArray method from the Userinput class to get the primitive double array from the user. It prints the primitive double array using Arrays.toString. It then converts the primitive double array to an ArrayList<Double> using the Arrays.asList method and prints the elements of the ArrayList using a for-each loop. Finally, it converts the ArrayList<Double> back to a primitive double array using stream, mapToDouble, and toArray methods from the Stream class and prints the resulting array using Arrays.toString.
