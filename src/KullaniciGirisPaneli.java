import java.util.Scanner;

public class KullaniciGirisPaneli {
    public static void main(String[] args) {
        String userName,password;
        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanici Adiniz : ");
        userName=inp.nextLine();

        System.out.print("Sifreniz : ");
        password=inp.nextLine();

        if (userName.equals("Jacob")&&password.equals("1234")){
            System.out.print("Giris Basarili...");

        }else{
            System.out.println("Kullanici adi veya sifre hatali.Lutfen tekrar deneyiniz...");
        }
    }
}
