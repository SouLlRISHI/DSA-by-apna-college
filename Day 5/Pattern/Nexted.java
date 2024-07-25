public class Nexted {
    public static void main(String[] args) {
        for (int i =1; i <= 100; i++){
            for (int star =1; star <= i; star++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
// loop inside another loop