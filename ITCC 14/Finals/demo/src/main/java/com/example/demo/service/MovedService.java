package com.example.demo.service;


import com.example.demo.collection.Moved;

import java.util.List;

public interface MovedService {


    List<Moved> getAllMoved(Boolean isMoved);
}
