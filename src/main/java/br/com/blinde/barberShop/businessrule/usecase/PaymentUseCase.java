package br.com.blinde.barberShop.businessrule.usecase;

import br.com.blinde.barberShop.interfaceadapter.domain.request.payment.PaymentChangesRequest;
import br.com.blinde.barberShop.interfaceadapter.domain.response.PaymentResponse;

import java.util.List;

public interface PaymentUseCase {

    PaymentResponse findById(Long id);

    List<PaymentResponse> findAll();

    PaymentResponse update(PaymentChangesRequest request);
}