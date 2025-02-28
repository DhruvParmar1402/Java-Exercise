package com.jobs.jobposting.Service;

import com.jobs.jobposting.Entity.PostEntity;
import com.jobs.jobposting.Repo.Mongodbrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private Mongodbrepository repo;

    public List<PostEntity> getAllPosts() {
        System.out.println("Hello2");
        List<PostEntity>list=repo.findAll();
        return list;
    }
}
