package com.api.teste_btg.utility.validator;

import com.api.teste_btg.utility.validate.EmailValidate;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailValidate, String> {

    private static final String EMAIL_REGEX =
            "^[\\w\\.-]+@[\\w\\.-]+\\.[a-zA-Z]{2,}$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (email == null || email.isBlank()) return false;
        return email.matches(EMAIL_REGEX);
    }
}