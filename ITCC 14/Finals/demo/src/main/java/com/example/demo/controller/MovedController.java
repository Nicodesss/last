package com.example.demo.controller;

import com.example.demo.collection.Moved;
import com.example.demo.service.MovedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/moved")
public class MovedController {


    @Autowired
    private MovedService movedService;

    @GetMapping("/test")
    public List<Moved> getIfMoved(@RequestParam Boolean isMoved){
         return movedService.getAllMoved(isMoved);
    }
}
