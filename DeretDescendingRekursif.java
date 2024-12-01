import java.util.Scanner;
public class DeretDescendingRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
    
        System.out.print("Masukkan angka awal: ");
        angka = sc.nextInt();
    
        System.out.println(deretRekursif(angka) + " Ini Rekursif");
        System.out.print(deretIteratif(angka) + " Ini Iteratif " );
    }

    static int deretRekursif (int n) {
        int temp;
        if (n == 0) {
            temp = 0;
        } else {
            System.out.print (n + " ");
            temp = (deretRekursif(n - 1));
        }
        return temp;
    }

    static int deretIteratif (int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + " " );
        }
        return 0;
    }

}
