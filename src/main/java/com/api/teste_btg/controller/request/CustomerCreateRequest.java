package com.api.teste_btg.controller.request;

import lombok.Data;

@Data
public class CustomerCreateRequest {
    String name;

    String document;

    String email;
}
