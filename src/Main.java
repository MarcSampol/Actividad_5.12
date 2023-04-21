import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a[][] = bidimensional();
        //System.out.println(Arrays.deepToString(a));
    }
    
    public static int[][] bidimensional () {
        int a[][] = new int[5][5];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                a[i][j] = 10 * i + j;
            }
        }

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("hola");
        return a;
    } 
}