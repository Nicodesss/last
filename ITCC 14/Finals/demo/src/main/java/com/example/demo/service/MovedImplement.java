package com.example.demo.service;


import com.example.demo.collection.Moved;
import com.example.demo.repository.MovedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class MovedImplement implements MovedService{

    @Autowired
    private MovedRepo movedRepo;


    @Override
    public List<Moved> getAllMoved(Boolean isMoved) {
        return movedRepo.findAllByIsMoved(isMoved);
    }
}
