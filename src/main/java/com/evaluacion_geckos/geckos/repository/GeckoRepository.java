package com.evaluacion_geckos.geckos.repository;

import com.evaluacion_geckos.geckos.models.Gecko;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeckoRepository extends JpaRepository<Gecko, Integer> {

}
