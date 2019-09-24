package com.example.assignmentpart1.controller;


import com.example.assignmentpart1.entity.Market;
import com.example.assignmentpart1.entity.rest.RESTResponse;
import com.example.assignmentpart1.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/market")
public class MarketController {


    @Autowired
    MarketService marketService;


    @GetMapping
    public ResponseEntity<Object> getListMarket(){
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success")
                .addData(marketService.getListMarket())
                .build(),
                HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Object> saveMarket(@RequestBody Market marketCreate){
        try {
            Market market = marketService.create(marketCreate);
            return new ResponseEntity<>(new RESTResponse.Success()
                    .setStatus(HttpStatus.OK.value())
                    .setMessage("Success")
                    .addData(market)
                    .build(),
                    HttpStatus.OK);

        }catch (Exception error){
            return new ResponseEntity<>(new RESTResponse.Success()
                    .setStatus(HttpStatus.BAD_GATEWAY.value())
                    .setMessage("error")
                    .build(),
                    HttpStatus.BAD_GATEWAY);
        }

    }

}
