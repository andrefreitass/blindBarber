package br.com.blinde.barberShop.repository;

import br.com.blinde.barberShop.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByPersonalDataCpf(String cpf);
}