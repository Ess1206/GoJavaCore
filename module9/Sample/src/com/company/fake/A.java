package com.company.fake;

/**
 * Created by Stan on 19.10.2016.
 */
public class A {

    public A() {
        System.out.println("A.constructor");
    }

    static{

        System.out.println("A.static1");
    }

    {
        System.out.println("A.init1");
    }

    {
        System.out.println("A.init2");
    }

    static{
        System.out.println("A.static2");
    }

}
