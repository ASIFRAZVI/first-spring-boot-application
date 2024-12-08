package com.asifraza.firstproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// primary annotation to indicate this class is the primary implementation of the Computer interface. 
@Primary
public class desktop implements Computer  {

    public void cpu(){
         System.out.println("compiling in desktop");
    }
    
}

