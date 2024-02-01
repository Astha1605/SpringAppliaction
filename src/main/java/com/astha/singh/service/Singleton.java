package com.astha.singh.service;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
    List<String> list;

    private static Singleton singleton = null;

    private Singleton(List<String> list) {
        this.list = list;
    }

    public static Singleton getInstance()
    {
        if(singleton == null)
        {
            singleton = new Singleton(new ArrayList<>());
        }
        return singleton;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
    public void addElement(String str)
    {
        list.add(str);
    }
}
