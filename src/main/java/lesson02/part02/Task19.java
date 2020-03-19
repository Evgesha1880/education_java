package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них. Если числа равны между собой, необходимо вывести любое.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить на экран максимальное из четырёх чисел.
 * 4.	Если максимальных чисел несколько, необходимо вывести любое из них.
 */

public class Task19 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String q = reader.readLine();
        String w = reader.readLine();
        String e = reader.readLine();
        String r = reader.readLine();
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);
        int c = Integer.parseInt(e);
        int d = Integer.parseInt(r);
        if ((a>b)&&(a>c)&&(a>d)){
            System.out.println(a);
        }
        if ((b>a)&&(b>c)&&(b>d)){
            System.out.println(b);
        }
        if ((c>b)&&(c>a)&&(c>d)){
            System.out.println(c);
        }
        if ((d>b)&&(d>c)&&(d>a)){
            System.out.println(d);
        }
        else {
            System.out.println(a);
        }
    }
}
