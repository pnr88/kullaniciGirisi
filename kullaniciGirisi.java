import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName,select;
        String password;

        Scanner imput=new Scanner(System.in);

        System.out.print("Kullanıcı adınız=");
        userName= imput.nextLine();
        System.out.print("Şifreniz=");
        password= imput.nextLine();

        if(userName.equals("patika")&&password.equals("java123")){
            System.out.print("Giriş yaptınız !");
        }else {
            System.out.println("Bilgileriniz yanlış !");
            System.out.print("Şifreni sıfırlamak ister misin?");

            select=imput.nextLine();
            if(select.equals("evet")) {

            String yenisifre ;
            System.out.print("Yeni şifreniz=");
            yenisifre=imput.nextLine();
            if(yenisifre.equals("java123")){
                System.out.print("Şifre oluşturulamadı.");
                System.out.println("Yeni girdiğiniz şifrenin unuttuğunuz şifre ile aynı olmaması gerek.");
            }else {
                System.out.print("Şifre oluşturuldu.");
            }

               }


            }

        }




    }

