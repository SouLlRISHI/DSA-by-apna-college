public class Hollow {

public static void printHollowRectangle(int totalrows, int totalcols) {
    for (int i = 1; i <=totalrows; i++ ){
        for(int j = 1; j<=totalcols; j++){
            if(i == 1 || i ==totalrows || j == 1 || j == totalcols){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
       
        }  System.out.println();
    }
    
}
public static void main(String[] args) {
    printHollowRectangle(4,6);
}
}