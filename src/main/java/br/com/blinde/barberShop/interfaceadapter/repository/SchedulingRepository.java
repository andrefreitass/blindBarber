package br.com.blinde.barberShop.interfaceadapter.repository;

import br.com.blinde.barberShop.domain.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, Long> {
    List<Scheduling> findByClientIdOrderByIdDesc(Long id);
    List<Scheduling> findByEmployeeIdOrderByIdDesc(Long id);
}