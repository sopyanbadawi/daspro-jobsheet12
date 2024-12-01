import java.util.Scanner;

public class Percobaan2 {
    
    static int hitungPangkat (int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    
    static int tampilan(int x, int y){
        int temp = x;
        if (y == 0){
            temp = 1;
        }else{
            temp = tampilan(x, y - 1);
            System.out.print(x + "x");
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat, deret;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        deret = hitungPangkat(bilangan, pangkat);
        System.out.println(tampilan(bilangan, pangkat) + "=" + deret);
    }
}
