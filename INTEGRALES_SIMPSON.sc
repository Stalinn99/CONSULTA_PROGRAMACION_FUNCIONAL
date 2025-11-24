extension (a: Double) {
  def integrateSimpsons(b: Double, f: Double => Double): Double = {
    val x_mitad = (a + b) / 2.0
    val fa = f(a)
    val fx_mitad = f(x_mitad)
    val fb = f(b)
    val simpson_sum = fa + 4 * fx_mitad + fb
    (b - a) * (simpson_sum / 6.0)
  }
}
// CALCULO DE ERROR
def calculoError(esperado: Double, obtenido: Double): Double = {
  Math.abs(esperado - obtenido)
}
//USO
def f1(x:Double) : Double = - (x * x) + 8 * x - 12
val a1 : Double = 3.0
val b1 : Double = 5.0
val valorIntegral: Double = a1.integrateSimpsons(b1, f1)
val error: Double = calculoError(22 / 3, valorIntegral)

def f2(x:Double) : Double = 3*x*x
val a2 : Double = 0
val b2 : Double = 2
val valor2: Double = a2.integrateSimpsons(b2, f2)
val error2: Double = calculoError(8, valor2)

def f3(x:Double) : Double = x + 2*x*x - x*x*x + 5*x*x*x*x
val a3: Double = -1
val b3: Double = 1
val valor3 : Double = a3.integrateSimpsons(b3,f3)
val error3 : Double= calculoError(3.333 ,valor3)

def f4(x:Double) : Double = (2*x + 1)/(x*x + x)
val a4 :Double = 1
val b4 :Double = 2
val valor4 :Double = a4.integrateSimpsons(b4,f4)
val error4 :Double = calculoError(1.09861,valor4)

def f5(x:Double):Double = Math.pow(Math.E,x)
val a5 : Double = 0
val b5 : Double = 1
val valor5: Double = a5.integrateSimpsons(b5, f5)
val error5: Double = calculoError(1.71828, valor5)

def f6(x:Double) : Double = 1/(Math.sqrt(x-1))
val a6 : Double = 2
val b6 : Double = 3
val valor6:Double = a6.integrateSimpsons(b6,f6)
val erro6 : Double = calculoError(0.828427,valor6)

def f7(x:Double):Double = 1 / (1 + x*x)
val a7 : Double = 0
val b7 : Double = 1
val valor7 :Double = a7.integrateSimpsons(b7,f7)
val error7 : Double = calculoError(0.785398,valor7)