package com.example.spring01.ConstructorInjection;

import org.springframework.stereotype.Component;

@Component
public class ComponentClass implements Coach{
    public String getTraining (){
        return "Practice fast bowling for 15 minutes";
    }
}
