package ruleengine.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PurchaseContext {

    private final Product product;
    private final long purchaseQuantity;
    private final User user;

}
