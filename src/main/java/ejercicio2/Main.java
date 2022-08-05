package ejercicio2;

import org.assertj.core.util.Lists;

import java.util.List;

/**
 * TODO 6.	Uno de nuestros clientes quiere comprar 6 estantes para su nuevo almacén. Tenemos 3 soluciones:
 *
 * A,B,C
 *
 * Implementa la clase Main del package ejercicio2 en el mismo proyecto que genere todas las posibles combinaciones (permutaciones) y genera un listado de
 * strings con cada una de ellas:
 *
 * Ej: ["AAAAAA","AAAAAB”, …, “AABBCC”,…]
 *
 */
public class Main {

    public static void main(String[] args) {
        printProductCombinations();
    }

    /**
     *
     *  I thought we were talking about combinations more than permutations because we have 6 spaces to fill.
     *  We would have had a permutation if we had all the possible combinations of 3 elements in 3 spaces to fill.
     *
     *  Expected result: 3^6 = 729 records
     */
    private static void printProductCombinations() {
        String[] products = {"A", "B", "C"};

        List<String> combinationList = Lists.newArrayList();

        int prodLength  = 3;
        int a, b, c, d, e, f; // indexes for each character of the string to compose

        //we fill each position with all the possibile values
        for (a = 0; a < prodLength ; a++) {
            for (b = 0; b < prodLength ; b++) {
                for (c = 0; c < prodLength ; c++) {
                    for (d = 0; d < prodLength ; d++) {
                        for (e = 0; e < prodLength ; e++) {
                            for (f = 0; f < prodLength ; f++) {
                                String composedString = products[a] + products[b] + products[c] + products[d] + products[e] + products[f];
                                combinationList.add(composedString);
                            }
                        }
                    }
                }
            }
        }

        combinationList.forEach(System.out::println);
        System.out.println("\nList length:" + combinationList.size());
    }


}
