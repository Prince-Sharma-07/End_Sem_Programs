package End_sem_Programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a = 0 , b = 1 , c = 0;
        for(int i = 0; i<n; i++){
            a = b;
            b = c;
            c = a+b;
            System.out.print(c + " ");
        }
        sc.close();
    }
}
