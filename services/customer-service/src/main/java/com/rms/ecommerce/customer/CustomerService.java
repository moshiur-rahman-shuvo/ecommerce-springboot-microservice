package com.rms.ecommerce.customer;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository ;
    private final CustomerMapper customerMapper ;

    public String createUser(@Valid CustomerDto customerDto) {
        var newCustomer = customerRepository.save(customerMapper.toCustomer(customerDto)) ;
        return newCustomer.getCustomerId() ;
    }
}
