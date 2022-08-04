package ejercicio1;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * TODO: 5. Tenemos como input un listado desordenado de Visitas que se han recibido por la aplicación y nos han pedido la siguiente información:
 * a.	¿Cuántas visitas agrupadas por site se han recibido en total?
 * b.	¿Cuántas visitas agrupadas por site se han recibido desde 2016 en adelante?
 * c.	Saca el listado de Visitas sólo de la site de España ordenado por fecha de creación ascendente y, en caso de empate, por id de forma descendente
 */

public class Main {

    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    private static String newLine = System.getProperty("line.separator");

    public static void main(String[] args) throws Exception {
        List<Visita> visitas = Arrays.asList(
                new Visita(1l, "ES", sdf.parse("20170101")),
                new Visita(2l, "FR", sdf.parse("20170102")),
                new Visita(3l, "ES", sdf.parse("20170103")),
                new Visita(4l, "FR", sdf.parse("20170203")),
                new Visita(5l, "CL", sdf.parse("20161102")),
                new Visita(6l, "ES", sdf.parse("20161102")),
                new Visita(7l, "BR", sdf.parse("20151102")),
                new Visita(8l, "BR", sdf.parse("20151102")),
                new Visita(9l, "BR", sdf.parse("20151102")),
                new Visita(10l, "BR", sdf.parse("20151102")),
                new Visita(11l, "ES", sdf.parse("20170101"))
        );
        System.out.println(newLine + "Function 1a");
        ej1a(visitas);

        System.out.println(newLine + "Function 1b");
        ej1b(visitas);

        System.out.println(newLine + "Function 1c");
        ej1c(visitas);
    }

    /**
     * TODO: 5a.¿Cuántas visitas agrupadas por site se han recibido en total?
     */

    private static void ej1a(@NotNull List<Visita> visitas) throws Exception {
        //1) Create a collection of the different sites present in the list
        List<String> sites = getUniqueSitesFromVisitas(visitas);

        //2) Count how many occurences there are per each different state
        sites.forEach(site -> {
            long siteOccurences = visitas.stream()
                    .filter(visita -> visita.getSite().equalsIgnoreCase(site))
                    .count();
            System.out.println(siteOccurences + " " + site + " occurrences" );
        });

    }

    /**
     * TODO: 5b.¿Cuántas visitas agrupadas por site se han recibido desde 2016 en adelante?
     */
    private static void ej1b(@NotNull List<Visita> visitas) {
        //1) Create a collection of the different sites present in the list
        List<String> sites = getUniqueSitesFromVisitas(visitas);

        //2) Count how many occurences created from 2016 onwards there are per each different state
        final int FILTER_YEAR = 2016;
        sites.forEach(site -> {
            long siteOccurences = visitas.stream()
                    .filter(visita -> visita.getSite().equalsIgnoreCase(site) && getYearFromDate(visita.getCreated())>=FILTER_YEAR)
                    .count();
            System.out.println(siteOccurences + " " + site + " occurrences" );
        });
    }

    /**
     *
     * @param visitas array of Visita object
     * @return a list of strings with the distinct sites present in a Visita list
     */
    private static List<String> getUniqueSitesFromVisitas(@NotNull List<Visita> visitas){
        return visitas.stream()
                .map(Visita::getSite)
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * @param inputDate date from which extract the year
     * @return the year from a date
     */
    private static Integer getYearFromDate(Date inputDate) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(inputDate);
        int year = calendar.get(Calendar.YEAR);
        return year;
    }


    /**
     * TODO: 5c. Saca el listado de Visitas sólo de la site de España ordenado por fecha de creación ascendente y, en caso de empate, por id de forma
     * descendente
     */
    private static void ej1c(@NotNull List<Visita> visitas) {
        List<Visita> esVisitas = getVisitasBySite(visitas,"ES");
        esVisitas.sort(Comparator.comparing(Visita::getCreated).thenComparing(Visita::getId));
        esVisitas.forEach(System.out::println);
    }

    /**
     * @param visitas list of visitas to filter
     * @param site the site used to filter the list
     * @return a list of visitas filtered with the input site
     */
    private static List<Visita> getVisitasBySite (@NotNull List<Visita> visitas,String site){
        if(site != null && !site.isEmpty()){
            return visitas.stream()
                    .filter(visita -> visita.getSite().equalsIgnoreCase(site))
                    .collect(Collectors.toList());
        }
        return null;
    }

}
