public class Pyramid {
    public static void half(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
          // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        half(7);
    }
}
