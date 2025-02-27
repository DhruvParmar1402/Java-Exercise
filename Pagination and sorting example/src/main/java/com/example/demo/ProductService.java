package com.example.demo;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ProductService {

    @Autowired
    private MyRepo repo;

    @Transactional
    public void save()
    {
       for(int i=0;i<200;i++)
       {
           Products p=new Products(i,"Product"+i,new Random().nextInt(1,2000),new Random().nextInt(100));
           repo.save(p);
           repo.flush();
       }
    }

    public List<Products> getAll()
    {
        return repo.findAll();
    }

    public List<Products> getAllUsingSort(String field){
        return repo.findAll(Sort.by(field));
    }

    public Page<Products> getDataUsingPagination(int offset, int pagesize,String field) {
        return repo.findAll(PageRequest.of(offset,pagesize).withSort(Sort.by(field)));
    }
}
