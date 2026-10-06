package ruleengine.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {

    private final String id;
    private final Category category;
    private final long availableQuantity;
}
