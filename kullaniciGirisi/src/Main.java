import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, selected,newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptnız!");
        }else {
            System.out.println("Bilgiler yanlış!");
            System.out.println("Şifrenizi unuttuysanız 'q' ye basınız");
            selected = inp.nextLine();

            if(selected.equals("q")){
                System.out.print("Yeni şifrenizi giriniz : ");
                newPassword = inp.nextLine();

                if(newPassword.equals("java123")){
                    System.out.println("Şifreniz bir önceki şifreyle aynı olamaz. Lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu.");
                }

            }

        }
    }
}




















