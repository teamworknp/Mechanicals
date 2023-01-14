package com.learning.java.versions;

import java.util.function.Predicate;

public class Wellwisher {

        public static void wish(Greeting greeting) {
            greeting.greet();
        }

        public static void main(String args[]) {
            Greeting hindiGreeting = new HindiGreeting();
            wish(hindiGreeting);  // Passing an object of HindiGreeting.

            Greeting englishGreeting = new EnglishGreeting();
            wish(englishGreeting);  // Passing an object of EnglishGreeting.

            Predicate<Integer> agePredicate = age ->(age>18);

            System.out.println(agePredicate.test(1));
        }
    }

