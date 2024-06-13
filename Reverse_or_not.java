package End_sem_Programs;
import java.util.Scanner;
public class Reverse_or_not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1 = in.next();
        System.out.println("Enter String 2: ");
        String s2 = in.next();

        int l1 = s1.length();
        int l2 = s2.length();

        int MinLen = Math.min(l1,l2);
        boolean flag = true;

        for(int i = 0; i<MinLen; i++){
            if(s1.charAt(i) != s2.charAt(l2-i-1)){
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("S2 is the reverse of s1");
        else System.out.println("S2 is not the reverse of s1");
    }
}
