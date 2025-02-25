package com.example.spring01.newRest;

import com.example.spring01.ConstructorInjection.ComponentClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    private ComponentClass obj;

    @Autowired
    void restController(ComponentClass obj1){
        obj=obj1;
    }

    @GetMapping("/")
    public String hello()
    {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String kemcho()
    {
        return "hiiiiiiiiii";
    }

    @GetMapping("/fortune")
    public String fortune()
    {
        return "todays your lucky day";
    }

    @GetMapping("/train")
    public String train()
    {
        return obj.getTraining();
    }
}
