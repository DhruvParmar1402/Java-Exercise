package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;


    @GetMapping("/get")
    @ResponseBody
    public List<Products> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{field}")
    @ResponseBody
    public List<Products> getAllUsingSorting(@PathVariable String field)
    {
        return service.getAllUsingSort(field);
    }

    @GetMapping("/pagination/{offset}/{pagesize}/{field}")
    @ResponseBody
    public Page<Products> getDataUsingPagination(@PathVariable int offset, @PathVariable int pagesize,@PathVariable String field)
    {
        return  service.getDataUsingPagination(offset,pagesize,field);
    }
}
