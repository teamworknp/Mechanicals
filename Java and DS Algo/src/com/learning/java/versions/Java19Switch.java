package com.learning.java.versions;

import static java.util.Calendar.*;

public class Java19Switch {

    public String exampleOfIF(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }

    public static void switchCase(String animal){
        String result;
        final String dog="DOG";
        final String cat="CAT";

        switch (animal) {
            case dog: //compiles
                result = "domestic animal";
            case "CAT": //does not compile
                result = "feline";
        }
    }

    public static int switchCase1(int month) {
     switch (month) {
            case JANUARY, JUNE, JULY -> {
                return 3;
            }
            default -> {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        int month = 2;
        var result = switch (month) {
            case JANUARY, JUNE, JULY -> 3;
            case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
            case MARCH, MAY, APRIL, AUGUST -> {
                int monthLength = String.valueOf(month).length();
                System.out.println("monthLength: " + monthLength);
                yield monthLength * 4;
            }
            default -> 0;
        };

        System.out.println("switch "+ result);
    }
}
