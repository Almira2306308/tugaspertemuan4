import java.util.Scanner;

public class CetakBintang {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int batas = myObj.nextInt();

        for(int i = 1; i <= batas; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        myObj.close();
    }
}
