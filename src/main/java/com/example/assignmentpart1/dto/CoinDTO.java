package com.example.assignmentpart1.dto;

import com.example.assignmentpart1.entity.Market;

public class CoinDTO {
    private int id;
    private String name;
    private String baseAsset;
    private String quoteAsset;
    private String lastPrice;
    private String volumn24h;
    private Market market;
    private long createdAt;
    private long updatedAt;
    private long deletedAt;
    private int status;

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

    public String getBaseAsset() {
        return baseAsset;
    }

    public void setBaseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
    }

    public String getQuoteAsset() {
        return quoteAsset;
    }

    public void setQuoteAsset(String quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getVolumn24h() {
        return volumn24h;
    }

    public void setVolumn24h(String volumn24h) {
        this.volumn24h = volumn24h;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static final class CoinDTOBuilder {
        private int id;
        private String name;
        private String baseAsset;
        private String quoteAsset;
        private String lastPrice;
        private String volumn24h;
        private Market market;
        private long createdAt;
        private long updatedAt;
        private long deletedAt;
        private int status;

        public CoinDTOBuilder() {
        }

        public static CoinDTOBuilder aCoinDTO() {
            return new CoinDTOBuilder();
        }

        public CoinDTOBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public CoinDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CoinDTOBuilder withBaseAsset(String baseAsset) {
            this.baseAsset = baseAsset;
            return this;
        }

        public CoinDTOBuilder withQuoteAsset(String quoteAsset) {
            this.quoteAsset = quoteAsset;
            return this;
        }

        public CoinDTOBuilder withLastPrice(String lastPrice) {
            this.lastPrice = lastPrice;
            return this;
        }

        public CoinDTOBuilder withVolumn24h(String volumn24h) {
            this.volumn24h = volumn24h;
            return this;
        }

        public CoinDTOBuilder withMarket(Market market) {
            this.market = market;
            return this;
        }

        public CoinDTOBuilder withCreatedAt(long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public CoinDTOBuilder withUpdatedAt(long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CoinDTOBuilder withDeletedAt(long deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public CoinDTOBuilder withStatus(int status) {
            this.status = status;
            return this;
        }

        public CoinDTO build() {
            CoinDTO coinDTO = new CoinDTO();
            coinDTO.setId(id);
            coinDTO.setName(name);
            coinDTO.setBaseAsset(baseAsset);
            coinDTO.setQuoteAsset(quoteAsset);
            coinDTO.setLastPrice(lastPrice);
            coinDTO.setVolumn24h(volumn24h);
            coinDTO.setMarket(market);
            coinDTO.setCreatedAt(createdAt);
            coinDTO.setUpdatedAt(updatedAt);
            coinDTO.setDeletedAt(deletedAt);
            coinDTO.setStatus(status);
            return coinDTO;
        }
    }
}
