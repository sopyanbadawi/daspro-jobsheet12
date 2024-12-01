import java.util.Scanner;
public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan Angka: ");
        angka = sc.nextInt();

        System.out.println("Jumlah Deret Angka: ");
        tampilJumlah(angka);
        System.out.println("\b = " + penjumlahanRekursif(angka));
    }
    
    static int penjumlahanRekursif(int n) {
        int temp = n;
        if (n == 0) {
            temp = n;
        } else {
            temp += penjumlahanRekursif(n - 1);
        }
        return temp;
    }

    static void tampilJumlah(int n) {
        if (n == 0) {
            return;
        } else {
            tampilJumlah(n - 1);
            System.out.print(n);
            if (n >= 1) {
                System.out.print("+");
            }
        }
    }

}
