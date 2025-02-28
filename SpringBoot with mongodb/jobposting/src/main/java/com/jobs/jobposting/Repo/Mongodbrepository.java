package com.jobs.jobposting.Repo;

import com.jobs.jobposting.Entity.PostEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Mongodbrepository extends MongoRepository<PostEntity,String> {

}
