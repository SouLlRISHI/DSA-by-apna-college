public class Reverse {
    public static void main(String[] args) {
        int num = 10889;
        while( num > 0){
            int lastdigit = num % 10;
            System.out.print(lastdigit + "");
        num = num/10;
        
        }
        System.out.println(num);
    }
}