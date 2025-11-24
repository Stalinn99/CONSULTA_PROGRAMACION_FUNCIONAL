## CONSULTA DE PROGRAMACION FUNCIONAL
### INTEGRACION POR REGLA DE SIMPSON
*** 
### 1.  Criterio para realizar el código

    - El tipo de dato que devolverá la función integracion

        El tipo de dato que nos va a devolver la función de integración va a ser un Double (valor numérico real)

    - ¿Cuáles son los parámetros que recibe la función?

        Los parámetros que va a recibir la función "integranteSimpsons" son 3:

        "a" (Double) es el límite inferior

        "b" (Double) es el límite superior
    
        "f" (Double => Double) es la función dada
    
    - Elaborar una función que determine el error en el cálculo, de la siguiente manera : 

<p style="text-align:center;">|valor esperado - valorObtenido|</p> 

***
### 2. Código de scala que integra por regla de simpson:

El siguiente código ha sido generado por ia generativa con el siguiente pront: 

### "Dada la regla de simpson 1/3 dame un código en Scala de manera funcion usando .map .sum y funciones de orden superior, no utilices funciones curried, usa la funcion extension para utilizar la misma funcion para diferentes integrales definidas"
~~~
    extension (a: Double) {
        def integrateSimpsons(b: Double, f: Double => Double): Double = {
            val x_mitad:Double = (a + b) / 2.0
            val fa:Double = f(a)
            val fx_mitad:Double = f(x_mitad)
            val fb:Double = f(b)
            val simpson_sum:Double = fa + 4 * fx_mitad + fb
            (b - a) * (simpson_sum / 6.0)
  }
}
~~~
***
### 3. Explicación del código en Scala 

El código nos va a dar una aproximación a la integral dada pero hay que tener en cuenta que solo es exacta para ecuaciones de grado 3 (x^3) 

` extension (a: Double) ` Declara que los métodos dentro del bloque se añaden a la clase Double, la 'a' va a ser referencia al objeto Double que se va a llamar sobre el mismo método en este caso va a ser el límite inferior

#### *¿Por qué usamos primero el límite inferior y no el límmite superior?*

Porque se considera el punto de partida del cálculo de la integral

***

`def integrateSimpsons(b: Double, f: Double => Double): Double`

Aquí se define el nuevo método:

`b : Double` va a ser el límite superior de la función

`f : Double => Double` esto va a referirse a la función a integrar ya que como se puede observar tiene la 'flecha' que caractriza una funcion dentro de Scala

`: Double` es el tipo de dato que va a devolver la funcion "integrateSimpsons"

***

`val x_mitad = (a + b) / 2.0 ` es el valor medio a calcular dentro de la formula

`val fa = f(a)` es la evaluación de la fución e 'a' Ej: f(x) = x^2 ; a = 5 Entonces f(a) = x^2 sustituyendo 'a' f(5) = 5^2 = 25
    
`val fb = f(b)` es la evaluación de la fución e 'b' Ej: f(x) = x^2 ; b = 4 Entonces f(b) = x^2 sustituyendo 'a' f(4) = 4^2 = 16

`val simpson_sum = fa + 4 * fx_mitad + fb` calcula la suma en los 3 puntos de la integral

`(b - a) * (simpson_sum / 6.0)` multiplica la suma por el ancho del intervalo dividido por 6 y nos da como resultado la integral aproximada
***
### 4.  Uso del código 

`def f1(x:Double) : Double = - (x * x) + 8 * x - 12` definimos la funcion a integrar

`val a1 : Double = 3.0`definimos el límite inferior

`val b1 : Double = 5.0` definimos el límite superior

`val valorIntegral: Double = a1.integrateSimpsons(b1, f1)` en una variable inmutable de tipo : Double colocamos el resultado de la integral aproximada

***
### 5.  Cálculo de error 

Para calcular el error implementamos una función en scala que nos permita encontrar
~~~
def calculoError(esperado: Double, obtenido: Double): Double = {
  Math.abs(esperado - obtenido)
}
~~~

Para "usar" la función del cálculo de error simplemente le mandamos los paramétros que son el valor esperado (calculado anteiormente) y el valor dado por Scala en nuestro código
