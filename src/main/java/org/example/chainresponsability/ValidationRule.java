package org.example.chainresponsability;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class ValidationRule<K,V> {
    private final Predicate<K> conditionRule;
    private final Consumer<V> onSuccess;


    public ValidationRule(Predicate<K> conditionRule, Consumer<V> onSuccess) {
        this.conditionRule = conditionRule;
        this.onSuccess = onSuccess;
    }

    public  static <K,V> void executeValidation(V entity, List<ValidationRule<K,V>> rules, K model) {
        for (ValidationRule<K, V> rule : rules) {
            if (rule.conditionRule.test(model)) {
                rule.onSuccess.accept(entity);
            }
        }
    }
}
