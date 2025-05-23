package com.api.teste_btg.service;

import com.api.teste_btg.client.ReceitaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaClient receitaClient;

    public String getCustomerStatus(final String document) {
        return receitaClient.getCustomerStatus();
    }
}
