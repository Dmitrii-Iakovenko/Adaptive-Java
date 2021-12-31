// https://stepik.org/lesson/43270/step/1?adaptive=true&thread=solutions&unit=21334
// 1.154 From Roman system into the decimal

import java.util.Scanner;

class Test_21305 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = translateRomanToDecimal(scanner.next().toUpperCase());
        System.out.println(decimal);
    }

    public static int translateRomanToDecimal(String roman) {
        char[] arr = roman.toCharArray();
        int sum = 0, current = 0, next = 0;
        for (int i = 0; i <arr.length-1; i++) {
            current = translateOneRomanCharToDecimal(arr[i]);
            next = translateOneRomanCharToDecimal(arr[i + 1]);
            if (current >= next) {
                sum += current;
            } else if (current == 1 && next == 5 ||  // 4
                    current == 1 && next == 10 || // 9
                    current == 10 && next == 50 || // 40
                    current == 10 && next == 100 || // 90
                    current == 100 && next == 500 || // 400
                    current == 100 && next == 1000) // 900
            {
                sum -= current;
            } else throw new RuntimeException("wrong Roman digit");
        }
        sum += next;
        return sum;
    }


    public static int translateOneRomanCharToDecimal(char roman) {
        int result;

        switch (roman) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                throw new RuntimeException("wrong roman symbol");
        }

        return result;
    }

}
