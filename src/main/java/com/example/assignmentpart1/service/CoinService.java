package com.example.assignmentpart1.service;


import com.example.assignmentpart1.dto.CoinDTO;
import com.example.assignmentpart1.entity.Coin;
import com.example.assignmentpart1.entity.Market;
import com.example.assignmentpart1.repository.CoinRepository;
import com.example.assignmentpart1.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class CoinService {
    @Autowired
    CoinRepository coinRepository;

    @Autowired
    MarketRepository marketRepository;


    public List<CoinDTO> getListCoin(){
        List<CoinDTO> list = new ArrayList<>();
        for (Coin coin: coinRepository.findAll()){
            list.add(new CoinDTO.CoinDTOBuilder()
                    .withName(coin.getName())
                    .withBaseAsset(coin.getBaseAsset())
                    .withQuoteAsset(coin.getQuoteAsset())
                    .withLastPrice(coin.getLastPrice())
                    .withVolumn24h(coin.getVolumn24h())
                    .withMarket(marketRepository.findById(coin.getMarketId()))
                    .build());
        }
        return list;
    }

    public Coin create(Coin coin) {
        coin.setStatus(1);
        coin.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        coin.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        coin.setDeletedAt(Calendar.getInstance().getTimeInMillis());
        return coinRepository.save(coin);
    }

    public List<CoinDTO> getListCoinByMarketId(int marketId){
        List<CoinDTO> list = new ArrayList<>();
        for (Coin coin: coinRepository.findAllByMarketId(marketId)){
            list.add(new CoinDTO.CoinDTOBuilder()
                    .withName(coin.getName())
                    .withBaseAsset(coin.getBaseAsset())
                    .withQuoteAsset(coin.getQuoteAsset())
                    .withLastPrice(coin.getLastPrice())
                    .withVolumn24h(coin.getVolumn24h())
                    .withMarket(marketRepository.findById(coin.getMarketId()))
                    .build());
        }
        return list;
    }

    public List<CoinDTO> searchCoinByName(String keyword){
        List<CoinDTO> list = new ArrayList<>();
        for (Coin coin: coinRepository.findAllByNameLike(keyword)){
            list.add(new CoinDTO.CoinDTOBuilder()
                    .withName(coin.getName())
                    .withBaseAsset(coin.getBaseAsset())
                    .withQuoteAsset(coin.getQuoteAsset())
                    .withLastPrice(coin.getLastPrice())
                    .withVolumn24h(coin.getVolumn24h())
                    .withMarket( marketRepository.findById(coin.getMarketId()))
                    .build());
        }
        return list;
    }
}
