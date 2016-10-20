package com.company.fake;

/**
 * Created by Stan on 19.10.2016.
 */
public class B extends A {

    public B() {
        System.out.println("\tB.constructor");
    }

    static{

        System.out.println("\tB.static1");
    }

    {
        System.out.println("\tB.init1");
    }

    {
        System.out.println("\tB.init2");
    }

    static{
        System.out.println("\tB.static2");
    }
}
