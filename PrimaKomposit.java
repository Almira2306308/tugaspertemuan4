import java.util.Scanner;

public class PrimaKomposit {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = myObj.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = myObj.nextInt();

        Boolean prima;

        System.out.print("\nBilangan prima " + batasAwal + " sd "+ batasAkhir + " adalah ");

        for(int i = batasAwal; i <= batasAkhir; i++){
            prima = true;

            if(i > 1){
                for(int j = 2; j <= i / 2; j++){
                    if(i % j == 0){
                        prima = false;
                        break;
                    }
                }
                if(prima){
                    System.out.print(i + " ");
                }
            }
        }

        System.out.print("\nBilangan komposit " + batasAwal + " sd "+ batasAkhir + " adalah ");
        
        for(int i = batasAwal; i <= batasAkhir; i++){
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0){
                    prima = false;
                    System.out.print(i + " ");
                    break;
                }
            }
        }

        myObj.close();
    }
}
