package com.api.teste_btg.controller;

import com.api.teste_btg.controller.request.CustomerCreateRequest;
import com.api.teste_btg.usecase.CreateCustomerUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/customer")
public class CustomerController {

    @Autowired
    private CreateCustomerUseCase createCustomerUseCase;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody CustomerCreateRequest request) {
        createCustomerUseCase.create(request);

        return ResponseEntity.ok("Cliente cadastrado com sucesso");
    }
}
