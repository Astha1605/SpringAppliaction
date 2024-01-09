package com.astha.singh.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    List<Integer> listOfItems;

    public Category() {
    }

    public Category(int id, String name, String type, List<Integer> listOfItems) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.listOfItems = listOfItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(List<Integer> listOfItems) {
        this.listOfItems = listOfItems;
    }
}
