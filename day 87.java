import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        System.out.println("=== DATA AWAL ===");

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }

        System.out.print("\nMasukkan indeks yang ingin diubah: ");
        int indeks = in.nextInt();

        if (indeks >= 0 && indeks < angka.length) {

            System.out.print("Masukkan nilai baru: ");
            int nilaiBaru = in.nextInt();

            angka[indeks] = nilaiBaru;

            System.out.println("\nData berhasil diubah!");

        } else {
            System.out.println("Indeks tidak valid!");
        }

        System.out.println("\n=== DATA SETELAH DIUBAH ===");

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }

        in.close();
    }
        }
