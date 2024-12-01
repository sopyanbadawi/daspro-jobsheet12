import java.util.Scanner;
public class TugasFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bulan, hamster;
    
        System.out.print("Masukkan berapa bulan pembiakan: ");
        bulan = sc.nextInt();
        System.out.println("Banyak pasangan yang ada yaitu: " + hitungHamster(bulan));
    }


    static int hitungHamster(int bulan){
        int hamster = 1;
        if (bulan <= 1) {
            return bulan;
        }
        return hitungHamster(bulan - 1) + hitungHamster(bulan-2);
    }

}