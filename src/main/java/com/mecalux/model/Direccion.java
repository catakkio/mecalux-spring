package com.mecalux.model;

/**
 * TODO: 3. Utilizar anotaciones JPA para modelar las entidades del package com.mecalux.model
 * */
public class Direccion {

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
