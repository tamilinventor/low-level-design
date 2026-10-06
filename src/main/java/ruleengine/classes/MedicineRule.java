package ruleengine.classes;

public class MedicineRule implements Rule {

    private final long maxPurchasableQuantity = 2;

    @Override
    public ValidationResult validate(PurchaseContext purchaseContext) {

        if (purchaseContext.getProduct().getCategory().equals(Category.MEDICINE) && purchaseContext.getPurchaseQuantity() > maxPurchasableQuantity) {
            return ValidationResult.failed("Maximum " + maxPurchasableQuantity + " quantity can be purchased", "Medicine Rule");
        }

        return ValidationResult.valid();

    }
}
