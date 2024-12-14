package com.rms.ecommerce.customer;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document
@Builder
public class Customer {
    @Id
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
}
