import java.util.Scanner;

public class Porseni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Voli"};
        String[][] atlet = new String[4][5];

        for (int i = 0; i < atlet.length; i++) {
            System.out.println("Masukkan data atlet " + cabangOlahraga[i]);
            for (int j = 0; j < atlet[i].length; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                atlet[i][j] = sc.next();
            }
        }

        System.out.println("\nData atlet yang dimasukan");
        System.out.println("-----------------------------");
        System.out.println("Cabang Olahraga \t| Nama");
        for (int i = 0; i < atlet.length; i++) {
            System.out.println(cabangOlahraga[i]);
            for (int j = 0; j < atlet[i].length; j++) {
                System.out.println("\t\t\t| " + atlet[i][j]);
            }
        }
    }
}
