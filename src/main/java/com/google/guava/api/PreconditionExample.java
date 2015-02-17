package com.google.guava.api;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author ajay
 */
public class PreconditionExample {

    public static void plainJavaValidation(String name, int start, int end) {
        // Preconditions
        if (null == name) {
            throw new NullPointerException("Name must not be null");
        }

        if (start >= end) {
            throw new IllegalArgumentException("Start (" + start + ") must be smaller than end (" + end + ")");
        }

        // Do something here ...
    }

    public static void guavaPreconditions(String name, int start, int end) {
        // Preconditions
        checkNotNull(name, "Name must not be null");
        checkArgument(start < end, "Start (%s) must be smaller than end (%s)", start, end);

        // Do something here ...
    }

    public static void main(String[] args) {

        // Case : PlainJavaValidation
        System.out.println("\n==== Case 1: Plain Java Validation ==========================");
        PreconditionExample.plainJavaValidation("abc", 2, 10);
        try {
            PreconditionExample.plainJavaValidation("abc", 12, 10);
        } catch (final RuntimeException ex) {
            System.out.println("PlainJavaValidation(\"abc\", 12, 10)\n\t" + ex);
        }
        try {
            PreconditionExample.plainJavaValidation(null, 2, 10);
        } catch (final RuntimeException ex) {
            System.out.println("PlainJavaValidation(null, 2, 10)\n\t" + ex);
        }

        // Case : GuavaPreconditions
        System.out.println("\n==== Case 2: Guava Preconditions ============================");
        PreconditionExample.guavaPreconditions("abc", 2, 10);
        try {
            PreconditionExample.guavaPreconditions("abc", 12, 10);
        } catch (final RuntimeException ex) {
            System.out.println("GuavaPreconditions(\"abc\", 12, 10)\n\t" + ex);
        }
        try {
            PreconditionExample.guavaPreconditions(null, 2, 10);
        } catch (final RuntimeException ex) {
            System.out.println("GuavaPreconditions(null, 2, 10)\n\t" + ex);
        }
    }

}
