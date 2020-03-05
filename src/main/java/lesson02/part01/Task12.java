package lesson02.part01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
 * Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
 * МылаРамуМама
 * РамуМамаМыла
 * ...
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Выведенный текст должен содержать 6 строк.
 * 3.	Текст в каждой строке должен быть уникален.
 * 4.	Должны быть выведены все возможные комбинации.
 */

public class Task12 {
    public static void main(String[] args) {
        String a="Мама";
        String b="Мыла";
        String c="Раму";
        System.out.println(a+b+c);
        System.out.println(a+c+b);
        System.out.println(b+a+c);
        System.out.println(c+a+b);
        System.out.println(c+b+a);
        System.out.println(b+c+a);
    }
}
