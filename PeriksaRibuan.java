import java.util.Scanner;

public class PeriksaRibuan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukkan tiga buah integer: ");
        int angka = myObj.nextInt();

        int temp = 1;

        while(angka > 0){
            int sisa = angka % 10;

            if(sisa > 0){
                switch(temp){
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
            temp++;
        }

        myObj.close();
    }
}