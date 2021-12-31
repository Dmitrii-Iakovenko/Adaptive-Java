import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;

// https://stepik.org/lesson/43166/step/1?adaptive=true&unit=21230
// 1.51 The average value
class Test_21230 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OptionalDouble average = DoubleStream.generate(scanner::nextInt)
                .takeWhile(value -> value != 0)
                .average();
        average.ifPresent(System.out::println);
    }
}
