package com.vertex.prof.reflection;


import java.io.*;
import java.lang.reflect.*;
import java.sql.Ref;
import java.util.*;

//@Deprecated
public class ReflectionExperiments<T> {

    @Five
    private String string = "1";
    @Five
    private List lins = null;

    //    @Deprecated
    public ReflectionExperiments(String string, List lins) {

        this.string = "q";
        this.lins = new ArrayList();
    }

    enum MyEnum {
        FIRST, SECOND
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
//        try(InputStream resource = ReflectionExperiments.class
//                .getClassLoader() //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//                .getResourceAsStream("test/experiment.csv");
//            InputStreamReader fileReader = new InputStreamReader(resource);
//            BufferedReader reader = new BufferedReader(fileReader)){
//
//            reader.lines().forEach(System.out::println);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Arrays.stream(void.class.getConstructors())
//                .map(o -> o.getName())
//                .forEach(System.out::println);
//
//        System.out.println(void.class.getCanonicalName());
//        System.out.println(void.class.getName());
//        System.out.println(void.class.getSimpleName());
//        System.out.println(void.class.getTypeName());
//
//        System.out.println(String.class.getCanonicalName());
//        System.out.println(String.class.getName());
//        System.out.println(String.class.getSimpleName());
//        System.out.println(String.class.getTypeName());
//
//        System.out.println(Map.Entry.class.getCanonicalName());
//        System.out.println(Map.Entry.class.getName());
//        System.out.println(Map.Entry.class.getSimpleName());
//        System.out.println(Map.Entry.class.getTypeName());

//        Object aClass = Integer[].class;
//        System.out.println(aClass == Integer.class);
//        System.out.println(Integer[].class.equals(Integer.class));
//
//        System.out.println(Integer[].class.getComponentType() == Integer.class);
//        System.out.println(Integer[].class.getComponentType().equals(Integer.class));

        Runnable runnable = () -> System.out.println("do nothing");
//
        class Inner {
        }
//
//        System.out.println(Map.Entry.class.getDeclaringClass().getCanonicalName());
//        System.out.println(Map.Entry.class.getEnclosingClass().getCanonicalName());
//
//        System.out.println(Inner.class.getDeclaringClass());
//        System.out.println(Inner.class.getEnclosingClass());
//
//        System.out.println(runnable.getClass().getDeclaringClass());
//        System.out.println(runnable.getClass().getEnclosingClass());

//        Arrays.stream(ReflectionExperiments.class.getDeclaredClasses())
//                .filter(Class::isEnum)
//                .map(Class::getEnumConstants)
////                .map(Arrays::toString)
////                .flatMap(Arrays::stream)
//                .forEach(System.out::println);

//        System.out.println(void.class.getSuperclass());
//        System.out.println(Arrays.toString(void.class.getTypeParameters()));

//        ReflectionExperiments<String> reflectionExperiments = new ReflectionExperiments<>("", null);
//
//        System.out.println(Arrays.toString(ReflectionExperiments.class
//                .getTypeParameters()));


//        System.out.println(Arrays.toString(runnable.getClass().getSigners()));

//        System.out.println(ReflectionExperiments.class.isAnnotationPresent(Deprecated.class));

//        System.out.println(MyEnum.class.isLocalClass());
//        System.out.println(Inner.class.isLocalClass());
//
//        System.out.println(MyEnum.class.isMemberClass());
//        System.out.println(Inner.class.isMemberClass());

//        System.out.println(void.class.isPrimitive());

//        System.out.println(MyEnum.class.getMethod("values").isSynthetic());

        ReflectionExperiments experiments = new ReflectionExperiments("two", null);

        Arrays.stream(ReflectionExperiments.class
                .getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(Five.class))
                .filter(field -> field.getType() == String.class)
                .forEach(field -> setValueAsFive(experiments, field));

        System.out.println(experiments.string);
    }

    private static void setValueAsFive(ReflectionExperiments experiments, Field field) {
        try {
            field.setAccessible(true);
            field.set(experiments, "Five");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
