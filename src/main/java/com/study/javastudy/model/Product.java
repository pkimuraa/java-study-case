package com.study.javastudy.model;

public class Product{

    //#region Atributes
    private Integer id;

    private String name;

    private Integer quantity;

    private Double value;
    
    private String description;
    //#endregion

    //#region Getters and Setters
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(String name){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Double getValue(){
        return value;
    }

    public void setValue(Double value){
        this.value = value;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
    //#endregion
}