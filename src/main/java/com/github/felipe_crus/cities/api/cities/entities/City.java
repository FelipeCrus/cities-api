package com.github.felipe_crus.cities.api.cities.entities;

import jakarta.persistence.*;
import org.springframework.data.geo.Point;

@Entity
@Table(name = "cidade")
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;
    private Integer ibge;

    @Column(name = "lat_lon", columnDefinition = "point")
    @Convert(converter = PointConverter.class)
    private Point location;

    public City() {
    }

    public City(Long id, String name, Integer uf, Integer ibge, Point location) {
        this.id = id;
        this.name = name;
        this.uf = uf;
        this.ibge = ibge;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public Point getLocation() {
        return location;
    }
}