package org.example.singleton;

public class RandomObject {

    private static RandomObject headQuarter = null;
    private String name;

    private RandomObject(String name){
        this.name = name;
    }

    public static RandomObject createOrRetrieveInstance(String name){
        if(headQuarter == null){
            headQuarter = new RandomObject(name);
        }
        return headQuarter;
    }
}
