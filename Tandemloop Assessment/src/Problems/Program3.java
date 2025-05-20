package Problems;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a;
        int count = 0;
        int num = 1;

        while (count < limit) {
            System.out.print(num);
            count++;
            num += 2;
            if (count < limit) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
