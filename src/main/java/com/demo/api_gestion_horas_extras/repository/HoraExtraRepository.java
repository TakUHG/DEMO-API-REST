package com.demo.api_gestion_horas_extras.repository;

import com.demo.api_gestion_horas_extras.model.HoraExtra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoraExtraRepository extends JpaRepository<HoraExtra, Long> {
}
