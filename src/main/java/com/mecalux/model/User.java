package com.mecalux.model;

import java.util.List;

/**
 * TODO: 3. Utilizar anotaciones JPA para modelar las entidades del package com.mecalux.model
 * */
public class User {

    private long id;

    private String name;

    private List<Direccion> direcciones;

    public User(long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public User() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

}
