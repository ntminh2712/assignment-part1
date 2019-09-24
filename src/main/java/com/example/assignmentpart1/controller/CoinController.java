package com.example.assignmentpart1.controller;


import com.example.assignmentpart1.entity.Coin;
import com.example.assignmentpart1.entity.rest.RESTResponse;
import com.example.assignmentpart1.service.CoinService;
import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/coin")
public class CoinController {

    @Autowired
    CoinService coinService;


    @PostMapping
    public ResponseEntity<Object> saveCoin(@RequestBody Coin coin){
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success")
                .addData(coinService.create(coin))
                .build(),
                HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Object> getListCoin(){
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success")
                .addData(coinService.getListCoin())
                .build(),
                HttpStatus.OK);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getCoinByMarketId(@PathVariable int id){
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success")
                .addData(coinService.getListCoinByMarketId(id))
                .build(),
                HttpStatus.OK);
    }


    @PostMapping("/search")
    public ResponseEntity<Object> searchCoin(@RequestBody String keyword){
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success")
                .addData(coinService.searchCoinByName(keyword))
                .build(),
                HttpStatus.OK);
    }


}
