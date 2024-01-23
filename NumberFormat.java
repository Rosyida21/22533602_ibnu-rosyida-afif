import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan angka: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Angka yang dimasukkan: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Inputan anda salah!!");
        }
    }
}
