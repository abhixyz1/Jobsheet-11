import java.net.Socket;
import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        for (int i=1;i <= n; i++ ) {
            for (int j=1; j <= n; j++) {
                if (i==1||i==n||j==1||j==n) {
                    System.out.print(n);
                }
                else{
                    System.out.print(" ");
                }
            } 
        System.out.println();
        }
        System.out.print("");
    }
}
