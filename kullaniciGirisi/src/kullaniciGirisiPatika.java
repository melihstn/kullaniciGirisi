import java.util.Scanner;

public class kullaniciGirisiPatika {
    public static void main(String[] args) {

        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("kullanıcı adını giriniz: ");
        userName = inp.nextLine();


        System.out.print("şifreyi giriniz :");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.print("giriş yaptınız!");
        } else{
            System.out.print("hatalı bilgi girdiniz !");
        }

    }
}
