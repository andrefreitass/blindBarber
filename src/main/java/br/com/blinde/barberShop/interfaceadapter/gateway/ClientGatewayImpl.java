package br.com.blinde.barberShop.interfaceadapter.gateway;

import br.com.blinde.barberShop.businessrule.gateway.ClientGateway;
import br.com.blinde.barberShop.domain.Client;
import br.com.blinde.barberShop.interfaceadapter.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class ClientGatewayImpl implements ClientGateway {

    private final ClientRepository repository;

    @Override
    public Optional<Client> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Client create(Client entity) {
        return repository.save(entity);
    }

    @Override
    public Client update(Client entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<Client> findByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }
}