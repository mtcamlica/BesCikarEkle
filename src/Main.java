import java.util.Scanner;

public class Main {
    static void cikar (int sayi) {
        System.out.print(sayi + " ");
        if (sayi > 0) {
            cikar(sayi - 5);
        }
        System.out.print(sayi + " ");
    }

    public static void main(String[] args) {

        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        sayi = input.nextInt();

        cikar(sayi);
    }
}
