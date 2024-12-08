package com.asifraza.firstproject;

import org.springframework.stereotype.Component;

@Component
public class laptop implements Computer {

    public void cpu(){
         System.out.println("I use English and Turkish as my main languages.");
    }
    
}
