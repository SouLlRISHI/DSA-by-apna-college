public class Pairs {
    public static void print(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) { // Iterate over each element in the array
            int curr = numbers[i]; // Store the current element

            for (int j = i + 1; j < numbers.length; j++) { // Iterate over the elements following the current element
                System.out.print(" (" + curr + ", " + numbers[j] + ") "); // Print the pair (curr, numbers[j])
            }
            System.out.println(); // Print a newline after each iteration of the outer loop
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10}; // Initialize the array
        print(numbers); // Call the print method to display pairs
    }
}

// Explanation of output:
// Initial Array: {2, 4, 6, 8, 10}

// First Iteration (i = 0):
// curr = 2
// Inner loop generates pairs with 2:
// (2, 4) (2, 6) (2, 8) (2, 10)

// Second Iteration (i = 1):
// curr = 4
// Inner loop generates pairs with 4:
// (4, 6) (4, 8) (4, 10)

// Third Iteration (i = 2):
// curr = 6
// Inner loop generates pairs with 6:
// (6, 8) (6, 10)

// Fourth Iteration (i = 3):
// curr = 8
// Inner loop generates pairs with 8:
// (8, 10)

// Fifth Iteration (i = 4):
// curr = 10
// Inner loop does not generate any pairs as there are no elements after 10.
