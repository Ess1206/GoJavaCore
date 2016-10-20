package com.company.fake;

/**
 * Created by Stan on 19.10.2016.
 */
public class C extends B {

    public C() {
        System.out.println("\t\tC.constructor");
    }

    static{

        System.out.println("\t\tC.static1");
    }

    {
        System.out.println("\t\tC.init1");
    }

    {
        System.out.println("\t\tC.init2");
    }

    static{
        System.out.println("\t\tC.static2");
    }


}
