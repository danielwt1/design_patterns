package org.example.chainresponsability.model;

import java.util.List;

public class ModelRequest {

    private List<Integer> prices;

    public ModelRequest() {
    }

    public ModelRequest(List<Integer> prices) {
        this.prices = prices;
    }

    public List<Integer> getPrices() {
        return prices;
    }

    public void setPrices(List<Integer> prices) {
        this.prices = prices;
    }
}
