// Buatlah algoritma dalam bahasa Java, menulis sebuah program yang akan mencetak
// berbagai output sebagai berikut, tergantung nilai N yang dibaca. N dapat berharga
// antara 1 s.d. 1000:

import java.util.Scanner;

public class CetakBintang {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int batas = myObj.nextInt();

        if(batas >= 1 && batas <= 1000){
            for(int i = 1; i <= batas; i++){
                for(int j = 0; j < i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else{
            System.out.println("Hanya dapat mencetak antara 1 - 1000");
        }

        myObj.close();
    }
}
