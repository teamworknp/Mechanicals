package com.study.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* //HEART,EARTH - TRUE
//CREATIVE,REACTIVE - TRUE
//TREE,TERR - FALSE
//TOM,TOMAS - FALSE


* */
public class PAMDemo {

    public static boolean validate(String s1, String s2){
        if(s1.length() < s2.length() || s1 ==null || s2 ==null){
            return false;
        }

        char[] c1 = s1.toLowerCase().trim().toCharArray();
        char[] c2 = s2.toLowerCase().trim().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean isValid = Arrays.equals(c1,c2);
        return isValid;
    }


//    public static List<String> functionJava(List<List<Integer>> list){
//
//
//  return new ArrayList;
//    }

    public static void main(String[] args) {

        String s1 ="HEART";
        String s2 ="EARTH";

        System.out.println(validate(s1,s2));

        //{H=1, E=1, A=1, R=1 , T=1}

        List<Integer> ls = List.of(1,2,1,3);
        List<Integer> ls1 = List.of(11,12,13,14);

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(ls);
        list.add(ls1);


        Stream<Integer> streamList = list.stream().flatMap(lists->lists.stream());


        // expected output flatten the structure , remove the duplicates, convert this elements to string, and just to sort

        // 1,2,1,3,11,12,13,14 - flatmat
        //sort
        //set

       // list.stream().flatMap(l->l.stream().map(p->p)).collect(Collectors.toList());
        List<Integer> newList =  list.stream().flatMap(l->l.stream().sorted()).collect(Collectors.toList());
        System.out.println(newList);

        Set<Integer> set = newList.stream().collect(Collectors.toSet());
        System.out.println(set);

        Set<String> setStr =set.stream().map(p->p.toString()).collect(Collectors.toSet());
        System.out.println(setStr);



    }
}
