

public class Swap {
     public static void swap(int a, int b){
        int swap = a;
         a = b;
         b = swap;
        System.out.println(a);
        System.out.println(b);

     }


    public static void main (String args[]){
        //swap - value exchange
        int a = 10;
        int b = 5;
        swap(a,b);
        
    }
    
    
}
