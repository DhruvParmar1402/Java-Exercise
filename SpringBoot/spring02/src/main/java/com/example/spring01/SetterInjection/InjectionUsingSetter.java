package com.example.spring01.SetterInjection;

import com.example.spring01.ConstructorInjection.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InjectionUsingSetter {
    private Coach mycoach;

    @Autowired
    public void setMycoach(Coach mycoach) {
        this.mycoach = mycoach;
    }

    @GetMapping("/setter")
    public String getObj(){
        return mycoach.getTraining();
    }
}
