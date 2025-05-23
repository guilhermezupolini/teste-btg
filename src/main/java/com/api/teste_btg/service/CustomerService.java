package com.api.teste_btg.service;

import com.api.teste_btg.domain.Customer;
import com.api.teste_btg.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(final Customer customer) {
        return customerRepository.save(customer);
    }
}
