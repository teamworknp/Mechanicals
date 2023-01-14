package com.learning.java.versions;

class MyException extends Exception {

    MyException(String message) {
        super(message);
    }

}

public class ExceptionHandlingDemo {

    public static void methodA() throws MyException {
        throw new MyException("A customer exception");
    }

    public static int methodB(int argument) throws MyException {
        int result = 1 / argument;
        methodA();
        return result;
    }

    public static void main(String[] args) {
        try {
            String output = "this result is" + methodB(1);
            System.out.println(output);

        } catch (MyException e) {
            System.out.println(e);
        }
    }

}
