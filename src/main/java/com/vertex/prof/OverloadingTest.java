package com.vertex.prof;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.AbstractSet;
import java.util.jar.JarException;

public class OverloadingTest {
    static class A{
        protected B myMethod(B b) throws IOException{
            return null;
        }
    }

    static class B extends A {

        @Override
        public C myMethod(B myParam) throws ClassFormatException, JarException{
            return null;
        }
    }

    static class C extends B {}

    public void method(A a){
        System.out.println("with A");
    }

    public void method(B b){
        System.out.println("with B");
    }

    public static void main(String[] args) {
        OverloadingTest overloadingTest = new OverloadingTest();

        overloadingTest.method(new A());
        overloadingTest.method(new B());
        overloadingTest.method(new C());
    }
}
