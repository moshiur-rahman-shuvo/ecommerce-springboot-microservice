package com.rms.ecommerce.customer;

import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public Customer toCustomer(@Valid CustomerDto customerDto) {
        if(customerDto == null) {
            return null;
        }
        return Customer.builder()
                .firstName(customerDto.firstName())
                .lastName(customerDto.lastName())
                .email(customerDto.email())
                .address(customerDto.address())
                .build() ;
    }

    public CustomerResponse toCustomerDto(Customer customer) {
        if(customer == null)
            return null;
        return new CustomerResponse(
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getAddress()
        ) ;
    }
}
