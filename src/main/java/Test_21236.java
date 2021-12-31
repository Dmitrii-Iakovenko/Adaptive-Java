// https://stepik.org/lesson/43172/step/1?adaptive=true&unit=21236
// 1.57 The longest word

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Test_21236 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maxLengthWord = Arrays.stream(scanner.nextLine().split(" "))
                .max(Comparator.comparing(String::length)).orElse("");
        System.out.println(maxLengthWord);
    }
}
