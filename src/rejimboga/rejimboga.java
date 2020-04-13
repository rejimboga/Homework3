package rejimboga;

import java.util.Scanner;

public class rejimboga {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Радіус кола:");
        int s1 = scanner.nextInt();

        System.out.println("Довжина кола:");
        double a = (2 * Math.PI * s1);
        System.out.println(a);
    }

}