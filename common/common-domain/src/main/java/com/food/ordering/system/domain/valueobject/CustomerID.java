package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class CustomerID extends BaseID<UUID> {

    public CustomerID(UUID value) {
        super(value);
    }
}
