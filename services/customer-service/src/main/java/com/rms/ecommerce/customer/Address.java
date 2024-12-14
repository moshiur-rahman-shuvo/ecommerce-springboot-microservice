package com.rms.ecommerce.customer;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Validated
@Builder
public class Address {
    private String houseNumber;
    private String village;
    private String city;
    private String country;
}
