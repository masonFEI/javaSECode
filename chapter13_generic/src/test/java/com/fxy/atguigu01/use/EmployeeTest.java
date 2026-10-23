/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu01.use;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * EmployeeTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-23 22:05
 */
public class EmployeeTest {


    @Test
    public void test1() {
        TreeSet<Employee> set = new TreeSet<>();
        Employee e1 = new Employee("HanMeimei", 18, new MyDate(1998, 12, 21));
        Employee e2 = new Employee("LiLei", 20, new MyDate(1996, 12, 21));
        Employee e3 = new Employee("LiHua", 21, new MyDate(2000, 12, 21));
        Employee e4 = new Employee("ZhangLei", 19, new MyDate(1997, 12, 21));
        Employee e5 = new Employee("ZhangYi", 23, new MyDate(2001, 12, 21));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2() {

        Comparator<Employee> comparator = new Comparator<Employee>() {
            /**
             * Compares its two arguments for order.  Returns a negative integer,
             * zero, or a positive integer as the first argument is less than, equal
             * to, or greater than the second.<p>
             * <p>
             * In the foregoing description, the notation
             * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
             * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
             * <tt>0</tt>, or <tt>1</tt> according to whether the value of
             * <i>expression</i> is negative, zero or positive.<p>
             * <p>
             * The implementor must ensure that <tt>sgn(compare(x, y)) ==
             * -sgn(compare(y, x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
             * implies that <tt>compare(x, y)</tt> must throw an exception if and only
             * if <tt>compare(y, x)</tt> throws an exception.)<p>
             * <p>
             * The implementor must also ensure that the relation is transitive:
             * <tt>((compare(x, y)&gt;0) &amp;&amp; (compare(y, z)&gt;0))</tt> implies
             * <tt>compare(x, z)&gt;0</tt>.<p>
             * <p>
             * Finally, the implementor must ensure that <tt>compare(x, y)==0</tt>
             * implies that <tt>sgn(compare(x, z))==sgn(compare(y, z))</tt> for all
             * <tt>z</tt>.<p>
             * <p>
             * It is generally the case, but <i>not</i> strictly required that
             * <tt>(compare(x, y)==0) == (x.equals(y))</tt>.  Generally speaking,
             * any comparator that violates this condition should clearly indicate
             * this fact.  The recommended language is "Note: this comparator
             * imposes orderings that are inconsistent with equals."
             *
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             * @return a negative integer, zero, or a positive integer as the
             * first argument is less than, equal to, or greater than the
             * second.
             * @throws NullPointerException if an argument is null and this
             *                              comparator does not permit null arguments
             * @throws ClassCastException   if the arguments' types prevent them from
             *                              being compared by this comparator.
             */
            @Override
            public int compare(Employee o1, Employee o2) {
                int year = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if (year != 0) {
                    return year;
                }

                int month = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if (month != 0) {
                    return month;
                }

                return o1.getBirthday().getDay() - o2.getBirthday().getDay();
            }
        };

        TreeSet<Employee> set = new TreeSet<>(comparator);
        Employee e1 = new Employee("HanMeimei", 18, new MyDate(1998, 12, 20));
        Employee e2 = new Employee("LiLei", 20, new MyDate(1996, 12, 21));
        Employee e3 = new Employee("LiHua", 21, new MyDate(2001, 12, 25));
        Employee e4 = new Employee("ZhangLei", 19, new MyDate(1997, 12, 21));
        Employee e5 = new Employee("ZhangYi", 23, new MyDate(2001, 12, 21));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
