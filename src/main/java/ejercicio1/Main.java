package ejercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * TODO: 5. Tenemos como input un listado desordenado de Visitas que se han recibido por la aplicación y nos han pedido la siguiente información:
 * a.	¿Cuántas visitas agrupadas por site se han recibido en total?
 * b.	¿Cuántas visitas agrupadas por site se han recibido desde 2016 en adelante?
 * c.	Saca el listado de Visitas sólo de la site de España ordenado por fecha de creación ascendente y, en caso de empate, por id de forma descendente
 */
public class Main {

    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    public static void main(String[] args) throws ParseException {
        List<Visita> visitas = Arrays.asList(new Visita(1l, "ES", sdf.parse("20170101")), new Visita(2l, "FR", sdf.parse("20170102")),
                new Visita(3l, "ES", sdf.parse("20170103")), new Visita(4l, "FR", sdf.parse("20170203")), new Visita(5l, "CL", sdf.parse("20161102")),
                new Visita(6l, "ES", sdf.parse("20161102")), new Visita(7l, "BR", sdf.parse("20151102")), new Visita(8l, "BR", sdf.parse("20151102")),
                new Visita(9l, "BR", sdf.parse("20151102")), new Visita(10l, "BR", sdf.parse("20151102")), new Visita(11l, "ES", sdf.parse("20170101")));
        ej1a(visitas);
        ej1b(visitas);
        ej1c(visitas);
    }

    /**
     * TODO: 5a.¿Cuántas visitas agrupadas por site se han recibido en total?
     */
    private static void ej1a(List<Visita> visitas) {

    }

    /**
     * TODO: 5b.¿Cuántas visitas agrupadas por site se han recibido desde 2016 en adelante?
     */
    private static void ej1b(List<Visita> visitas) {

    }

    /**
     * TODO: 5c. Saca el listado de Visitas sólo de la site de España ordenado por fecha de creación ascendente y, en caso de empate, por id de forma
     * descendente
     */
    private static void ej1c(List<Visita> visitas) {

    }

}
