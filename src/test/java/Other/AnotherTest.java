package Other;

import java.util.Scanner;

public class AnotherTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number from 1 to 7");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if(num == 1) {
                System.out.println("Monday");
            }
        } else if(scanner.hasNext()) {
            System.out.println("Don't cheat. Type a number");
        }
        }
//        while (!scanner.hasNext("quit")) {
//            System.out.println(
//                    scanner.hasNextInt() ? "The Input text is int: " + scanner.nextInt() :
//                            scanner.hasNextLong() ? "The Input text is long: " + scanner.nextLong() :
//                                    scanner.hasNextDouble() ? "The Input text is double: " + scanner.nextDouble() :
//                                            scanner.hasNextBoolean() ? "The Input text is boolean: " + scanner.nextBoolean() :
//                                                    "The Input text is String: " + scanner.next());
//        }
    }


//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter some number from 1 to 10");
//        String text = s.nextLine();
//        int num = Integer.parseInt(text);
//        if (text instanceof String) {
//            System.out.println("Don't cheat. Enter some number from 1 to 10");
//        }
//
//
//
//        if (num > 10) {
//            System.out.println("Don't cheat! Choose some number from 1 to 10");
//        } else if (num <= 5) {
//            System.out.println("Your day will be nice");
//        }
//        else if (num > 5) {
//            System.out.println("Your day will be very nice");
//        }
//    }



