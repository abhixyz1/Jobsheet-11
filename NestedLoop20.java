import java.util.Scanner;
public class NestedLoop20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [][] temps = new double [5][7];
        double total = 0, rata = 0;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();  
                // total+= temps[i][j];
                // rata = total/temps[0].length;
            }
            // System.out.println(total);
            // System.out.println(rata);
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                total+=temps[i][j];
                rata = total/temps[0].length;
            }
            System.out.println();
            System.out.println("Rata-rata dari city ke-"+ (i) + " adalah " + rata);
        }

        // for (double[] ds : temps) {
        //     for (double ds2 : ds) {
        //         System.out.println(ds2+" ");
        //     }
        // }
    }
}
