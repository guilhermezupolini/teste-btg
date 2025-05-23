package com.api.teste_btg.service;

import com.api.teste_btg.domain.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void saveCustomer(final Customer customer) {
        System.out.println("Salvo com sucesso");
    }
}
