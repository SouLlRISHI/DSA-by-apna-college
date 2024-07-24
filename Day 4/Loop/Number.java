import java.util.*;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int n = sc.nextInt();
        while ( counter <= n) {
            System.out.print(counter++ + " ");
        }
        sc.close();
    }
    
}
// print number from user