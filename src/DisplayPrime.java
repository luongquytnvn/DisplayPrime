import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to ban muon in ra:");
        int number = scanner.nextInt();
        int count = 1;
        for (int i = 2 ; count <= number;i++ ) {
            if (checkPrime(i)) {
                System.out.print(i+" ");
                count++;
            }
        }
    }
    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (int i=2;i<num;i++) {
                if (num%i==0) {
                    return false;
                }
            }
            return true;
        }
    }
}
