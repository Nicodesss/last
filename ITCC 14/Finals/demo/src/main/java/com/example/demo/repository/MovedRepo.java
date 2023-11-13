package com.example.demo.repository;


import com.example.demo.collection.Moved;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MovedRepo extends MongoRepository<Moved, String> {


    List<Moved> findAllByIsMoved(Boolean getMoved);



}
