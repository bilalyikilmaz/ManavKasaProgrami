import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        // Manav Birim Fiyatları
        double armutbf = 2.14, elmabf = 3.67, domatesbf = 1.11, muzbf = 0.95, patlicanbf = 5.00;

        // Değişkenler
        double armut, elma, domates, muz, patlican, toplam;

        // Kullanıcıdan Kg Verilerinin Alınması
        System.out.print("Armut Kaç Kilo ? :");
        Scanner veri = new Scanner(System.in);
        armut = veri.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma = veri.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates = veri.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz = veri.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = veri.nextDouble();

        // Hesaplamalar
        System.out.println("Armut: " + armut * armutbf +" TL");
        System.out.println("Elma: " + elma * elmabf);
        System.out.println("Domates: " + domates * domatesbf+" TL");
        System.out.println("Muz: " + muz * muzbf);
        System.out.println("Patlıcan: " + patlican * patlicanbf+" TL");
        toplam = armut * armutbf + elma * elmabf + domates * domatesbf + muz * muzbf + patlican * patlicanbf;
        System.out.println("Toplam: " + toplam+" TL");

    }
}
