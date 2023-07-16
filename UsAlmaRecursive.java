package CaglaSonmez;

import java.util.Scanner;

public class UsAlmaRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int taban = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = input.nextInt();

        int sonuc = usAlma(taban, us);
        System.out.println("Sonuç: " + sonuc);
    }
    public static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us == 1) {
            return taban;
        }else {
            return taban * usAlma(taban, us - 1);
        }
    }
}
