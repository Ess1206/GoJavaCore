package com.company;

import org.app.model.Dog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Stan on 19.10.2016.
 */
public class AppFor8 {

    public static void main(String[] args) {
        //sample1();
        //sample2();
        AppFor8 appFor8 = new AppFor8();
        appFor8.sample3();
        appFor8.sample4();
        //appFor8.sample5();
    }

    public void sample4() {
        List<Integer> list = Arrays.asList(1,20,3,50,5);
        Stream<Integer> str=list.stream();
        //Stream<Integer> str1= str.distinct();
        /*Stream<Integer> str1= str.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>10;
            }
        });*/
       // str.filter(i->i<10).distinct().count();

        IntStream intStr = IntStream.of(1,2,3,4,5);



           str.sorted().forEach(i-> System.out.println(i));

            str.max(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });


        //str1.forEach(i-> System.out.println(i));
      //  System.out.println(list);
    }

    public void sample3() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        for(Integer i:list){

        }
        //list.forEach((Integer i)->{Helper::helper(i)});
        ;
        Helper h = new Helper();
        //Helper::new;
        list.forEach(h::helper);

        //Stream<Integer> str = Stream.of(1, 2, 5, 4);
    }






    public static void sample2() {
        Stream<Integer> str = Stream.of(1, 2, 5, 4);
        Stream<Integer> str1 = str.map(new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer integer) {
                return integer+100;
            }
        });

        Stream<Integer> str3 = str1.map(p-> p+100);


        //Object[] obj=str1.toArray();
        //System.out.println(Arrays.toString(obj));

        //Collectors.toList();
        str1.forEach(integer -> System.out.println(integer));




    }



    public static void sample1(){
        Stream<Integer> str=Stream.of(1,2,5, 4);
        str.reduce(new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer integer, Integer integer2) {

                System.out.println("i1="+integer);
                System.out.println("i2="+integer2);
                System.out.println("-------------");
                return integer+integer2;
            }
        });

        str.reduce((a, b) ->{return a+b;});

    }
}
