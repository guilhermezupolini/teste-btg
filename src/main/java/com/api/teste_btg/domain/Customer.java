package com.api.teste_btg.domain;

import com.api.teste_btg.domain.enums.CustomerStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    private Long customerId;

    private String name;

    private String document;

    private String email;

    private CustomerStatus status;
}
