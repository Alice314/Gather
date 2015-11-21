package com.gather;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by fg on 2015/11/21.
 */
public class ListMaps {
    public  static void main (String []args){
        List<String>name = new LinkedList<>();
        name.add("A");
        name.add("B");
        name.add("C");
        ListIterator<String>iter = name.listIterator();
        String first = iter.next();
        iter.remove();
        String second = iter.next();
        iter.set("D");
        for(String element : name)
        System.out.println(name.toString());

    }
}
