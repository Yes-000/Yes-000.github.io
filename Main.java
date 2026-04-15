import java.util.Scanner;

public class Main {
    public static int sigma(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = sigma(n);
        System.out.println(res);
    }
}
