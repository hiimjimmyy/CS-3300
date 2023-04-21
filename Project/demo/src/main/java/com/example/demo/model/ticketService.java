package com.example.demo.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ticketService {

    private List<ticket> tickets = Arrays.asList();

    public List<ticket> getAllTickets(){
        return tickets;
    }

}
