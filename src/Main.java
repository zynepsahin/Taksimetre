import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double km, total = 10, perKm = 2.20;

        System.out.print("Mesafeyi km cinsinden giriniz:");
        km = inp.nextDouble();

        total += (km * perKm);

        total = total <= 20 ? 20 : total;
        System.out.print("Toplam Tutar:" + total);

    }
}
