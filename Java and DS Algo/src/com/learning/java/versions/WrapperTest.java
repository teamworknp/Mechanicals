package com.learning.java.versions;

import java.util.Comparator;

public class WrapperTest implements Comparator<Integer> {
/*    static Integer i;

    static{
        i =12
    }*/

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(12);
        Integer i2 = Integer.valueOf(12);
        Integer i3 = Integer.valueOf(12);
        Integer i4 = Integer.valueOf(13);
        Integer i5 = Integer.valueOf(18);
        Integer i6 = Integer.valueOf(14);
        System.out.println(Integer.valueOf(42).compareTo(Integer.valueOf(42))); // 0
        System.out.println(i3.compareTo(i4)); // -1
        System.out.println(i5.compareTo(i6)); //1


    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 < o2 ? -1 : (o1 == o2 ? 0 : 1);
    }

}
