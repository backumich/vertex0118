package com.vertex.prof.patterns;

public class FactoryExample {

    interface Returnable {}

    static class A implements Returnable {
        @Override
        public String toString() {
            return "A";
        }
    }

    static class B implements Returnable {
        @Override
        public String toString() {
            return "B";
        }
    }

    public static Returnable getInstance(String name){
        Returnable toReturn;
        if("a".equalsIgnoreCase(name)){
            toReturn = new A();
        } else if ("b".equalsIgnoreCase(name)){
            toReturn = new B();
        } else {
            throw new IllegalArgumentException("Name should represent type of class you prefer to build. " +
                    "Actual name was: " + name);
        }
        return toReturn;
    }

    public static void main(String[] args) {
        System.out.println(FactoryExample.getInstance("a"));
        System.out.println(FactoryExample.getInstance("B"));
        System.out.println(FactoryExample.getInstance("C"));


    }
}
