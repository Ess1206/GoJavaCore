package org.app.controller.business;

import org.app.data.DataModule;
import org.app.model.Animal;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by Stan on 19.10.2016.
 */
public class BusinessProcessorImpl implements BusinessProcessor {
    private DataModule dataModule;

    public BusinessProcessorImpl(DataModule dataModule) {
        this.dataModule = dataModule;
    }

    @Override
    public int getSumOfAgesOfAnimals() {
        //Stream<Animal> s = dataModule.getAnimals().stream();
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



        //s.reduce((animal, animal2) -> {return animal.getAge()+animal2.getAge()});
        return 0;
    }

    @Override
    public Animal getOldestAnimal() {
        return null;
    }

    @Override
    public List<Animal> getAnimalsByName(String name) {
        return null;
    }

    @Override
    public void enrcihAnimals(String name, int delta) {

    }
}
