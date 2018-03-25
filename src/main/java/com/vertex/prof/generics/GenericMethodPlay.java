package com.vertex.prof.generics;

import com.vertex.prof.util.Fruit;
import com.vertex.prof.util.Jonathan;

public class GenericMethodPlay {

    public <TTimofey> TTimofey getObject(TTimofey t, Class<? extends TTimofey> clazz){

        if(t instanceof Object){
            System.out.println("Object =)");
        }

//        if(new Object() instanceof T){
//
//        }

        Class<? extends Object> clasik = t.getClass();

        try {
            TTimofey t1 = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        if(t.getClass().isInstance(t)){
            System.out.println("t is always T, OMG");
        }

        return t;
    }

    public static void main(String[] args) {
        GenericMethodPlay genericMethodPlay = new GenericMethodPlay();

        Jonathan jonathan = new Jonathan();
        Fruit object = genericMethodPlay.<Fruit>getObject(jonathan, jonathan.getClass());
    }

}
