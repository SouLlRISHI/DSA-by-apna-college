import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();
        String check = ( mark >= 33 )? "pass":"fail";
        System.out.println(check);
    }
    
}
