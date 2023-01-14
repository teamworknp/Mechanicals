package com.study.test;

public class PetusDemo {

    public static void sort(int[] a) {
        int temp;
        int i,j;

        for(i=0; i<a.length; i++) {
            for(j=i+1; j<a.length; j++){
              if(a[i] > a[j]){
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
              }
            }
        }
        for(i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
//        List<Integer> arr = Arrays.asList(1,4,6,8,2,3);
//        int[] arr1 = {3,1,4};
//       // Collections.sort(arr);
//        sort(arr1);

//    List original = List.of("A");
//    List derived  = new ArrayList<>(original);
//        original.add(1,"B");
//        System.out.println(derived);

        String language = "java";
        while (language.equals("java")){
            if(language.equals("java")){
                language = language.toUpperCase();
            }
            if(language.equals("JAVA")){
                language = language.toLowerCase();
            }
        }
        System.out.println(language);
    }




}


//
//Student table
//        std_id | std_name | subject | marks
//
//// fetch records of student who scored more than 90 marks in more than one subject
//
//                subject | marks
// hindi = 90
// english =89
// science = 90
//
//;
//
//select * from student s where s.marks IN (select s.marks from student GROUP BY student.subject having count(marks) > 90)
//count(subject) >1

