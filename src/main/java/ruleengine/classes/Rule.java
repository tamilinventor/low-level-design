package ruleengine.classes;

public interface Rule {

    ValidationResult validate(PurchaseContext purchaseContext);

}
