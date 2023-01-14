package com.learning.java.versions;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoEduBridge {
    static int number;
    static public void main(String[] args)  {
//        int number =1;
//        DemoEduBridge demoEduBridge= new DemoEduBridge();
//        if(demoEduBridge!=null){
//            int number =2;
//        }
//        System.out.println(number);
        String [][]  matrix = {{"A", "B", "C" },{"D", "E", "F"}};
       // System.out.println(matrix[1][2]);
        for(int i=0, j=1; i< matrix.length;i++, j++){
            System.out.println(matrix[i][j]);
        }



//           var list = new ArrayList<>();
//           var i1 =1, i2 =2;
//           var String;
//           var object =null;
//           var array = {1,2};

//             String +yourName ="1";
//             String xXte = "ABS";
//             String #

              String [] array = {"a","b","c","d","e"};
              String [] array2 = Arrays.copyOfRange(array,1,3);
              System.out.println(Arrays.toString(array2));



    }
}
