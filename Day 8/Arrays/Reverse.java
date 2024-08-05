public class Reverse {
    public static void search(int numbers[]) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
       
        search(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

// Initial Array:
// numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}

// First Iteration (start = 0, end = 10):
// temp = numbers[10] → temp = 11
// numbers[10] = numbers[0] → numbers[10] = 1
// numbers[0] = temp → numbers[0] = 11
// Array after swap: {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1}
// Increment start and decrement end: start = 1, end = 9

// Second Iteration (start = 1, end = 9):
// temp = numbers[9] → temp = 10
// numbers[9] = numbers[1] → numbers[9] = 2
// numbers[1] = temp → numbers[1] = 10
// Array after swap: {11, 10, 3, 4, 5, 6, 7, 8, 9, 2, 1}
// Increment start and decrement end: start = 2, end = 8

// Third Iteration (start = 2, end = 8):
// temp = numbers[8] → temp = 9
// numbers[8] = numbers[2] → numbers[8] = 3
// numbers[2] = temp → numbers[2] = 9
// Array after swap: {11, 10, 9, 4, 5, 6, 7, 8, 3, 2, 1}
// Increment start and decrement end: start = 3, end = 7

// Fourth Iteration (start = 3, end = 7):
// temp = numbers[7] → temp = 8
// numbers[7] = numbers[3] → numbers[7] = 4
// numbers[3] = temp → numbers[3] = 8
// Array after swap: {11, 10, 9, 8, 5, 6, 7, 4, 3, 2, 1}
// Increment start and decrement end: start = 4, end = 6

// Fifth Iteration (start = 4, end = 6):
// temp = numbers[6] → temp = 7
// numbers[6] = numbers[4] → numbers[6] = 5
// numbers[4] = temp → numbers[4] = 7
// Array after swap: {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
// Increment start and decrement end: start = 5, end = 5

// Sixth Iteration (start = 5, end = 5):
// Loop exits because start is not less than end
