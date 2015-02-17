package com.google.guava.api;

/**
 *
 * @author ajay
 */

public class ToStringHelperExample {

    public static void main(String args[]) {
        Employee employee = new Employee("ajay",46,"Java");
        System.out.println("=====formatted output======="+employee.toString());
    }
}
