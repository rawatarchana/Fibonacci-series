package com.hva;

import java.util.ArrayList;

public class FiboRecurison {

    public ArrayList<Integer> perform(Integer limit) {
        ArrayList<Integer> list = new ArrayList<>();//Dynamically create a ArrayList 
        Integer i=0;
        list.add(0);
        list.add(1);
        //logic of fibonacci 
        for( i = 0; i<list.size();i++)
      
        if(i<2)
        { list.add(i, list.get(i));}
      
        return list;

        //return list;
        
    }
    public static void main(String[] args) {
        FiboRecurison fibb = new FiboRecurison();// create a object
        System.out.println(fibb.perform(6));
    }

}
