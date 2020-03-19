package lesson02.part02;

import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания. Выведенные числа должны быть разделены пробелом.
 *
 *
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить числа на экран.
 * 3.	Программа должна выводить три числа разделенных пробелами.
 * 4.	Программа должна выводить числа в порядке убывания.
*/

public class Task20 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String q = reader.readLine();
        String w = reader.readLine();
        String e = reader.readLine();
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);
        int c = Integer.parseInt(e);
        if ((a>b)&&(a>c)){
            System.out.print(a+" ");
            if (b>c){
                System.out.print(b+" "+c);
            }
            else if (c>b){
                System.out.print(c+" "+b);
            }
        }
        if ((b>a)&&(b>c)){
            System.out.print(b+" ");
            if (a>c){
                System.out.print(a+" "+c);
            }
            else if (c>a){
                System.out.print(c+" "+a);
            }
        }
        if ((c>a)&&(c>b)){
            System.out.print(c+" ");
            if (a>b){
                System.out.print(a+" "+b);
            }
            else if (b>a){
                System.out.print(b+" "+a);
            }
        }
    }
}
