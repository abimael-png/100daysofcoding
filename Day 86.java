import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        System.out.print("masukkan angka yang dicari: ");
        int cari = in.nextInt();

        boolean p= false;

        for (int i = 0; i < angka.length; i++) {

            if (angka[i] == cari) {
                p = true;

                System.out.println("angka ditemukan!");
                System.out.println("indeks: " + i);

                break;
            }
        }

        if (!p) {
            System.out.println("angka tidak ditemukan");
        }

        in.close();
    }
}
