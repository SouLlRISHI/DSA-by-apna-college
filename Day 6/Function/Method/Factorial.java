public class Factorial {
    public static void main(String args[]){
        System.out.println(Fact(4));
        
    }
    public static int Fact(int n) {
        int f = 1;
        for(int i=1; i <= n ; i++){
         f= f * i;
        }
        return f;
        
    } 
}
