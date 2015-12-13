package com.iyoukeji.exam.java.tree;

public class ProductCategory {

    private Integer id;
    private Integer parent;
    private String name;

    public ProductCategory(Integer id, Integer parent, String name) {
        this.id = id;
        this.parent = parent;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
