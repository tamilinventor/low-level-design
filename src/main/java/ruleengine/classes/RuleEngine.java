package ruleengine.classes;

import java.util.*;

public class RuleEngine {

    private final Map<Category, List<Rule>> rules;

    public RuleEngine() {
        this.rules = new HashMap<>();
    }

    public void registerRule(Category category, Rule rule) {
        rules.computeIfAbsent(category, k -> new ArrayList<>()).add(rule);
    }

    public ValidationResult applyRule(PurchaseContext context) {

        Category category = context.getProduct().getCategory();
        Optional<List<Rule>> applicableRules = Optional.ofNullable(rules.get(category));

        if(applicableRules.isEmpty()) {
            //No rule is available to apply
            return ValidationResult.valid();
        }

        for(Rule rule: applicableRules.get()) {

            ValidationResult result = rule.validate(context);
            if(!result.isValid()) {
                return result;
            }
        }

        return ValidationResult.valid();

    }

}
