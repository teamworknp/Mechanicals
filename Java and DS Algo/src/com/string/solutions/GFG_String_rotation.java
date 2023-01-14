package com.string.solutions;

public class GFG_String_rotation {


    //Input: S1 = ABCD, S2 = CDAB
    //Output: Strings are rotations of each other
    //
    //Input: S1 = ABCD, S2 = ACBD
    //Output: Strings are not rotations of each other

    static boolean isStringRotational(String s1, String s2){
        if(s1 ==null || s2 == null || s1.length()!=s2.length()){
            return false;
        }
        boolean isRotate = false;
        for(int i=0;i<s1.length();i++){
            if(s2.indexOf(i) == s1.indexOf(i)){
                return true;
            }
            isRotate =false;
        }
        return false;
    }
    public static void  main(String[] args) {
        String s1 = "ABCD";
        String s2 = "DBCA";
        System.out.println(isStringRotational(s1,s2));

    }
}
