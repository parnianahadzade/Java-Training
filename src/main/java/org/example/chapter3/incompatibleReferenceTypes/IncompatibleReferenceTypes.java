package org.example.chapter3.incompatibleReferenceTypes;

import org.example.chapter3.incompatibleReferenceTypes.model.*;

public class IncompatibleReferenceTypes {

    public static void main(String[] args) {
//        differentClassHierarchies();

//        genericTypesWithoutBounds();

//        differentInterfaces();

        arraysOfDifferentTypes();

    }

    public static void differentClassHierarchies () {
        //works fine because of Object class
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(true ? dog : cat);
    }

    public static void genericTypesWithoutBounds () {
        Box<Integer> boxInteger = new Box<>();
        Box<String> boxString = new Box<>();

        //fine
        System.out.println(true ? boxInteger : boxString);

        //compiler error
//        Box<Object> result = (true) ? boxInteger : boxString;
    }

    public static void differentInterfaces () {
        Bird bird = new Bird();
        Fish fish = new Fish();

        // fine
         Object result = (true) ? bird : fish;
        System.out.println(result);
    }

    public static void arraysOfDifferentTypes () {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"One", "Two", "Three"};

        // fine
         Object result = (true) ? intArray : strArray;
        System.out.println(result);
    }

}
