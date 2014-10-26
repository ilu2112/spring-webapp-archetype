package com.mskiba.archetype.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}