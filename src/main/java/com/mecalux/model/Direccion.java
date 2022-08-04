package com.mecalux.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * TODO: 3. Utilizar anotaciones JPA para modelar las entidades del package com.mecalux.model
 * */
@Entity
public class Direccion {
    @Id
    private Long id;

    private String direccion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
