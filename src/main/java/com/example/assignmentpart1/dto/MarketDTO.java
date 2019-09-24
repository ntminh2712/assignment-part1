package com.example.assignmentpart1.dto;

import com.example.assignmentpart1.entity.Coin;

import java.util.List;

public class MarketDTO {

    private int id;
    private String name;
    private String description;
    private List<Coin> listCoin;


    public MarketDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Coin> getListCoin() {
        return listCoin;
    }

    public void setListCoin(List<Coin> listCoin) {
        this.listCoin = listCoin;
    }

    public static final class MarketDTOBuilder {
        private int id;
        private String name;
        private String description;
        private List<Coin> listCoin;

        public MarketDTOBuilder() {
        }

        public static MarketDTOBuilder aMarketDTO() {
            return new MarketDTOBuilder();
        }

        public MarketDTOBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public MarketDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public MarketDTOBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public MarketDTOBuilder withListCoin(List<Coin> listCoin) {
            this.listCoin = listCoin;
            return this;
        }

        public MarketDTO build() {
            MarketDTO marketDTO = new MarketDTO();
            marketDTO.setId(id);
            marketDTO.setName(name);
            marketDTO.setDescription(description);
            marketDTO.setListCoin(listCoin);
            return marketDTO;
        }
    }
}
