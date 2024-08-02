import java.util.*;

public class Calculate { 
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
  
    }
    public static int calculatsum(int a , int b){//parameters or formal parameter
        int sum = a + b;
        return sum;
        
     
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = calculatsum(a,b);//arguments or actual parameters
        System.out.println("sum is:"+ x);


       
    }
    
}
//function call
