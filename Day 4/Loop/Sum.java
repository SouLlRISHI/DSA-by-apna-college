import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1 ;
        int n = sc.nextInt() ;
        int sum = 0;
        while( i<= n){
            sum +=i;
            i++;

        }

        System.out.println(sum);
    }
}
//calculate the sum of the natural numbers