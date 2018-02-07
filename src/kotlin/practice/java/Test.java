package practice.java;

import practice.FunKt;
import practice.Person;

/**
 * @author keshawn
 * @date 2018/2/1
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("fkx", false);
        System.out.println(person.getName());
        System.out.println(person.isMarried());
        int max = FunKt.max(2, 6);
        System.out.println(max);
        boolean b;
        System.out.println(b = true ? true : false);
    }
}
