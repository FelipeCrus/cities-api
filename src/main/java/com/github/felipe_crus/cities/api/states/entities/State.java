package com.github.felipe_crus.cities.api.states.entities;

import com.github.felipe_crus.cities.api.countries.entities.Country;
import jakarta.persistence.*;

@Entity
@Table(name = "estado")
public class State {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "uf")
    private String uf;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;

    @Column(name = "ddd", columnDefinition = "jsonb")
    private String ddd;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Country getCountry() {
        return country;
    }

    public String getDdd() {
        return ddd;
    }
}
