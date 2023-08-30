import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        FORMÜL
        1- çevre = 2u
        2- alan*alan = u*(u-a)*(u-b)*(u-c)
         */
        Scanner sc = new Scanner(System.in);
        int taban, yukseklik;
        double hipotenus, cevre, alani, u;
        System.out.print("Üçkenin Yüksekliğini Giriniz : ");
        yukseklik = sc.nextInt();
        System.out.print("Üçkenin Taban Uzunluğunu Giriniz : ");
        taban = sc.nextInt();
        hipotenus = Math.sqrt((taban*taban)+(yukseklik*yukseklik));
        u = (taban+yukseklik+hipotenus)/2;
        cevre = 2*u;
        alani = Math.sqrt(u*(u-yukseklik)*(u-taban)*(u-hipotenus));
        System.out.println("------------------------------------------------------------");

        System.out.println("Hipotenüs : "+ hipotenus);
        System.out.println( "Üçgenin alanı : "+alani);
        System.out.println("Üçgenin çevresi : "+cevre);
    }
}