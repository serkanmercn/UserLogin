import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        username = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123") ){
            System.out.print("Giriş Yaptınız!");
        }else {
            System.out.println("Bilgileriniz Yanlış");



        }
    }

}