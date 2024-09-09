package org.example;

import org.example.chainresponsability.model.ModelRequest;
import org.example.chainresponsability.model.ModelTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> prices = List.of(1, 2, 3, 4);
        ModelRequest modelRequest = new ModelRequest(prices);
        ModelTest modelTest = new ModelTest(modelRequest);
        System.out.println("Name: " + modelTest);
        ModelRequest modelRequest2 = new ModelRequest(new ArrayList<>());
        ModelTest modelTest2 = new ModelTest(modelRequest2);
        System.out.println("Name: " + modelTest2);

    }
}