package com.example.assignmentpart1.service;


import com.example.assignmentpart1.dto.MarketDTO;
import com.example.assignmentpart1.entity.Market;
import com.example.assignmentpart1.repository.CoinRepository;
import com.example.assignmentpart1.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class MarketService {


    @Autowired
    MarketRepository marketRepository;

    @Autowired
    CoinRepository coinRepository;

    public List<MarketDTO> getListMarket(){
        List<MarketDTO> list = new ArrayList<>();
        for (Market market:marketRepository.findAll()){
            list.add(new MarketDTO.MarketDTOBuilder()
                    .withName(market.getName())
                    .withId(market.getId())
                    .withDescription(market.getDescription())
                    .withListCoin(coinRepository.findAllByMarketId(market.getId()))
            .build());
        }
        return list;
    }

    public Market create(Market market) {
        market.setStatus(1);
        market.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        market.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        market.setDeletedAt(Calendar.getInstance().getTimeInMillis());
        return marketRepository.save(market);
    }


}
