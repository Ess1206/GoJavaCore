package com.company.fake;
//http://firozstar.tripod.com/_darksiderg.pdf

import org.app.controller.business.BusinessProcessor;
import org.app.controller.business.BusinessProcessorImpl;
import org.app.data.DataModule;
import org.app.model.Animal;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Stan on 19.10.2016.
 */
public class AppForObjects {

    public static void main(String[] args) {
        //BusinessProcessor bp = new BusinessProcessorImpl(new DataModule())
        DataModule dataModule = new DataModule();
        Stream<Animal> animalsStream=dataModule.getAnimals().stream();
        Optional<Animal> optionalResult=animalsStream.max((a, b)->b.getAge()-a.getAge());
        if(optionalResult.isPresent()) {
            Animal animal = optionalResult.get();
            System.out.println(animal);
        }
        System.out.println("-----------------------");

        animalsStream=dataModule.getAnimals().stream();
        animalsStream.filter(a->a.getName().contains("3")).forEach(a-> System.out.println(a));


        animalsStream=dataModule.getAnimals().stream();
        System.out.println(animalsStream.mapToInt(a->a.getAge()).sum());

        animalsStream=dataModule.getAnimals().stream();
        animalsStream.sorted((a,b)->{
            if(a.getAge()==b.getAge()){
                return a.getName().compareTo(b.getName());
            }
            return -(a.getAge()-b.getAge());
        }).forEach(System.out::println);

        System.out.println("--------------");
        long start1=System.currentTimeMillis();
        animalsStream=dataModule.getAnimals().parallelStream();
        animalsStream.forEach(a->{
            long start=System.currentTimeMillis();
            while(System.currentTimeMillis()-start<5000){
            }
            System.out.println(a+"."+Thread.currentThread());
        });
        long finish = System.currentTimeMillis();
        System.out.println(finish-start1);

    }
}
