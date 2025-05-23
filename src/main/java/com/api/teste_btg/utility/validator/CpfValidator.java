package com.api.teste_btg.utility.validator;

import com.api.teste_btg.utility.validate.CpfValidate;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CpfValidator implements ConstraintValidator<CpfValidate, String> {

    @Override
    public boolean isValid(String cpf, ConstraintValidatorContext context) {
        if (cpf == null) return false;

        cpf = cpf.replaceAll("[^\\d]", ""); // remove pontos e traços

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) return false;

        try {
            int d1 = 0, d2 = 0;
            for (int i = 0; i < 9; i++) {
                int digito = cpf.charAt(i) - '0';
                d1 += digito * (10 - i);
                d2 += digito * (11 - i);
            }
            d1 = 11 - (d1 % 11);
            d2 += (d1 >= 10 ? 0 : d1 * 2);
            d2 = 11 - (d2 % 11);
            int v1 = (d1 >= 10 ? 0 : d1);
            int v2 = (d2 >= 10 ? 0 : d2);

            return v1 == (cpf.charAt(9) - '0') && v2 == (cpf.charAt(10) - '0');
        } catch (Exception e) {
            return false;
        }
    }
}