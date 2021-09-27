package com.company;

public class Readable extends Product{

    private String type;
    private String category;

    public Readable(Integer id ,String name, String description, Double price, Integer count, String type, String category) {
        super(id ,name, description, price, count);
        this.type = type;
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
