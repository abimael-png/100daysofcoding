public class Main {
    public static void main(String[] args) {

        int[] angka = {15, 30, 10, 50, 25};

        int terkecil = angka[0];

        for (int i = 1; i < angka.length; i++) {

            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        System.out.println("Angka terkecil: " + terkecil);
    }
}
