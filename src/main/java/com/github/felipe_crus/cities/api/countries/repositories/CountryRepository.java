package com.github.felipe_crus.cities.api.countries.repositories;

import com.github.felipe_crus.cities.api.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
