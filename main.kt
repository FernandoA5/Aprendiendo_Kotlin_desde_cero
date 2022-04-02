const val PI = 3.14159265
fun main()
{

    //INTRODUCCIÖN
    //var variable_mutable: Int= 15
    //val variable_inmutable: Int = 14
    //TIPOS DE DATOS
    //val booleano = true
    //val numeroLong = 3L
    //val doble: Double = 2.7182
    //val flotante = 1.2f

    //CONDICIONALES
    val nombre ="Maria"
    if(nombre.isNotEmpty())
    {
        println("El largo de la variable es: ${nombre.length}")
    }
    else{
        println("Error: La variable está vacía")
    }
    val mensaje :String = if(nombre.length > 4) {"Tu nombre es largo"} 
    else if(nombre.isEmpty()) {"No tienes nombre"} 
    else {"Tu nombre es corto"} 
    println(mensaje)
}
