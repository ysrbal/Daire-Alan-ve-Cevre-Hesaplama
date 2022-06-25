import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int r, merkezaci;
    double pi=3.14, cevre, alan, dilimalan;

    System.out.print("Yaricapi Giriniz : ");
    r = input.nextInt();

    System.out.print("Merkez Aciyi Giriniz : ");
    merkezaci = input.nextInt();

    cevre = 2*pi*r;
    alan=pi*r*r;
    dilimalan = (pi*(r*r)*merkezaci)/360;

    System.out.println("Dairenin Cevresi : " + cevre + " metre");
    System.out.println("Dairenin Alani : " + alan + " metrekare");
    System.out.println("Dairenin Dilim Alani : " + dilimalan + " metrekare");






    }
}
