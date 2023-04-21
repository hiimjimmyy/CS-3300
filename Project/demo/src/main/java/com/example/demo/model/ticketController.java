package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ticketController {

    @Autowired
    private ticketService tService;

    @RequestMapping("/list")
    public List<ticket> getAllTickets(){
        return tService.getAllTickets();
    }


}
