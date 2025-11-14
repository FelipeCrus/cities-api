package com.github.felipe_crus.cities.api.states.repositories;

import com.github.felipe_crus.cities.api.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
