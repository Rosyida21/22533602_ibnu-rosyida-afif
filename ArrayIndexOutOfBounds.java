import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan panjang array: ");
            int arrayLength = scanner.nextInt();

            int[] myArray = new int[arrayLength];

            System.out.print("Masukkan indeks yang akan diakses: ");
            int index = scanner.nextInt();

            int value = myArray[index];

            System.out.println("Nilai di indeks " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks di luar batas array");
        }
    }
}
