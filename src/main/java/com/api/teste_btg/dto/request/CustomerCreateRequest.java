package com.api.teste_btg.dto.request;

import com.api.teste_btg.utility.validate.CpfValidate;
import com.api.teste_btg.utility.validate.EmailValidate;
import jakarta.validation.Valid;
import lombok.Data;

@Valid
@Data
public class CustomerCreateRequest {

    String name;

    @CpfValidate
    String document;

    @EmailValidate
    String email;
}
