package com.vertex.prof.generics;


class Customer {
    private static long counter = 1;
    private final long id = counter++;

    private Customer() {
    }

    // A method to produce Generator objects:
    public static Generator<Customer> generator() {
        return Customer::new;
    }

    public String toString() {
        return "Customer " + id;
    }
}
