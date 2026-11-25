public class Main {
    public static void main(String[] args) {

        int[] angka = {25, 10, 40, 5, 30};

        int terkecil = angka[0];

        for (int i = 1; i < angka.length; i++) {

            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        System.out.println("Angka terkecil: " + terkecil);
    }
}
