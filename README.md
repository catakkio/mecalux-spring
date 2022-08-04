Prueba GD
Backend

- Spring Exercises:
1. Implementar un singleton (com.mecalux.service.SingletonHelper) que proporcione a su vez un método que devuelva un id Random. // DONE
2. Implementa los Tests unitarios de la clase TesteableTest.java. Tienes las librerías de JUnit y Mockito en el proyecto, pero puedes usar lo que consideres oportuno. // DONE
3. Utilizar anotaciones JPA para modelar las entidades del package com.mecalux.model //DONE
4. Propón los métodos necesarios (no hace falta implementar el cuerpo del método) con Spring MVC (o como consideres oportuno) para montar una API REST de la entidad com.mecalux.model.User en la clase UserController.java //DONE
5. La clase com.mecalux.service.NeedHelpServiceImpl.java es difícil de testear y está muy acoplada a otras clases, ¿cómo resolverías este problema? Impleméntalo o propón una solución teórica.
     
- Java Exercises:

Ejercicio 1: Tenemos como input un listado desordenado de Visitas que se han recibido por la aplicación y nos han pedido la siguiente información:


1a - ¿Cuántas visitas agrupadas por site se han recibido en total? 

1b - ¿Cuántas visitas agrupadas por site se han recibido desde 2016 en adelante?

1c - Saca el listado de Visitas sólo de la site de España ordenado por fecha de creación ascendente y, en caso de empate, por id de forma descendente
      

- Ejercicio 2. Uno de nuestros clientes quiere comprar 6 estantes para su nuevo almacén. 

2a - Tenemos 3 soluciones:
       A,B,C
       Implementa la clase Main del package ejercicio2 en el mismo proyecto que genere todas las posibles combinaciones (permutaciones) y genera un listado de strings con cada una de ellas:
       Ej: ["AAAAAA","AAAAAB”, …, “AABBCC”,…]
