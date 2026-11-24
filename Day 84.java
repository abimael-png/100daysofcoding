public class Main {
    public static void main(String[] args) {

        int[] angka = {15, 30, 10, 50, 25};

        int terbesar = angka[0];

        for (int i = 1; i < angka.length; i++) {

            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }

        System.out.println("nilai terbesar: " + terbesar);
    }
             }
