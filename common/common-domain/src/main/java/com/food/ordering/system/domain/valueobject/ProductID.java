package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class ProductID extends BaseID<UUID> {

    public ProductID(UUID value) {
        super(value);
    }
}
