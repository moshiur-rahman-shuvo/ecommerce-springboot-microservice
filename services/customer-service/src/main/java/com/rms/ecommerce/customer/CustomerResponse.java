package com.rms.ecommerce.customer;

public record CustomerResponse(
        String firstName,
        String lastName,
        String email,
        Address address
) {
}
