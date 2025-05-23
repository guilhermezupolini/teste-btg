package com.api.teste_btg.domain;

import com.api.teste_btg.domain.enums.CustomerStatus;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Customer {

    private Long customerId;

    private String name;

    private String document;

    private String email;

    private CustomerStatus status;
}
