package com.api.teste_btg.usecase;

import com.api.teste_btg.controller.request.CustomerCreateRequest;
import com.api.teste_btg.domain.Customer;
import com.api.teste_btg.domain.enums.CustomerStatus;
import com.api.teste_btg.domain.enums.ReceitaStatus;
import com.api.teste_btg.service.CustomerService;
import com.api.teste_btg.service.NotificationService;
import com.api.teste_btg.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerUseCase {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private ReceitaService receitaService;

    public void create(final CustomerCreateRequest request) {
        final var customer = buildCustomer(request);
        final var receitaStatus = receitaService.getCustomerStatus(request.getDocument());

        if (!ReceitaStatus.ATIVO.name().equals(receitaStatus)) {
            customer.setStatus(CustomerStatus.PENDING_RECEITA);
        }

        notificationService.sendNotification();
        customerService.saveCustomer(customer);
    }

    private static Customer buildCustomer(CustomerCreateRequest request) {
        return Customer.builder()
                .email(request.getEmail())
                .document(request.getDocument())
                .name(request.getName())
                .status(CustomerStatus.ACTIVE)
                .build();
    }
}
