import java.util.Scanner;

public class Latihan_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input nama dari user
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.println("\nEjaan untuk \"" + nama + "\" adalah:");

        // Mengeja nama per huruf
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
    }
}
