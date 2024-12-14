package com.rms.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerDto(
        @NotNull(message = "Firstname is required")
        String firstName,

        @NotNull(message = "Lastname is required")
        String lastName,

        @NotNull(message = "Email is required")
        @Email(message = "Please provide a valid email address")
        String email,

        Address address
) {
}
