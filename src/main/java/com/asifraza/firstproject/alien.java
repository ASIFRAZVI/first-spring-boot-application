package com.asifraza.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class alien {

    @Value("25") //default value
    private int age;

    private Computer com;
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop") // here use which method we want since we have overriding interfa for to time one in laptop and one in desktop
    public void setCom(Computer com) {
        this.com = com;
    }


    // @Autowired
    // laptop object;

    public void show(){
        com.cpu();
        // System.out.println("I am an alien");
    }
}
