import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double boy,kilo,endeks;

    Scanner inp=new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy=inp.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz:");
        kilo=inp.nextDouble();

        endeks=kilo/(boy*boy);

        System.out.println("Vucut Kitle Endeksiniz : "+endeks);

    }
}
