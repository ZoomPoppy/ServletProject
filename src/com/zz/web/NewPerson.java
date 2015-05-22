package com.zz.web;

/**
 * Created by zz on 2015/5/20.
 */
public class NewPerson {
    private String name;
    private Dog dog;
    public Dog getDog(){return dog;}
    public void setDog(Dog dog){
        this.dog = dog;
    }
    public  String getName(){
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }
}
