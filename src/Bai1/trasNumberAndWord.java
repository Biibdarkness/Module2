package Bai1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class trasNumberAndWord {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            int input = scanner.nextInt();
            if (input > 0 && input < 11) {
                System.out.println(from1to10(input));
            }
            if (input > 10 && input < 21) {
                System.out.println(from11to20(input));
            }
            if (input > 20 && input < 100) {
                int dozes = input/10;
                int unit = input%10;
                String dozesString = dozensFrom20to90(dozes);
                String unitString = from1to10(unit);
                System.out.printf("%s-%s\n", dozesString, unitString);
            }
            if (input > 99 && input < 1000){
                int hundreds = input/100;
                int dozes = (input/10)%10;
                int unit = (input%100)%10;
                String hundredsString = hundredsFrom100to900(hundreds);
                String dozesString = dozensFrom20to90(dozes);
                String unitString = from1to10(unit);
                System.out.printf("%s-%s-%s\n", hundredsString, dozesString, unitString);
            }

        }


    }

    public static String from1to10(int number) {
        String letter = "";
        switch (number) {
            case 1:
                letter = "one";
                break;
            case 2:
                letter = "two";
                break;
            case 3:
                letter = "three";
                break;
            case 4:
                letter = "four";
                break;
            case 5:
                letter = "five";
                break;
            case 6:
                letter = "six";
                break;
            case 7:
                letter = "seven";
                break;
            case 8:
                letter = "eight";
                break;
            case 9:
                letter = "nine";
                break;
            case 10:
                letter = "ten";
                break;
            default:
                break;
        }
        return letter;
    }

    public static String from11to20(int number) {
        String letter = "";
        switch (number) {
            case 11:
                letter = "eleven";
                break;
            case 12:
                letter = "twelve";
                break;
            case 13:
                letter = "thirteen";
                break;
            case 14:
                letter = "fourteen";
                break;
            case 15:
                letter = "fifteen";
                break;
            case 16:
                letter = "sixteen";
                break;
            case 17:
                letter = "seventeen";
                break;
            case 18:
                letter = "eighteen";
                break;
            case 19:
                letter = "nineteen";
                break;
            case 20:
                letter = "twenty";
                break;
            default:
                break;
        }
        return letter;
    }

    public static String dozensFrom20to90(int number) {
        String letter = "";
        switch (number) {
            case 2:
                letter = "twenty";
                break;
            case 3:
                letter = "thirty";
                break;
            case 4:
                letter = "fourty";
                break;
            case 5:
                letter = "fifty";
                break;
            case 6:
                letter = "sixty";
                break;
            case 7:
                letter = "seventy";
                break;
            case 8:
                letter = "eighty";
                break;
            case 9:
                letter = "ninety";
                break;
            default:
                break;
        }
        return letter;
    }

    public static String hundredsFrom100to900(int number) {
        String letter = "";
        switch (number) {
            case 1:
                letter = "one hundred";
                break;
            case 2:
                letter = "two hundreds";
                break;
            case 3:
                letter = "three hundreds";
                break;
            case 4:
                letter = "four hundreds";
                break;
            case 5:
                letter = "five hundreds";
                break;
            case 6:
                letter = "six hundreds";
                break;
            case 7:
                letter = "seven hundreds";
                break;
            case 8:
                letter = "eight hundreds";
                break;
            case 9:
                letter = "nice hundreds";
                break;
            default:
                break;
        }
        return letter;
    }

}
