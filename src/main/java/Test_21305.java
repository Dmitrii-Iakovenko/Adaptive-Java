// https://stepik.org/lesson/43270/step/1?adaptive=true&thread=solutions&unit=21334
// 1.154 From Roman system into the decimal

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Test_21305 {
    public static void main(String[] args) {
        // put your code here
        String[] s = new Scanner(System.in).nextLine().split("");
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        int sum = 0, cur = 0;
        for (int i = 0; i < s.length; i++) {
            cur = roman.get(s[i]);
            if (i < s.length - 1 && roman.get(s[i + 1]) > cur) cur = -cur;
            sum += cur;
        }
        System.out.println(sum);

    }
}