import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        char menu = 'y';
        
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
                if (success = (answer == number)){
                    System.out.println("Tebakan anda benar");
                }
                    if (answer > number ) {
                    System.out.println(answer + " Lebih besar dari angka tebakan");
                    } else if (answer < number) {
                    System.out.println(answer+ " Lebih kecil dari angka tebakan");
                }
            } while (!success);
            System.out.println("Apakah anda ingin mengulang permainan (Y/T)");
            menu = input.next().charAt(0);  
            input.nextLine();   
            } while (menu == 'Y' || menu == 'y');
        }   
}