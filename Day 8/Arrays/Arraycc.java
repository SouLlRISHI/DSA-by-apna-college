import java.util.*;
public class Arraycc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[]= new int [100];
       marks[0]= sc.nextInt();
       marks[1]=sc.nextInt();
       marks[2]=sc.nextInt();
       // System.out.println("math = "+ marks[0]);
        //System.out.println("accountancy = "+ marks[1]);
        //System.out.println("bms = "+ marks[2]);
        int totalMarks = marks[0] + marks[1] + marks[2];
        int percentage = totalMarks / 3;
        System.out.println(percentage + "%");
        sc.close();
    }
    

}
