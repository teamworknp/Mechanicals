package com.study.test;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DomainCounter {



    public static void main(String[] args) throws Exception {


        String domain="www.prodigitalworx.co.in";
        String[] parts = domain.split("\\.+");
        if(parts.length > 1) {
            count(parts[2]);
        }
       // System.out.println(count(parts[0])););
      //  count(domain);
        System.out.println(map);


    }

    String domain="www.prodigitalworx.co.in";
    public static Map<String,Integer> map=new HashMap<String,Integer>();
    static void count(String domain){

        if(domain.indexOf(".")==-1)
        {
            Integer count=map.get(domain);
            if(count==null){
                count=0;
            }
            map.put(domain,count+1);
        }
        else
        {
            Integer count=map.get(domain);
            if(count==null){
                count=0;
            }
            map.put(domain,count+1);
            count(domain.substring(domain.indexOf(".")+1, domain.length()));
        }

    }

}