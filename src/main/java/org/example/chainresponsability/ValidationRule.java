package org.example.chainresponsability;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Extends T to be able to use the validation rules in the model
 *
 * @param <T>
 */
public class ValidationRule<T,M> {
    private final Predicate<T> conditionRule;
    private final Consumer<M> onSuccess;


    public ValidationRule(Predicate<T> conditionRule, Consumer<M> onSuccess) {
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
