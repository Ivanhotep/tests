package Other;

import java.util.Scanner;

public class Weeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number from 1 to 7");
        int num = scanner.nextInt();
        if(num < 1 || num > 7) {
            System.out.println("error");
        } else if(num == 1) {
            System.out.println("Monday");
        } else if (num == 2) {
            System.out.println("Tuesday");
        }
        else if (num == 3) {
            System.out.println("Wednesday");
        }
        else if (num == 4) {
            System.out.println("Thursday");
        }
        else if (num == 5) {
            System.out.println("Friday");
        }
        else {
            System.out.println("Holidays");
        }
    }
}
