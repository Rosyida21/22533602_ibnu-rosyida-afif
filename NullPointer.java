import java.util.Scanner;

public class NullPointer {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan nama: ");
            String name = scanner.nextLine();

            Integer nameLength = name.length();

            System.out.println("Panjang nama: " + nameLength);
        } catch (NullPointerException e) {
            System.out.println("Nama tidak boleh kososng");
        }
    }
}
