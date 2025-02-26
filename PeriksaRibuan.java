// Buatlah algoritma dalam bahasa Java, yang menerima masukan berupa 3 buah integer,
// periksa apakah masukan adalah ribuan, ratusan, puluhan, atau satuan.

import java.util.Scanner;

public class PeriksaRibuan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int posisi = 1;

        System.out.print("Masukkan angka: ");
        int angka = myObj.nextInt();


        while(angka > 0){
            int sisa = angka % 10;

            if(sisa > 0){
                switch(posisi){
                    case 1:
                        System.out.println("\n" + sisa + " adalah satuan");
                        break;
                    case 2:
                        System.out.println(sisa + " adalah puluhan");
                        break;
                    case 3:
                        System.out.println(sisa + " adalah ratusan");
                        break;
                    case 4:
                        System.out.println(sisa + " adalah ribuan");
                        break;
                }
            }
            angka = angka / 10;
            posisi++;
        }

        myObj.close();
    }
}