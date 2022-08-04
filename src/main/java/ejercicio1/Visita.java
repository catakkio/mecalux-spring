package ejercicio1;

import java.util.Date;

/**
 * Created by JCastillo on 01/03/2017.
 */
public class Visita {

    public Visita() {
    }

    public Visita(Long id, String site, Date created) {
        this.id = id;
        this.site = site;
        this.created = created;
    }

    private Long id;

    private String site;

    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "CM {" + "id=" + id + ", site='" + site + '\'' + ", created=" + created + '}';
    }
}
