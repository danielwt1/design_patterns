package org.example.chainresponsability.model;

import org.example.chainresponsability.ValidationRule;

import java.util.ArrayList;
import java.util.List;

public class ModelTest extends SuperClass{
    private static final List<ValidationRule<ModelRequest, ModelTest>> rules =  new ArrayList<>(10);

    {
        rules.add(new ValidationRule<>(model -> !model.getPrices().isEmpty(), model -> model.setName("Name")));
        rules.add(new ValidationRule<>(model -> model.getPrices().isEmpty(), model -> model.setActive(true)));
    }
    public ModelTest(ModelRequest request) {
        ValidationRule.executeValidation(this, rules, request);

    }
}
