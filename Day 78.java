import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        
        System.out.println("BUAT AKUN");

        System.out.print("Buat username: ");
        String username = in.nextLine();

        System.out.print("Buat password: ");
        String password = in.nextLine();

        System.out.println("akun berhasil dibuat");

        
        System.out.println("===== LOGIN =====");

        String userLogin;
        String passLogin;

        while (true) {

            System.out.print("Masukkan username: ");
            userLogin = in.nextLine();

            System.out.print("Masukkan password: ");
            passLogin = in.nextLine();

            if (userLogin.equals(username) &&
                passLogin.equals(password)) {

                System.out.println("Login berhasil!");
                break;

            } else {
                System.out.println("Username atau password salah!");
                System.out.println("Silakan coba lagi.");
            }
        }

        in.close();
    }
}
