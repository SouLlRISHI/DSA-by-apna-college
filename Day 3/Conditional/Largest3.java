import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int c = 10;
        if ((a >=b) && (a >=c) ) { 
           System.out.println("a largest");
            
        }
        else if( b >= c){
            System.out.println("b largest");
        }
        else {
            System.out.println("c largest");
        }

    }
    
}

//print the largest of 3 numbers