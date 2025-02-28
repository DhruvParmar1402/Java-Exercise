package com.jobs.jobposting.Controller;

import com.jobs.jobposting.Entity.PostEntity;
import com.jobs.jobposting.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService service;

    @GetMapping("/posts")
    public List<PostEntity> getAllPosts()
    {
        System.out.println("hello");
        return service.getAllPosts();
    }
}
