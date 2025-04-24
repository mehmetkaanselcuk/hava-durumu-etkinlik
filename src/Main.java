import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklığı girin: ");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Etkinlik önerisi: Kayak");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Etkinlik önerisi: Sinema");
        } else if (sicaklik >= 15 && sicaklik <= 25) {
            System.out.println("Etkinlik önerisi: Piknik");
        } else {
            System.out.println("Etkinlik önerisi: Yüzme");
        }


    }
}
