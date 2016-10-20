package com.company;

import com.company.fake.A;
import com.company.fake.C;
import org.app.controller.business.BusinessProcessor;
import org.app.controller.business.BusinessProcessorImpl;
import org.app.data.DataModule;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // A a = new C();
        //C c = (C) new A();
       // System.out.println("-----------------");
       // A a1 = new A();
        BusinessProcessor bp = new BusinessProcessorImpl(new DataModule());
        bp.getSumOfAgesOfAnimals();

    }
}
